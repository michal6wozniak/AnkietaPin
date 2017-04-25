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

public class PytanieDwudziestePierwsze extends AppCompatActivity {

    Button button_pyt21;
    RadioGroup radio_group_pyt21;
    RadioButton radio_pyt21;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwudzieste_pierwsze_pytanie);
        onClickListeneButton();
        myDb = new DatabaseHelper(this);
    }

    public void onClickListeneButton (){
        button_pyt21 = (Button)findViewById(R.id.button_pyt21);
        radio_group_pyt21 = (RadioGroup)findViewById(R.id.radio_group_pyt21);

        button_pyt21.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pyt21.getCheckedRadioButtonId();
                            radio_pyt21 = (RadioButton)findViewById(selected_id);

                            boolean isIsnerted = myDb.UpadatePytanieDwudziestePierwsze(radio_pyt21.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieDwudziestePierwsze.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieDwudziestePierwsze.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieDwudziesteDrugie");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDwudziestePierwsze.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

}
