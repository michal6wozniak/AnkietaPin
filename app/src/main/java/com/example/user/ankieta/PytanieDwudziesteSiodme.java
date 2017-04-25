package com.example.user.ankieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.security.PrivateKey;

public class PytanieDwudziesteSiodme extends AppCompatActivity {

    Button button_pyt27;
    RadioGroup radio_group_pyt27;
    RadioButton radio_pyt27;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwudzieste_siodme_pytanie);
        onClickListeneButton();
        myDb = new DatabaseHelper(this);
    }

    public void onClickListeneButton (){
        button_pyt27 = (Button)findViewById(R.id.button_pyt27);
        radio_group_pyt27 = (RadioGroup)findViewById(R.id.radio_group_pyt27);

        button_pyt27.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pyt27.getCheckedRadioButtonId();
                            radio_pyt27 = (RadioButton)findViewById(selected_id);

                            boolean isIsnerted = myDb.UpadatePytanieDwudziesteSiodme(radio_pyt27.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieDwudziesteSiodme.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieDwudziesteSiodme.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieDwudziesteOsme");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDwudziesteSiodme.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}

