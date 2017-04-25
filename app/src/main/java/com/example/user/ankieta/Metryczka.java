package com.example.user.ankieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Metryczka extends AppCompatActivity {
    Button button_metryczka;
    RadioGroup radio_group_pytM1, radio_group_pytM3, radio_group_pytM4, radio_group_pytM5;
    RadioButton radio_M1, radio_M3, radio_M4, radio_M5;
    EditText edit_textM2;
    DatabaseHelper myDb;
    Integer edit_textM2_value_int;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metryczka);
        onClickListenerButton ();
        edit_textM2 = (EditText)findViewById(R.id.edit_textM2);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerButton (){
        button_metryczka = (Button)findViewById(R.id.button_metryczka);
        radio_group_pytM1 = (RadioGroup)findViewById(R.id.radio_group_pytM1);
        radio_group_pytM3 = (RadioGroup)findViewById(R.id.radio_group_pytM3);
        radio_group_pytM4 = (RadioGroup)findViewById(R.id.radio_group_pytM4);
        radio_group_pytM5 = (RadioGroup)findViewById(R.id.radio_group_pytM5);


        button_metryczka.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pytM1.getCheckedRadioButtonId();
                            radio_M1 = (RadioButton)findViewById(selected_id);
                            int selected_id2 = radio_group_pytM3.getCheckedRadioButtonId();
                            radio_M3 = (RadioButton)findViewById(selected_id2);
                            int selected_id3 = radio_group_pytM4.getCheckedRadioButtonId();
                            radio_M4 = (RadioButton)findViewById(selected_id3);
                            int selected_id4 = radio_group_pytM5.getCheckedRadioButtonId();
                            radio_M5 = (RadioButton)findViewById(selected_id4);

                            Time now = new Time();
                            now.setToNow();

                            edit_textM2_value_int = Integer.parseInt(edit_textM2.getText().toString());

                            if (edit_textM2_value_int >= 1900)
                            {
                                boolean isIsnerted = myDb.UpadateMetryczka(radio_M1.getText().toString(), edit_textM2_value_int.toString(),
                                        radio_M3.getText().toString(), radio_M4.getText().toString(), radio_M5.getText().toString(),
                                        now.toString().substring(9,15));

                                if (isIsnerted == true)
                                    Toast.makeText(Metryczka.this,"Dane dodane", Toast.LENGTH_LONG).show();
                                else
                                    Toast.makeText(Metryczka.this,"Dane nie dodane", Toast.LENGTH_LONG).show();


                                Intent intent = new Intent(Metryczka.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(Metryczka.this,"Wiek musi być liczbą wyższą niż 1900", Toast.LENGTH_LONG).show();
                            }
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(Metryczka.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
