package com.example.user.ankieta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 2017-03-28.
 */

public class PytanieDwudziesteDrugie extends AppCompatActivity {


    SeekBar seek_barA, seek_barB, seek_barC, seek_barD, seek_barE, seek_barF, seek_barG, seek_barH, seek_barI, seek_barJ, seek_barK, seek_barL, seek_barM, seek_barN;
    TextView text_viewA, text_viewB, text_viewC, text_viewD, text_viewE, text_viewF, text_viewG, text_viewH, text_viewI, text_viewJ, text_viewK, text_viewL, text_viewM, text_viewN;
    Button button_pyt22;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwudzieste_drugie_pytanie);
        myDb = new DatabaseHelper(this);
        onClickListeneButton();
        seek_barA();
        seek_barB();
        seek_barC();
        seek_barD();
        seek_barE();
        seek_barF();
        seek_barG();
        seek_barH();
        seek_barI();
        seek_barJ();
        seek_barK();
        seek_barL();
        seek_barM();
        seek_barN();
    }

    public void onClickListeneButton (){
        button_pyt22 = (Button)findViewById(R.id.button_pyt22);

        button_pyt22.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        try {
                            boolean isIsnerted = myDb.UpadatePytanieDwudziesteDrugie(text_viewA.getText().toString().substring(0,1),
                                    text_viewB.getText().toString().substring(0,1), text_viewC.getText().toString().substring(0,1),
                                    text_viewD.getText().toString().substring(0,1), text_viewE.getText().toString().substring(0,1),
                                    text_viewF.getText().toString().substring(0,1), text_viewG.getText().toString().substring(0,1),
                                    text_viewH.getText().toString().substring(0,1), text_viewI.getText().toString().substring(0,1),
                                    text_viewJ.getText().toString().substring(0,1), text_viewK.getText().toString().substring(0,1),
                                    text_viewL.getText().toString().substring(0,1), text_viewM.getText().toString().substring(0,1),
                                    text_viewN.getText().toString().substring(0,1));

                            if (isIsnerted == true)
                                Toast.makeText(PytanieDwudziesteDrugie.this,"Dane dodane", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(PytanieDwudziesteDrugie.this,"Dane nie dodane", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent("com.example.user.ankieta.PytanieDwudziesteTrzecie");
                            startActivity(intent);
                        }
                        catch (Exception e)
                        {
                            Toast.makeText(PytanieDwudziesteDrugie.this, "Nie zostały zaznaczone wszystkie odpowiedzi",Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );
    }

    public void seek_barA(){
        seek_barA = (SeekBar)findViewById(R.id.seekBarPyt22OdpA);
        text_viewA = (TextView)findViewById(R.id.textViewPyt22A);

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
        seek_barB = (SeekBar)findViewById(R.id.seekBarPyt22OdpB);
        text_viewB = (TextView)findViewById(R.id.textViewPyt22B);

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
        seek_barC = (SeekBar)findViewById(R.id.seekBarPyt22OdpC);
        text_viewC = (TextView)findViewById(R.id.textViewPyt22C);

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

    public void seek_barD(){
        seek_barD = (SeekBar)findViewById(R.id.seekBarPyt22OdpD);
        text_viewD = (TextView)findViewById(R.id.textViewPyt22D);

        text_viewD.setText(seek_barD.getProgress() + " / "+ seek_barD.getMax());
        seek_barD.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewD.setText(progress + " / "+ seek_barD.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewD.setText(progress_value + " / "+ seek_barD.getMax());
                    }
                }

        );
    }

    public void seek_barE(){
        seek_barE = (SeekBar)findViewById(R.id.seekBarPyt22OdpE);
        text_viewE = (TextView)findViewById(R.id.textViewPyt22E);

        text_viewE.setText(seek_barE.getProgress() + " / "+ seek_barE.getMax());
        seek_barE.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewE.setText(progress + " / "+ seek_barE.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewE.setText(progress_value + " / "+ seek_barE.getMax());
                    }
                }

        );
    }

    public void seek_barF(){
        seek_barF = (SeekBar)findViewById(R.id.seekBarPyt22OdpF);
        text_viewF = (TextView)findViewById(R.id.textViewPyt22F);

        text_viewF.setText(seek_barF.getProgress() + " / "+ seek_barF.getMax());
        seek_barF.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewF.setText(progress + " / "+ seek_barF.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewF.setText(progress_value + " / "+ seek_barF.getMax());
                    }
                }

        );
    }

    public void seek_barG(){
        seek_barG = (SeekBar)findViewById(R.id.seekBarPyt22OdpG);
        text_viewG = (TextView)findViewById(R.id.textViewPyt22G);

        text_viewG.setText(seek_barG.getProgress() + " / "+ seek_barG.getMax());
        seek_barG.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewG.setText(progress + " / "+ seek_barG.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewG.setText(progress_value + " / "+ seek_barG.getMax());
                    }
                }

        );
    }

    public void seek_barH(){
        seek_barH = (SeekBar)findViewById(R.id.seekBarPyt22OdpH);
        text_viewH = (TextView)findViewById(R.id.textViewPyt22H);

        text_viewH.setText(seek_barH.getProgress() + " / "+ seek_barH.getMax());
        seek_barH.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewH.setText(progress + " / "+ seek_barH.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewH.setText(progress_value + " / "+ seek_barH.getMax());
                    }
                }

        );
    }

    public void seek_barI(){
        seek_barI = (SeekBar)findViewById(R.id.seekBarPyt22OdpI);
        text_viewI = (TextView)findViewById(R.id.textViewPyt22I);

        text_viewI.setText(seek_barI.getProgress() + " / "+ seek_barI.getMax());
        seek_barI.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewI.setText(progress + " / "+ seek_barI.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewI.setText(progress_value + " / "+ seek_barI.getMax());
                    }
                }

        );
    }

    public void seek_barJ(){
        seek_barJ = (SeekBar)findViewById(R.id.seekBarPyt22OdpJ);
        text_viewJ = (TextView)findViewById(R.id.textViewPyt22J);

        text_viewJ.setText(seek_barJ.getProgress() + " / "+ seek_barJ.getMax());
        seek_barJ.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewJ.setText(progress + " / "+ seek_barJ.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewJ.setText(progress_value + " / "+ seek_barJ.getMax());
                    }
                }

        );
    }

    public void seek_barK(){
        seek_barK = (SeekBar)findViewById(R.id.seekBarPyt22OdpK);
        text_viewK = (TextView)findViewById(R.id.textViewPyt22K);

        text_viewK.setText(seek_barK.getProgress() + " / "+ seek_barK.getMax());
        seek_barK.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewK.setText(progress + " / "+ seek_barK.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewK.setText(progress_value + " / "+ seek_barK.getMax());
                    }
                }

        );
    }

    public void seek_barL(){
        seek_barL = (SeekBar)findViewById(R.id.seekBarPyt22OdpL);
        text_viewL = (TextView)findViewById(R.id.textViewPyt22L);

        text_viewL.setText(seek_barL.getProgress() + " / "+ seek_barL.getMax());
        seek_barL.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewL.setText(progress + " / "+ seek_barL.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewL.setText(progress_value + " / "+ seek_barL.getMax());
                    }
                }

        );
    }

    public void seek_barM(){
        seek_barM = (SeekBar)findViewById(R.id.seekBarPyt22OdpM);
        text_viewM = (TextView)findViewById(R.id.textViewPyt22M);

        text_viewM.setText(seek_barM.getProgress() + " / "+ seek_barM.getMax());
        seek_barM.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewM.setText(progress + " / "+ seek_barM.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewM.setText(progress_value + " / "+ seek_barM.getMax());
                    }
                }

        );
    }

    public void seek_barN(){
        seek_barN = (SeekBar)findViewById(R.id.seekBarPyt22OdpN);
        text_viewN = (TextView)findViewById(R.id.textViewPyt22N);

        text_viewN.setText(seek_barN.getProgress() + " / "+ seek_barN.getMax());
        seek_barN.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewN.setText(progress + " / "+ seek_barN.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_viewN.setText(progress_value + " / "+ seek_barN.getMax());
                    }
                }

        );
    }
}