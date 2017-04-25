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

public class PytanieCzternaste extends AppCompatActivity {

    Button button_pyt14;
    RadioGroup radio_group_pyt14;
    RadioButton radio_pyt14;
    EditText edit_textPyt14;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.czternaste_pytanie);
        onClickListenerButton ();
        edit_textPyt14 = (EditText)findViewById(R.id.edit_textPyt14);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerButton (){
        button_pyt14 = (Button)findViewById(R.id.button_pyt14);
        radio_group_pyt14 = (RadioGroup)findViewById(R.id.radio_group_pyt14);

        button_pyt14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pyt14.getCheckedRadioButtonId();
                            radio_pyt14 = (RadioButton)findViewById(selected_id);

                            boolean isIsnerted = myDb.UpadatePytanieCzternaste(radio_pyt14.getText().toString(), edit_textPyt14.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieCzternaste.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieCzternaste.this,"Dane nie dodane", Toast.LENGTH_LONG).show();



                            Intent intent = new Intent("com.example.user.ankieta.PytaniePietnaste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieCzternaste.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
