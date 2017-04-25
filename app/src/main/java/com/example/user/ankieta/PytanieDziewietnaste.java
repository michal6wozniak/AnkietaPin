package com.example.user.ankieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;

public class PytanieDziewietnaste extends AppCompatActivity {

    Button button_pyt19;
    CheckBox checkboxPyt19OdpA, checkboxPyt19OdpB, checkboxPyt19OdpC, checkboxPyt19OdpD, checkboxPyt19OdpE, checkboxPyt19OdpF, checkboxPyt19OdpG, checkboxPyt19OdpH, checkboxPyt19OdpI, checkboxPyt19OdpJ;
    TextView edit_textPyt19;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dziewietnaste_pytanie);
        onClickListeneButton();
        edit_textPyt19 = (EditText)findViewById(R.id.edit_textPyt19);
        myDb = new DatabaseHelper(this);
    }
    public void onClickListeneButton (){
        button_pyt19 = (Button)findViewById(R.id.button_pyt19);
        checkboxPyt19OdpA = (CheckBox)findViewById(R.id.checkboxPyt19OdpA);
        checkboxPyt19OdpB = (CheckBox)findViewById(R.id.checkboxPyt19OdpB);
        checkboxPyt19OdpC = (CheckBox)findViewById(R.id.checkboxPyt19OdpC);
        checkboxPyt19OdpD = (CheckBox)findViewById(R.id.checkboxPyt19OdpD);
        checkboxPyt19OdpE = (CheckBox)findViewById(R.id.checkboxPyt19OdpE);
        checkboxPyt19OdpF = (CheckBox)findViewById(R.id.checkboxPyt19OdpF);
        checkboxPyt19OdpG = (CheckBox)findViewById(R.id.checkboxPyt19OdpG);
        checkboxPyt19OdpH = (CheckBox)findViewById(R.id.checkboxPyt19OdpH);
        checkboxPyt19OdpI = (CheckBox)findViewById(R.id.checkboxPyt19OdpI);
        checkboxPyt19OdpJ = (CheckBox)findViewById(R.id.checkboxPyt19OdpJ);

        button_pyt19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            String answerA, answerB, answerC, answerD, answerE, answerF, answerG, answerH, answerI, answerJ;

                            if (checkboxPyt19OdpA.isChecked() == true) {
                                answerA = checkboxPyt19OdpA.getText().toString() + ";";
                            }
                            else answerA = "";

                            if (checkboxPyt19OdpB.isChecked() == true) {
                                answerB = checkboxPyt19OdpB.getText().toString() + ";";
                            }
                            else answerB = "";

                            if (checkboxPyt19OdpC.isChecked() == true) {
                                answerC = checkboxPyt19OdpC.getText().toString() + ";";
                            }
                            else answerC = "";

                            if (checkboxPyt19OdpD.isChecked() == true) {
                                answerD = checkboxPyt19OdpD.getText().toString() + ";";
                            }
                            else answerD = "";

                            if (checkboxPyt19OdpE.isChecked() == true) {
                                answerE = checkboxPyt19OdpE.getText().toString() + ";";
                            }
                            else answerE = "";

                            if (checkboxPyt19OdpF.isChecked() == true) {
                                answerF = checkboxPyt19OdpF.getText().toString() + ";";
                            }
                            else answerF = "";

                            if (checkboxPyt19OdpG.isChecked() == true) {
                                answerG = checkboxPyt19OdpG.getText().toString() + ";";
                            }
                            else answerG = "";

                            if (checkboxPyt19OdpH.isChecked() == true) {
                                answerH = checkboxPyt19OdpH.getText().toString() + ";";
                            }
                            else answerH = "";

                            if (checkboxPyt19OdpI.isChecked() == true) {
                                answerI = checkboxPyt19OdpI.getText().toString() + ";";
                            }
                            else answerI = "";

                            if (checkboxPyt19OdpJ.isChecked() == true) {
                                answerJ = checkboxPyt19OdpJ.getText().toString() + ";";
                            }
                            else answerJ = "";


                            StringBuffer result = new StringBuffer();
                            result.append(answerA);
                            result.append(answerB);
                            result.append(answerC);
                            result.append(answerD);
                            result.append(answerE);
                            result.append(answerF);
                            result.append(answerG);
                            result.append(answerH);
                            result.append(answerI);
                            result.append(answerJ);

                            boolean isIsnerted = myDb.UpadatePytanieDziewietnaste(result.toString(), edit_textPyt19.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieDziewietnaste.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieDziewietnaste.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieDwudzieste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDziewietnaste.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}

