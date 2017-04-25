package com.example.user.ankieta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by user on 2017-03-28.
 */

public class PytanieDziesiate extends AppCompatActivity {

    Button button_pyt10;
    RadioGroup radio_group_pyt10;
    RadioButton radio_pyt10;
    EditText edit_textPyt10;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dziesiate_pytanie);
        onClickListenerButton ();
        edit_textPyt10 = (EditText)findViewById(R.id.edit_textPyt10);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerButton (){
        button_pyt10 = (Button)findViewById(R.id.button_pyt10);
        radio_group_pyt10 = (RadioGroup)findViewById(R.id.radio_group_pyt10);

        button_pyt10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pyt10.getCheckedRadioButtonId();
                            radio_pyt10 = (RadioButton)findViewById(selected_id);

                            boolean isIsnerted = myDb.UpadatePytanieDziesiate(radio_pyt10.getText().toString(), edit_textPyt10.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieDziesiate.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieDziesiate.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            if (edit_textPyt10.getText().toString().toLowerCase().contains("gda")) {
                                Intent intent = new Intent("com.example.user.ankieta.PytanieJedenaste");
                                startActivity(intent);
                            } else {
                                Intent intent = new Intent("com.example.user.ankieta.PytanieDwunaste");
                                startActivity(intent);
                            }
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDziesiate.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
/*TODO po znalezieniu Gdańsk ma przenosić do 11 pytania*/