package com.example.user.ankieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.security.PrivateKey;

public class PytanieTrzydziesteDrugie extends AppCompatActivity {

    Button button_pyt32;
    RadioGroup radio_group_pyt32, radio_group_pyt33;
    RadioButton radio_pyt32, radio_pyt33;
    EditText edit_textPyt32, edit_textPyt33;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trzydzieste_drugie_pytanie);
        onClickListenerButton ();
        edit_textPyt32 = (EditText)findViewById(R.id.edit_textPyt32);
        edit_textPyt33 = (EditText)findViewById(R.id.edit_textPyt33);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerButton (){
        button_pyt32 = (Button)findViewById(R.id.button_pyt32);
        radio_group_pyt32 = (RadioGroup)findViewById(R.id.radio_group_pyt32);
        radio_group_pyt33 = (RadioGroup)findViewById(R.id.radio_group_pyt33);

        button_pyt32.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pyt32.getCheckedRadioButtonId();
                            radio_pyt32 = (RadioButton)findViewById(selected_id);
                            int selected_id2 = radio_group_pyt33.getCheckedRadioButtonId();
                            radio_pyt33 = (RadioButton)findViewById(selected_id2);

                            boolean isIsnerted = myDb.UpadatePytanieTrzydziesteDrugie(radio_pyt32.getText().toString(), edit_textPyt32.getText().toString(), radio_pyt33.getText().toString(), edit_textPyt33.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieTrzydziesteDrugie.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieTrzydziesteDrugie.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.Metryczka");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieTrzydziesteDrugie.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
