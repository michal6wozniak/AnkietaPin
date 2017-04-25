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

public class PytanieTrzecie extends AppCompatActivity {

    Button button_pyt3;
    EditText edit_textPyt3odpA;
    EditText edit_textPyt3odpB;
    EditText edit_textPyt3odpC;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trzecie_pytanie);
        onClickListenerButton ();
        edit_textPyt3odpA = (EditText)findViewById(R.id.edit_textPyt3odpA);
        edit_textPyt3odpB = (EditText)findViewById(R.id.edit_textPyt3odpB);
        edit_textPyt3odpC = (EditText)findViewById(R.id.edit_textPyt3odpC);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerButton (){
        button_pyt3 = (Button)findViewById(R.id.button_pyt3);
        button_pyt3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            boolean isIsnerted = myDb.UpadatePytanieTrzecie(edit_textPyt3odpA.getText().toString(), edit_textPyt3odpB.getText().toString(), edit_textPyt3odpC.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieTrzecie.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieTrzecie.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieSzoste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieTrzecie.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
