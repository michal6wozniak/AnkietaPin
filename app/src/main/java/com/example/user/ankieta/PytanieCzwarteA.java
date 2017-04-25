package com.example.user.ankieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PytanieCzwarteA extends AppCompatActivity {

    RadioGroup radio_group_pyt4a;
    RadioButton radio_pyt4a;
    Button button_pyt4a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.czwarte_pytanie_cz_a);
        onClickListenerRadioButton ();
    }

    public void onClickListenerRadioButton (){
        radio_group_pyt4a = (RadioGroup)findViewById(R.id.radio_group_pyt4a);
        button_pyt4a = (Button)findViewById(R.id.button_pyt4a);

        button_pyt4a.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            int selected_id = radio_group_pyt4a.getCheckedRadioButtonId();
                            radio_pyt4a = (RadioButton)findViewById(selected_id);

                            if (selected_id == R.id.radio_pyt4OdpA)
                            {
                                Intent intent = new Intent("com.example.user.ankieta.PytanieCzwarteB");
                                startActivity(intent);
                            }
                            else if (selected_id == R.id.radio_pyt4OdpB)
                            {
                                Intent intent = new Intent("com.example.user.ankieta.PytanieCzwarteC");
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(PytanieCzwarteA.this, radio_pyt4a.getText().toString(),Toast.LENGTH_SHORT).show();
                            }
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieCzwarteA.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );
    }

}
