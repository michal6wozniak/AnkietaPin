package com.example.user.ankieta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 2017-03-28.
 */

public class PytanieJedenaste extends AppCompatActivity {

    Button button_pyt11;
    CheckBox checkboxPyt11OdpA, checkboxPyt11OdpB, checkboxPyt11OdpC, checkboxPyt11OdpD, checkboxPyt11OdpE, checkboxPyt11OdpF;
    TextView edit_textPyt11;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jedenaste_pytanie);
        onClickListeneButton();
        edit_textPyt11 = (EditText)findViewById(R.id.edit_textPyt11);
        myDb = new DatabaseHelper(this);
    }
    public void onClickListeneButton (){
        button_pyt11 = (Button)findViewById(R.id.button_pyt11);
        checkboxPyt11OdpA = (CheckBox)findViewById(R.id.checkboxPyt11OdpA);
        checkboxPyt11OdpB = (CheckBox)findViewById(R.id.checkboxPyt11OdpB);
        checkboxPyt11OdpC = (CheckBox)findViewById(R.id.checkboxPyt11OdpC);
        checkboxPyt11OdpD = (CheckBox)findViewById(R.id.checkboxPyt11OdpD);
        checkboxPyt11OdpE = (CheckBox)findViewById(R.id.checkboxPyt11OdpE);
        checkboxPyt11OdpF = (CheckBox)findViewById(R.id.checkboxPyt11OdpF);

        button_pyt11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            String answerA, answerB, answerC, answerD, answerE, answerF;

                            if (checkboxPyt11OdpA.isChecked() == true) {
                                answerA = checkboxPyt11OdpA.getText().toString() + ";";
                            }
                            else answerA = "";

                            if (checkboxPyt11OdpB.isChecked() == true) {
                                answerB = checkboxPyt11OdpB.getText().toString() + ";";
                            }
                            else answerB = "";

                            if (checkboxPyt11OdpC.isChecked() == true) {
                                answerC = checkboxPyt11OdpC.getText().toString() + ";";
                            }
                            else answerC = "";

                            if (checkboxPyt11OdpD.isChecked() == true) {
                                answerD = checkboxPyt11OdpD.getText().toString() + ";";
                            }
                            else answerD = "";

                            if (checkboxPyt11OdpE.isChecked() == true) {
                                answerE = checkboxPyt11OdpE.getText().toString() + ";";
                            }
                            else answerE = "";

                            if (checkboxPyt11OdpF.isChecked() == true) {
                                answerF = checkboxPyt11OdpF.getText().toString() + ";";
                            }
                            else answerF = "";

                            StringBuffer result = new StringBuffer();
                            result.append(answerA);
                            result.append(answerB);
                            result.append(answerC);
                            result.append(answerD);
                            result.append(answerE);
                            result.append(answerF);

                            boolean isIsnerted = myDb.UpadatePytanieJedenaste(result.toString(), edit_textPyt11.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieJedenaste.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieJedenaste.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieDwunaste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieJedenaste.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

}