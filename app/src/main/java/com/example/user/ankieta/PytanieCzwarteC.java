package com.example.user.ankieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PytanieCzwarteC extends AppCompatActivity {

    private static Button button_pyt4c;
    EditText edit_textPyt5odpB;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.czwarte_pytanie_cz_c);
        onClickListenerRadioButton ();
        edit_textPyt5odpB = (EditText)findViewById(R.id.edit_textPyt5odpB);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerRadioButton (){
        button_pyt4c = (Button)findViewById(R.id.button_pyt4c);
        button_pyt4c.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            boolean isIsnerted = myDb.UpadatePytanieCzwarteC(edit_textPyt5odpB.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieCzwarteC.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieCzwarteC.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytaniePiate");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieCzwarteC.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}

