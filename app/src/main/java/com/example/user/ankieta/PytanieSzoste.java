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

public class PytanieSzoste extends AppCompatActivity {

    Button button_pyt6;
    RadioGroup radio_group_pyt6;
    RadioButton radio_pyt6;
    EditText edit_textPyt6;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.szoste_pytanie);
        onClickListenerButton ();
        edit_textPyt6 = (EditText)findViewById(R.id.edit_textPyt6);
        myDb = new DatabaseHelper(this);
    }

    public void onClickListenerButton (){
        button_pyt6 = (Button)findViewById(R.id.button_pyt6);
        radio_group_pyt6 = (RadioGroup)findViewById(R.id.radio_group_pyt6);

        button_pyt6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pyt6.getCheckedRadioButtonId();
                            radio_pyt6 = (RadioButton)findViewById(selected_id);

                            boolean isIsnerted = myDb.UpadatePytanieSzoste(radio_pyt6.getText().toString(), edit_textPyt6.getText().toString());

                            if (isIsnerted == true)
                                Toast.makeText(PytanieSzoste.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieSzoste.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieSiodme");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieSzoste.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}