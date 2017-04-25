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

public class PytanieOsiemnaste extends AppCompatActivity {

    Button button_pyt18;
    CheckBox checkboxPyt18OdpA, checkboxPyt18OdpB, checkboxPyt18OdpC, checkboxPyt18OdpD, checkboxPyt18OdpE, checkboxPyt18OdpF, checkboxPyt18OdpG;
    TextView edit_textPyt18;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.osiemnaste_pytanie);
        onClickListeneButton();
        edit_textPyt18 = (EditText)findViewById(R.id.edit_textPyt18);
        myDb = new DatabaseHelper(this);
    }
    public void onClickListeneButton (){
        button_pyt18 = (Button)findViewById(R.id.button_pyt18);
        checkboxPyt18OdpA = (CheckBox)findViewById(R.id.checkboxPyt18OdpA);
        checkboxPyt18OdpB = (CheckBox)findViewById(R.id.checkboxPyt18OdpB);
        checkboxPyt18OdpC = (CheckBox)findViewById(R.id.checkboxPyt18OdpC);
        checkboxPyt18OdpD = (CheckBox)findViewById(R.id.checkboxPyt18OdpD);
        checkboxPyt18OdpE = (CheckBox)findViewById(R.id.checkboxPyt18OdpE);
        checkboxPyt18OdpF = (CheckBox)findViewById(R.id.checkboxPyt18OdpF);
        checkboxPyt18OdpG = (CheckBox)findViewById(R.id.checkboxPyt18OdpG);

        button_pyt18.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{
                            String answerA, answerB, answerC, answerD, answerE, answerF, answerG;

                            if (checkboxPyt18OdpA.isChecked() == true) {
                                answerA = checkboxPyt18OdpA.getText().toString() + ";";
                            } else answerA = "";

                            if (checkboxPyt18OdpB.isChecked() == true) {
                                answerB = checkboxPyt18OdpB.getText().toString() + ";";
                            } else answerB = "";

                            if (checkboxPyt18OdpC.isChecked() == true) {
                                answerC = checkboxPyt18OdpC.getText().toString() + ";";
                            } else answerC = "";

                            if (checkboxPyt18OdpD.isChecked() == true) {
                                answerD = checkboxPyt18OdpD.getText().toString() + ";";
                            } else answerD = "";

                            if (checkboxPyt18OdpE.isChecked() == true) {
                                answerE = checkboxPyt18OdpE.getText().toString() + ";";
                            } else answerE = "";

                            if (checkboxPyt18OdpF.isChecked() == true) {
                                answerF = checkboxPyt18OdpF.getText().toString() + ";";
                            } else answerF = "";

                            if (checkboxPyt18OdpG.isChecked() == true) {
                                answerG = checkboxPyt18OdpG.getText().toString() + ";";
                            } else answerG = "";

                            StringBuffer result = new StringBuffer();
                            result.append(answerA);
                            result.append(answerB);
                            result.append(answerC);
                            result.append(answerD);
                            result.append(answerE);
                            result.append(answerF);
                            result.append(answerG);

                            boolean isIsnerted = myDb.UpadatePytanieOsiemnaste(result.toString(), edit_textPyt18.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieOsiemnaste.this, "Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieOsiemnaste.this, "Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieDziewietnaste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieOsiemnaste.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

}

