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

public class PytanieDwunaste extends AppCompatActivity {

    Button button_pyt12;
    EditText edit_textPyt12;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwunaste_pytanie);
        onClickListenerButton();
        edit_textPyt12 = (EditText)findViewById(R.id.edit_textPyt12);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerButton (){
        button_pyt12 = (Button)findViewById(R.id.button_pyt12);
        button_pyt12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            boolean isIsnerted = myDb.UpadatePytanieDwunaste(edit_textPyt12.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieDwunaste.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieDwunaste.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieTrzynaste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDwunaste.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}