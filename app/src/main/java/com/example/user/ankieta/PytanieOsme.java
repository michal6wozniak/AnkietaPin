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

public class PytanieOsme extends AppCompatActivity {

    String spinnerPyt8;
    Spinner spiner;
    ArrayAdapter<CharSequence> adapter;
    Button button_pyt8;
    RadioGroup radio_group_pyt8;
    RadioButton radio_pyt8;
    EditText edit_textPyt8;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.osme_pytanie);
        onClickSpinner ();
        onClickListeneButton ();
        edit_textPyt8 = (EditText)findViewById(R.id.edit_textPyt8);
        myDb = new DatabaseHelper(this);
    }

    public void onClickSpinner (){

        spiner = (Spinner)findViewById(R.id.spinnerPyt9);
        adapter = ArrayAdapter.createFromResource(this, R.array.nazwy_zakwaterowania, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spiner.setAdapter(adapter);
        spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinnerPyt8 = new String(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onClickListeneButton (){
        button_pyt8 = (Button)findViewById(R.id.button_pyt8);
        radio_group_pyt8 = (RadioGroup)findViewById(R.id.radio_group_pyt8);

        button_pyt8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pyt8.getCheckedRadioButtonId();
                            radio_pyt8 = (RadioButton)findViewById(selected_id);

                            boolean isIsnerted = myDb.UpadatePytanieOsme(radio_pyt8.getText().toString(), edit_textPyt8.getText().toString(), spinnerPyt8);

                            if (isIsnerted == true)
                                Toast.makeText(PytanieOsme.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieOsme.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieDziesiate");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieOsme.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}