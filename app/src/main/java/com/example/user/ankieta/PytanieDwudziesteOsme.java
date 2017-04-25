package com.example.user.ankieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PytanieDwudziesteOsme extends AppCompatActivity {

    RadioGroup radio_group_pyt28;
    RadioButton radio_pyt28;
    Button button_pyt28;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwudzieste_osme_pytanie);
        onClickListenerRadioButton ();
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerRadioButton (){
        radio_group_pyt28 = (RadioGroup)findViewById(R.id.radio_group_pyt28);
        button_pyt28 = (Button)findViewById(R.id.button_pyt28);

        button_pyt28.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            int selected_id = radio_group_pyt28.getCheckedRadioButtonId();
                            radio_pyt28 = (RadioButton)findViewById(selected_id);

                            boolean isIsnerted = myDb.UpadatePytanieDwudziesteOsme(radio_pyt28.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieDwudziesteOsme.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieDwudziesteOsme.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            if (selected_id == R.id.radio_pyt28OdpA)
                            {
                                Intent intent = new Intent("com.example.user.ankieta.PytanieDwudziesteDziewiate");
                                startActivity(intent);
                            }
                            else if (selected_id == R.id.radio_pyt28OdpB)
                            {
                                Intent intent = new Intent("com.example.user.ankieta.PytanieTrzydziesteDrugie");
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(PytanieDwudziesteOsme.this, radio_pyt28.getText().toString(),Toast.LENGTH_SHORT).show();
                            }
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDwudziesteOsme.this, "Nie zaznaczono wszystkich odpowiedzi",Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );
    }
}