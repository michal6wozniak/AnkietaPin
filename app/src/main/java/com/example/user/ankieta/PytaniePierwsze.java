package com.example.user.ankieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class PytaniePierwsze extends AppCompatActivity {

    private static RadioGroup radio_group_pyt1;
    private static RadioButton radio_pyt1;
    private static Button button_pyt1;
    DatePicker datePicker;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pierwsze_pytanie);
        onClickListenerRadioButton ();
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerRadioButton (){
        radio_group_pyt1 = (RadioGroup)findViewById(R.id.radio_group_pyt1);
        button_pyt1 = (Button)findViewById(R.id.button_pyt1);


        button_pyt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            int selected_id = radio_group_pyt1.getCheckedRadioButtonId();
                            radio_pyt1 = (RadioButton)findViewById(selected_id);
                            datePicker = (DatePicker) findViewById(R.id.timePicker);

                            int   day  = datePicker.getDayOfMonth();
                            int   month= datePicker.getMonth()+1;
                            int   year = datePicker.getYear();
                            final String date = day+"-"+month+"-"+year;

                            Time now = new Time();
                            now.setToNow();

                            boolean isIsnerted = myDb.UpadatePytaniePierwsze(radio_pyt1.getText().toString(), date, now.toString().substring(9,15));

                            if (isIsnerted == true)
                                Toast.makeText(PytaniePierwsze.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytaniePierwsze.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            if (selected_id == R.id.radio_pyt1OdpA)
                            {
                                Intent intent = new Intent("com.example.user.ankieta.PytanieTrzecie");
                                startActivity(intent);
                            }
                            else if (selected_id == R.id.radio_pyt1OdpB)
                            {
                                Intent intent = new Intent("com.example.user.ankieta.PytanieCzwarteA");
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(PytaniePierwsze.this, radio_pyt1.getText().toString(),Toast.LENGTH_SHORT).show();
                            }
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytaniePierwsze.this, "Wszystkie odpowiedzi nie zostały zaznaczone",Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );
    }
}