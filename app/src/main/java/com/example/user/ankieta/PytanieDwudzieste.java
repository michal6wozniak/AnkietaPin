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

public class PytanieDwudzieste extends AppCompatActivity {

    Button button_pyt20;
    CheckBox checkboxPyt20OdpA, checkboxPyt20OdpB, checkboxPyt20OdpC, checkboxPyt20OdpD, checkboxPyt20OdpE, checkboxPyt20OdpF,
            checkboxPyt20OdpG, checkboxPyt20OdpH, checkboxPyt20OdpI, checkboxPyt20OdpJ, checkboxPyt20OdpK, checkboxPyt20OdpL,
            checkboxPyt20OdpM, checkboxPyt20OdpN, checkboxPyt20OdpO, checkboxPyt20OdpP, checkboxPyt20OdpR, checkboxPyt20OdpS,
            checkboxPyt20OdpT, checkboxPyt20OdpU, checkboxPyt20OdpW;
    TextView edit_textPyt20;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwudzieste_pytanie);
        onClickListeneButton();
        edit_textPyt20 = (EditText)findViewById(R.id.edit_textPyt20);
        myDb = new DatabaseHelper(this);
    }
    public void onClickListeneButton (){
        button_pyt20 = (Button)findViewById(R.id.button_pyt20);
        checkboxPyt20OdpA = (CheckBox)findViewById(R.id.checkboxPyt20OdpA);
        checkboxPyt20OdpB = (CheckBox)findViewById(R.id.checkboxPyt20OdpB);
        checkboxPyt20OdpC = (CheckBox)findViewById(R.id.checkboxPyt20OdpC);
        checkboxPyt20OdpD = (CheckBox)findViewById(R.id.checkboxPyt20OdpD);
        checkboxPyt20OdpE = (CheckBox)findViewById(R.id.checkboxPyt20OdpE);
        checkboxPyt20OdpF = (CheckBox)findViewById(R.id.checkboxPyt20OdpF);
        checkboxPyt20OdpG = (CheckBox)findViewById(R.id.checkboxPyt20OdpG);
        checkboxPyt20OdpH = (CheckBox)findViewById(R.id.checkboxPyt20OdpH);
        checkboxPyt20OdpI = (CheckBox)findViewById(R.id.checkboxPyt20OdpI);
        checkboxPyt20OdpJ = (CheckBox)findViewById(R.id.checkboxPyt20OdpJ);
        checkboxPyt20OdpK = (CheckBox)findViewById(R.id.checkboxPyt20OdpK);
        checkboxPyt20OdpL = (CheckBox)findViewById(R.id.checkboxPyt20OdpL);
        checkboxPyt20OdpM = (CheckBox)findViewById(R.id.checkboxPyt20OdpM);
        checkboxPyt20OdpN = (CheckBox)findViewById(R.id.checkboxPyt20OdpN);
        checkboxPyt20OdpO = (CheckBox)findViewById(R.id.checkboxPyt20OdpO);
        checkboxPyt20OdpP = (CheckBox)findViewById(R.id.checkboxPyt20OdpP);
        checkboxPyt20OdpR = (CheckBox)findViewById(R.id.checkboxPyt20OdpR);
        checkboxPyt20OdpS = (CheckBox)findViewById(R.id.checkboxPyt20OdpS);
        checkboxPyt20OdpT = (CheckBox)findViewById(R.id.checkboxPyt20OdpT);
        checkboxPyt20OdpU = (CheckBox)findViewById(R.id.checkboxPyt20OdpU);
        checkboxPyt20OdpW = (CheckBox)findViewById(R.id.checkboxPyt20OdpW);

        button_pyt20.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            String answerA, answerB, answerC, answerD, answerE, answerF, answerG, answerH, answerI, answerJ,
                                    answerK, answerL, answerM, answerN, answerO, answerP, answerR, answerS, answerT, answerU, answerW;

                            if (checkboxPyt20OdpA.isChecked() == true) {
                                answerA = checkboxPyt20OdpA.getText().toString() + ";";
                            }
                            else answerA = "";

                            if (checkboxPyt20OdpB.isChecked() == true) {
                                answerB = checkboxPyt20OdpB.getText().toString() + ";";
                            }
                            else answerB = "";

                            if (checkboxPyt20OdpC.isChecked() == true) {
                                answerC = checkboxPyt20OdpC.getText().toString() + ";";
                            }
                            else answerC = "";

                            if (checkboxPyt20OdpD.isChecked() == true) {
                                answerD = checkboxPyt20OdpD.getText().toString() + ";";
                            }
                            else answerD = "";

                            if (checkboxPyt20OdpE.isChecked() == true) {
                                answerE = checkboxPyt20OdpE.getText().toString() + ";";
                            }
                            else answerE = "";

                            if (checkboxPyt20OdpF.isChecked() == true) {
                                answerF = checkboxPyt20OdpF.getText().toString() + ";";
                            }
                            else answerF = "";

                            if (checkboxPyt20OdpG.isChecked() == true) {
                                answerG = checkboxPyt20OdpG.getText().toString() + ";";
                            }
                            else answerG = "";

                            if (checkboxPyt20OdpH.isChecked() == true) {
                                answerH = checkboxPyt20OdpH.getText().toString() + ";";
                            }
                            else answerH = "";

                            if (checkboxPyt20OdpI.isChecked() == true) {
                                answerI = checkboxPyt20OdpI.getText().toString() + ";";
                            }
                            else answerI = "";

                            if (checkboxPyt20OdpJ.isChecked() == true) {
                                answerJ = checkboxPyt20OdpJ.getText().toString() + ";";
                            }
                            else answerJ = "";

                            if (checkboxPyt20OdpK.isChecked() == true) {
                                answerK = checkboxPyt20OdpK.getText().toString() + ";";
                            }
                            else answerK = "";

                            if (checkboxPyt20OdpL.isChecked() == true) {
                                answerL = checkboxPyt20OdpL.getText().toString() + ";";
                            }
                            else answerL = "";

                            if (checkboxPyt20OdpM.isChecked() == true) {
                                answerM = checkboxPyt20OdpM.getText().toString() + ";";
                            }
                            else answerM = "";

                            if (checkboxPyt20OdpN.isChecked() == true) {
                                answerN = checkboxPyt20OdpN.getText().toString() + ";";
                            }
                            else answerN = "";

                            if (checkboxPyt20OdpO.isChecked() == true) {
                                answerO = checkboxPyt20OdpO.getText().toString() + ";";
                            }
                            else answerO = "";

                            if (checkboxPyt20OdpP.isChecked() == true) {
                                answerP = checkboxPyt20OdpP.getText().toString() + ";";
                            }
                            else answerP = "";

                            if (checkboxPyt20OdpR.isChecked() == true) {
                                answerR = checkboxPyt20OdpR.getText().toString() + ";";
                            }
                            else answerR = "";

                            if (checkboxPyt20OdpS.isChecked() == true) {
                                answerS = checkboxPyt20OdpS.getText().toString() + ";";
                            }
                            else answerS = "";

                            if (checkboxPyt20OdpT.isChecked() == true) {
                                answerT = checkboxPyt20OdpT.getText().toString() + ";";
                            }
                            else answerT = "";

                            if (checkboxPyt20OdpU.isChecked() == true) {
                                answerU = checkboxPyt20OdpU.getText().toString() + ";";
                            }
                            else answerU = "";

                            if (checkboxPyt20OdpW.isChecked() == true) {
                                answerW = checkboxPyt20OdpW.getText().toString() + ";";
                            }
                            else answerW = "";


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
                            result.append(answerK);
                            result.append(answerL);
                            result.append(answerM);
                            result.append(answerN);
                            result.append(answerO);
                            result.append(answerP);
                            result.append(answerR);
                            result.append(answerS);
                            result.append(answerT);
                            result.append(answerU);
                            result.append(answerW);

                            boolean isIsnerted = myDb.UpadatePytanieDwudzieste(result.toString(), edit_textPyt20.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieDwudzieste.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieDwudzieste.this,"Dane nie dodane", Toast.LENGTH_LONG).show();


                            Intent intent = new Intent("com.example.user.ankieta.PytanieDwudziestePierwsze");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDwudzieste.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

}