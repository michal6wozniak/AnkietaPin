package com.example.user.ankieta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 2017-03-28.
 */

public class PytanieDwudziesteTrzecie extends AppCompatActivity {

    private static TextView text_viewA, text_viewB, text_viewC;
    private static SeekBar seek_barA, seek_barB, seek_barC;
    Button button_pyt23;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwudzieste_trzecie_pytanie);
        myDb = new DatabaseHelper(this);
        onClickListeneButton();
        seek_barA();
        seek_barB();
        seek_barC();

    }

    public void onClickListeneButton (){
        button_pyt23 = (Button)findViewById(R.id.button_pyt23);

        button_pyt23.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            boolean isIsnerted = myDb.UpadatePytanieDwudziesteTrzecie(text_viewA.getText().toString().substring(0,1),
                                    text_viewB.getText().toString().substring(0,1), text_viewC.getText().toString().substring(0,1));

                            if (isIsnerted == true)
                                Toast.makeText(PytanieDwudziesteTrzecie.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieDwudziesteTrzecie.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieDwudziesteSzoste");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDwudziesteTrzecie.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

    public void seek_barA(){
        seek_barA = (SeekBar)findViewById(R.id.seekBarPyt23OdpA);
        text_viewA = (TextView)findViewById(R.id.textViewPyt23A);

        text_viewA.setText(seek_barA.getProgress() + " / "+ seek_barA.getMax());
        seek_barA.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewA.setText(progress + " / "+ seek_barA.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewA.setText(progress_value + " / "+ seek_barA.getMax());
                    }
                }

        );
    }

    public void seek_barB(){
        seek_barB = (SeekBar)findViewById(R.id.seekBarPyt23OdpB);
        text_viewB = (TextView)findViewById(R.id.textViewPyt23B);

        text_viewB.setText(seek_barB.getProgress() + " / "+ seek_barB.getMax());
        seek_barB.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewB.setText(progress + " / "+ seek_barB.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewB.setText(progress_value + " / "+ seek_barB.getMax());
                    }
                }

        );
    }

    public void seek_barC(){
        seek_barC = (SeekBar)findViewById(R.id.seekBarPyt23OdpC);
        text_viewC = (TextView)findViewById(R.id.textViewPyt23C);

        text_viewC.setText(seek_barC.getProgress() + " / "+ seek_barC.getMax());
        seek_barC.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewC.setText(progress + " / "+ seek_barC.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewC.setText(progress_value + " / "+ seek_barC.getMax());
                    }
                }

        );
    }
}