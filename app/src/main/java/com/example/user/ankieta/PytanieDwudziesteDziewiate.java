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
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;

public class PytanieDwudziesteDziewiate extends AppCompatActivity {

    Button button_pyt29;
    CheckBox checkboxPyt29OdpA, checkboxPyt29OdpB, checkboxPyt29OdpC, checkboxPyt29OdpD, checkboxPyt29OdpE, checkboxPyt29OdpF;
    private static TextView text_viewA;
    private static SeekBar seek_barA;
    TextView edit_textPyt29, edit_textPyt31;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwudzieste_dziewiate_pytanie);
        onClickListeneButton();
        edit_textPyt29 = (EditText)findViewById(R.id.edit_textPyt29);
        edit_textPyt31 = (EditText)findViewById(R.id.edit_textPyt31);
        myDb = new DatabaseHelper(this);
        seek_barA();
    }

    public void onClickListeneButton (){
        button_pyt29 = (Button)findViewById(R.id.button_pyt29);
        checkboxPyt29OdpA = (CheckBox)findViewById(R.id.checkboxPyt29OdpA);
        checkboxPyt29OdpB = (CheckBox)findViewById(R.id.checkboxPyt29OdpB);
        checkboxPyt29OdpC = (CheckBox)findViewById(R.id.checkboxPyt29OdpC);
        checkboxPyt29OdpD = (CheckBox)findViewById(R.id.checkboxPyt29OdpD);
        checkboxPyt29OdpE = (CheckBox)findViewById(R.id.checkboxPyt29OdpE);
        checkboxPyt29OdpF = (CheckBox)findViewById(R.id.checkboxPyt29OdpF);

        button_pyt29.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        String answerA, answerB, answerC, answerD, answerE, answerF;

                        if (checkboxPyt29OdpA.isChecked() == true) {
                            answerA = checkboxPyt29OdpA.getText().toString() + ";";
                        }
                        else answerA = "";

                        if (checkboxPyt29OdpB.isChecked() == true) {
                            answerB = checkboxPyt29OdpB.getText().toString() + ";";
                        }
                        else answerB = "";

                        if (checkboxPyt29OdpC.isChecked() == true) {
                            answerC = checkboxPyt29OdpC.getText().toString() + ";";
                        }
                        else answerC = "";

                        if (checkboxPyt29OdpD.isChecked() == true) {
                            answerD = checkboxPyt29OdpD.getText().toString() + ";";
                        }
                        else answerD = "";

                        if (checkboxPyt29OdpE.isChecked() == true) {
                            answerE = checkboxPyt29OdpE.getText().toString() + ";";
                        }
                        else answerE = "";

                        if (checkboxPyt29OdpF.isChecked() == true) {
                            answerF = checkboxPyt29OdpF.getText().toString() + ";";
                        }
                        else answerF = "";

                        StringBuffer result = new StringBuffer();
                        result.append(answerA);
                        result.append(answerB);
                        result.append(answerC);
                        result.append(answerD);
                        result.append(answerE);
                        result.append(answerF);

                        boolean isIsnerted = myDb.UpadatePytanieDwudziesteDziewiate(result.toString(), edit_textPyt29.getText().toString(), text_viewA.getText().toString().substring(0,1), edit_textPyt31.getText().toString());

                        if (isIsnerted == true)
                            Toast.makeText(PytanieDwudziesteDziewiate.this,"Dane dodane", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(PytanieDwudziesteDziewiate.this,"Dane nie dodane", Toast.LENGTH_LONG).show();


                        try {
                            Intent intent = new Intent("com.example.user.ankieta.PytanieTrzydziesteDrugie");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDwudziesteDziewiate.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

    public void seek_barA(){
        seek_barA = (SeekBar)findViewById(R.id.seekBarPyt30OdpA);
        text_viewA = (TextView)findViewById(R.id.textViewPyt30A);

        text_viewA.setText(seek_barA.getProgress() + " / "+ seek_barA.getMax());
        seek_barA.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewA.setText(progress + " / "+ seek_barA.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewA.setText(progress_value + " / "+ seek_barA.getMax());
                    }
                }

        );
    }
}