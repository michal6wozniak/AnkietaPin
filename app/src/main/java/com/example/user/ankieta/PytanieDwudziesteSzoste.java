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

public class PytanieDwudziesteSzoste extends AppCompatActivity {

    Button button_pyt26;
    CheckBox checkboxPyt26OdpA, checkboxPyt26OdpB, checkboxPyt26OdpC, checkboxPyt26OdpD, checkboxPyt26OdpE, checkboxPyt26OdpF, checkboxPyt26OdpG, checkboxPyt26OdpH;
    TextView edit_textPyt26;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwudzieste_szoste_pytanie);
        onClickListeneButton();
        edit_textPyt26 = (EditText)findViewById(R.id.edit_textPyt26);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListeneButton (){
        button_pyt26 = (Button)findViewById(R.id.button_pyt26);
        checkboxPyt26OdpA = (CheckBox)findViewById(R.id.checkboxPyt26OdpA);
        checkboxPyt26OdpB = (CheckBox)findViewById(R.id.checkboxPyt26OdpB);
        checkboxPyt26OdpC = (CheckBox)findViewById(R.id.checkboxPyt26OdpC);
        checkboxPyt26OdpD = (CheckBox)findViewById(R.id.checkboxPyt26OdpD);
        checkboxPyt26OdpE = (CheckBox)findViewById(R.id.checkboxPyt26OdpE);
        checkboxPyt26OdpF = (CheckBox)findViewById(R.id.checkboxPyt26OdpF);
        checkboxPyt26OdpG = (CheckBox)findViewById(R.id.checkboxPyt26OdpG);
        checkboxPyt26OdpH = (CheckBox)findViewById(R.id.checkboxPyt26OdpH);

        button_pyt26.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            String answerA, answerB, answerC, answerD, answerE, answerF, answerG, answerH;

                            if (checkboxPyt26OdpA.isChecked() == true) {
                                answerA = checkboxPyt26OdpA.getText().toString() + ";";
                            }
                            else answerA = "";

                            if (checkboxPyt26OdpB.isChecked() == true) {
                                answerB = checkboxPyt26OdpB.getText().toString() + ";";
                            }
                            else answerB = "";

                            if (checkboxPyt26OdpC.isChecked() == true) {
                                answerC = checkboxPyt26OdpC.getText().toString() + ";";
                            }
                            else answerC = "";

                            if (checkboxPyt26OdpD.isChecked() == true) {
                                answerD = checkboxPyt26OdpD.getText().toString() + ";";
                            }
                            else answerD = "";

                            if (checkboxPyt26OdpE.isChecked() == true) {
                                answerE = checkboxPyt26OdpE.getText().toString() + ";";
                            }
                            else answerE = "";

                            if (checkboxPyt26OdpF.isChecked() == true) {
                                answerF = checkboxPyt26OdpF.getText().toString() + ";";
                            }
                            else answerF = "";

                            if (checkboxPyt26OdpG.isChecked() == true) {
                                answerG = checkboxPyt26OdpG.getText().toString() + ";";
                            }
                            else answerG = "";

                            if (checkboxPyt26OdpH.isChecked() == true) {
                                answerH = checkboxPyt26OdpH.getText().toString() + ";";
                            }
                            else answerH = "";

                            StringBuffer result = new StringBuffer();
                            result.append(answerA);
                            result.append(answerB);
                            result.append(answerC);
                            result.append(answerD);
                            result.append(answerE);
                            result.append(answerF);
                            result.append(answerG);
                            result.append(answerH);

                            boolean isIsnerted = myDb.UpadatePytanieDwudziesteSzoste(result.toString(), edit_textPyt26.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieDwudziesteSzoste.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieDwudziesteSzoste.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieDwudziesteSiodme");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDwudziesteSzoste.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

}