package com.example.user.ankieta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by user on 2017-03-28.
 */

public class PytanieCzwarteB extends AppCompatActivity {

    String spinnerPyt4B;
    Spinner spiner;
    ArrayAdapter<CharSequence> adapter;
    private static Button button_pyt4b;
    EditText edit_textPyt4bOdpB;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.czwarte_pytanie_cz_b);
        SpinnerListener();
        onClickListenerRadioButton ();
        edit_textPyt4bOdpB = (EditText)findViewById(R.id.edit_textPyt4bOdpB);
        myDb = new DatabaseHelper(this);
    }

    public void SpinnerListener(){
        spiner = (Spinner)findViewById(R.id.spinnerPyt4b);
        adapter = ArrayAdapter.createFromResource(this, R.array.nazwy_wojewodztw, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spiner.setAdapter(adapter);
        spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinnerPyt4B = new String(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onClickListenerRadioButton (){
        button_pyt4b = (Button)findViewById(R.id.button_pyt4b);
        button_pyt4b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){

                        boolean isIsnerted = myDb.UpadatePytanieCzwarteB(edit_textPyt4bOdpB.getText().toString(), spinnerPyt4B);

                        if (isIsnerted == true)
                            Toast.makeText(PytanieCzwarteB.this,"Dane dodane", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(PytanieCzwarteB.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                        try {
                            Intent intent = new Intent("com.example.user.ankieta.PytanieSzoste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieCzwarteB.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
