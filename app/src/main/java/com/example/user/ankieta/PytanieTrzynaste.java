package com.example.user.ankieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PytanieTrzynaste extends AppCompatActivity {

    RadioGroup radio_group_pyt13;
    RadioButton radio_pyt13;
    Button button_pyt13;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trzynaste_pytanie);
        onClickListenerRadioButton ();
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerRadioButton (){
        radio_group_pyt13 = (RadioGroup)findViewById(R.id.radio_group_pyt13);
        button_pyt13 = (Button)findViewById(R.id.button_pyt13);

        button_pyt13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            int selected_id = radio_group_pyt13.getCheckedRadioButtonId();
                            radio_pyt13 = (RadioButton)findViewById(selected_id);

                            boolean isIsnerted = myDb.UpadatePytanieTrzynaste(radio_pyt13.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieTrzynaste.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieTrzynaste.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            if (selected_id == R.id.radio_pyt13OdpA)
                            {
                                Intent intent = new Intent("com.example.user.ankieta.PytanieCzternaste");
                                startActivity(intent);
                            }
                            else if (selected_id == R.id.radio_pyt13OdpB)
                            {
                                Intent intent = new Intent("com.example.user.ankieta.PytaniePietnaste");
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(PytanieTrzynaste.this, radio_pyt13.getText().toString(),Toast.LENGTH_SHORT).show();
                            }
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieTrzynaste.this, "Nie zaznaczono wszystkich odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}

