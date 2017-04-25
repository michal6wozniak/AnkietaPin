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

public class PytanieSiedemnaste extends AppCompatActivity {

    Button button_pyt17;
    RadioGroup radio_group_pyt17;
    RadioButton radio_pyt17;
    EditText edit_textPyt17;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.siedemnaste_pytanie);
        onClickListenerButton ();
        edit_textPyt17 = (EditText)findViewById(R.id.edit_textPyt17);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerButton (){
        button_pyt17 = (Button)findViewById(R.id.button_pyt17);
        radio_group_pyt17 = (RadioGroup)findViewById(R.id.radio_group_pyt17);

        button_pyt17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pyt17.getCheckedRadioButtonId();
                            radio_pyt17 = (RadioButton)findViewById(selected_id);

                            boolean isIsnerted = myDb.UpadatePytanieSiedemnaste(radio_pyt17.getText().toString(), edit_textPyt17.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieSiedemnaste.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieSiedemnaste.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieOsiemnaste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieSiedemnaste.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}

