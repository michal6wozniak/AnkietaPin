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
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 2017-03-28.
 */

public class PytaniePietnaste extends AppCompatActivity {
    String spinnerPyt15;
    Button button_pyt15;
    CheckBox checkboxPyt15OdpA, checkboxPyt15OdpB, checkboxPyt15OdpC, checkboxPyt15OdpD, checkboxPyt15OdpE, checkboxPyt15OdpF, checkboxPyt15OdpG, checkboxPyt15OdpH, checkboxPyt15OdpI, checkboxPyt15OdpJ;
    TextView edit_textPyt15;
    Spinner spiner;
    ArrayAdapter<CharSequence> adapter;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pietnaste_pytanie);
        onClickSpinner();
        onClickListeneButton();
        edit_textPyt15 = (EditText)findViewById(R.id.edit_textPyt15);
        myDb = new DatabaseHelper(this);
    }

    public void  onClickSpinner() {
        spiner = (Spinner) findViewById(R.id.spinnerPyt15);
        adapter = ArrayAdapter.createFromResource(this, R.array.nazwy_glownego_celu, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spiner.setAdapter(adapter);
        spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinnerPyt15 = new String(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onClickListeneButton (){
        button_pyt15 = (Button)findViewById(R.id.button_pyt15);
        checkboxPyt15OdpA = (CheckBox)findViewById(R.id.checkboxPyt15OdpA);
        checkboxPyt15OdpB = (CheckBox)findViewById(R.id.checkboxPyt15OdpB);
        checkboxPyt15OdpC = (CheckBox)findViewById(R.id.checkboxPyt15OdpC);
        checkboxPyt15OdpD = (CheckBox)findViewById(R.id.checkboxPyt15OdpD);
        checkboxPyt15OdpE = (CheckBox)findViewById(R.id.checkboxPyt15OdpE);
        checkboxPyt15OdpF = (CheckBox)findViewById(R.id.checkboxPyt15OdpF);
        checkboxPyt15OdpG = (CheckBox)findViewById(R.id.checkboxPyt15OdpG);
        checkboxPyt15OdpH = (CheckBox)findViewById(R.id.checkboxPyt15OdpH);
        checkboxPyt15OdpI = (CheckBox)findViewById(R.id.checkboxPyt15OdpI);
        checkboxPyt15OdpJ = (CheckBox)findViewById(R.id.checkboxPyt15OdpJ);

        button_pyt15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            String answerA, answerB, answerC, answerD, answerE, answerF, answerG, answerH, answerI, answerJ;

                            if (checkboxPyt15OdpA.isChecked() == true) {
                                answerA = checkboxPyt15OdpA.getText().toString() + ";";
                            }
                            else answerA = "";

                            if (checkboxPyt15OdpB.isChecked() == true) {
                                answerB = checkboxPyt15OdpB.getText().toString() + ";";
                            }
                            else answerB = "";

                            if (checkboxPyt15OdpC.isChecked() == true) {
                                answerC = checkboxPyt15OdpC.getText().toString() + ";";
                            }
                            else answerC = "";

                            if (checkboxPyt15OdpD.isChecked() == true) {
                                answerD = checkboxPyt15OdpD.getText().toString() + ";";
                            }
                            else answerD = "";

                            if (checkboxPyt15OdpE.isChecked() == true) {
                                answerE = checkboxPyt15OdpE.getText().toString() + ";";
                            }
                            else answerE = "";

                            if (checkboxPyt15OdpF.isChecked() == true) {
                                answerF = checkboxPyt15OdpF.getText().toString() + ";";
                            }
                            else answerF = "";

                            if (checkboxPyt15OdpG.isChecked() == true) {
                                answerG = checkboxPyt15OdpG.getText().toString() + ";";
                            }
                            else answerG = "";

                            if (checkboxPyt15OdpH.isChecked() == true) {
                                answerH = checkboxPyt15OdpH.getText().toString() + ";";
                            }
                            else answerH = "";

                            if (checkboxPyt15OdpI.isChecked() == true) {
                                answerI = checkboxPyt15OdpI.getText().toString() + ";";
                            }
                            else answerI = "";

                            if (checkboxPyt15OdpJ.isChecked() == true) {
                                answerJ = checkboxPyt15OdpJ.getText().toString() + ";";
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

                            boolean isIsnerted = myDb.UpadatePytaniePietnaste(result.toString(), edit_textPyt15.getText().toString(), spinnerPyt15);

                            if (isIsnerted == true)
                                Toast.makeText(PytaniePietnaste.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytaniePietnaste.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieSiedemnaste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytaniePietnaste.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}