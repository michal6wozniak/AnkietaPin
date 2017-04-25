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

public class MainActivity extends AppCompatActivity {

    Button button_pyt0;
    EditText edit_textInicjaly;
    RadioGroup radio_group_pyt_miejsce;
    RadioGroup radio_group_pyt_jezyk;
    RadioButton radio_button_pyt_miejsce;
    RadioButton radio_button_pyt_jezyk;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);
        button_pyt0 = (Button)findViewById(R.id.button_pyt0);
        edit_textInicjaly = (EditText)findViewById(R.id.edit_textinicjaly);
        radio_group_pyt_miejsce = (RadioGroup)findViewById(R.id.radio_group_pyt_miejsce);
        radio_group_pyt_jezyk = (RadioGroup)findViewById(R.id.radio_group_pyt_jezyk);
        onClickListenerRadioButton ();

    }

    public void onClickListenerRadioButton (){

        button_pyt0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            int selected_id = radio_group_pyt_miejsce.getCheckedRadioButtonId();
                            radio_button_pyt_miejsce = (RadioButton)findViewById(selected_id);
                            int selected_id2 = radio_group_pyt_jezyk.getCheckedRadioButtonId();
                            radio_button_pyt_jezyk = (RadioButton)findViewById(selected_id2);

                            boolean isIsnerted = myDb.insertDataManiActivity(edit_textInicjaly.getText().toString(), radio_button_pyt_miejsce.getText().toString(), radio_button_pyt_jezyk.getText().toString());


                            if (isIsnerted == true)
                                Toast.makeText(MainActivity.this, "Dane dodane", Toast.LENGTH_SHORT).show();
                            else
                                Toast.makeText(MainActivity.this, "Dane nie dodane", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytaniePierwsze");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(MainActivity.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}

