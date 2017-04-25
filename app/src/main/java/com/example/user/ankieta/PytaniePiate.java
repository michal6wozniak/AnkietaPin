package com.example.user.ankieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PytaniePiate extends AppCompatActivity {

    Button button_pyt5;
    RadioGroup radio_group_pyt5;
    RadioButton radio_pyt5;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piate_pytanie);
        onClickListenerButton ();
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerButton (){
        button_pyt5 = (Button)findViewById(R.id.button_pyt5);
        radio_group_pyt5 = (RadioGroup)findViewById(R.id.radio_group_pyt5);

        button_pyt5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pyt5.getCheckedRadioButtonId();
                            radio_pyt5 = (RadioButton)findViewById(selected_id);

                            boolean isIsnerted = myDb.UpadatePytaniePiate(radio_pyt5.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytaniePiate.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytaniePiate.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieSzoste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytaniePiate.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}

