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

public class PytanieSiodme extends AppCompatActivity {

    Button button_pyt7;
    RadioGroup radio_group_pyt7;
    RadioButton radio_pyt7;
    EditText edit_textPyt7;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.siodme_pytanie);
        onClickListenerRadioButton ();
        edit_textPyt7 = (EditText)findViewById(R.id.edit_textPyt7);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerRadioButton (){
        radio_group_pyt7 = (RadioGroup)findViewById(R.id.radio_group_pyt7);
        button_pyt7 = (Button)findViewById(R.id.button_pyt7);

        button_pyt7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            int selected_id = radio_group_pyt7.getCheckedRadioButtonId();
                            radio_pyt7 = (RadioButton)findViewById(selected_id);

                            if (selected_id == R.id.radio_pyt7OdpA || selected_id == R.id.radio_pyt7OdpB)
                            {
                                boolean isIsnerted = myDb.UpadatePytanieSiodme(radio_pyt7.getText().toString(), edit_textPyt7.getText().toString());

                                if (isIsnerted == true)
                                    Toast.makeText(PytanieSiodme.this,"Dane dodane", Toast.LENGTH_LONG).show();
                                else
                                    Toast.makeText(PytanieSiodme.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                                Intent intent = new Intent("com.example.user.ankieta.PytanieDziesiate");
                                startActivity(intent);
                            }
                            else if (selected_id == R.id.radio_pyt7OdpD || selected_id == R.id.radio_pyt7OdpC)
                            {
                                boolean isIsnerted = myDb.UpadatePytanieSiodme(radio_pyt7.getText().toString(), edit_textPyt7.getText().toString());

                                if (isIsnerted == true)
                                    Toast.makeText(PytanieSiodme.this,"Dane dodane", Toast.LENGTH_LONG).show();
                                else
                                    Toast.makeText(PytanieSiodme.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                                Intent intent = new Intent("com.example.user.ankieta.PytanieOsme");
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(PytanieSiodme.this, radio_pyt7.getText().toString(),Toast.LENGTH_SHORT).show();
                            }
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieSiodme.this, "Nie zaznaczono wszystkich odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}