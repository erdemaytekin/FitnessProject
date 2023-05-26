package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox kahvalti,ogleYemegi,aksamYemegi;
    EditText dilimEkmek;
    CheckBox muz,elma,portakal,dana,tavuk,kasar,beyazPeynir,ceviz,findik,pasta,cikolata,kola,sogukCay;
    Button ekle,yenile;
    TextView deneme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kahvalti = findViewById(R.id.kahvalti);
        ogleYemegi = findViewById(R.id.ogle_yemegi);
        aksamYemegi = findViewById(R.id.aksam_yemegi);
        dilimEkmek = findViewById(R.id.dilim_ekmek);
        ekle = findViewById(R.id.ekle_button);
        yenile = findViewById(R.id.yenile_button);
        deneme = findViewById(R.id.deneme);

        muz = findViewById(R.id.erik);
        elma = findViewById(R.id.elma);
        portakal = findViewById(R.id.Mandalina);
        dana = findViewById(R.id.dana);
        tavuk = findViewById(R.id.tavuk);
        kasar = findViewById(R.id.peynir);
        beyazPeynir = findViewById(R.id.salam);
        ceviz = findViewById(R.id.ceviz);
        findik = findViewById(R.id.findik);
        pasta = findViewById(R.id.makarna);
        cikolata = findViewById(R.id.cikolata);
        kola = findViewById(R.id.sprite);
        sogukCay = findViewById(R.id.soguk_cay);

        final int[] kahvalti2 = {0};
        final int[] ogleYemegi2 = { 0 };
        final int[] aksamYemegi2 = { 0 };


        ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int toplamCalori = 0;
                int ekmek;

                deneme.setText("Kahvaltı: "+String.valueOf(kahvalti2[0])+"\nÖğle yemeği: "+String.valueOf(ogleYemegi2[0])+"\nAkşam Yemeği: "+String.valueOf(aksamYemegi2[0]));


                ekmek = 69 * Integer.parseInt(dilimEkmek.getText().toString());
                toplamCalori += ekmek;

                if (muz.isChecked()) {
                    toplamCalori += 85;
                }
                if (elma.isChecked()) {
                    toplamCalori += 58;
                }
                if (portakal.isChecked()) {
                    toplamCalori += 49;
                }
                if (dana.isChecked()) {
                    toplamCalori += 223;
                }
                if (tavuk.isChecked()) {
                    toplamCalori += 215;
                }
                if (kasar.isChecked()) {
                    toplamCalori += 404;
                }
                if (beyazPeynir.isChecked()) {
                    toplamCalori += 289;
                }
                if (ceviz.isChecked()) {
                    toplamCalori += 651;
                }
                if (findik.isChecked()) {
                    toplamCalori += 634;
                }
                if (pasta.isChecked()) {
                    toplamCalori += 431;
                }
                if (cikolata.isChecked()) {
                    toplamCalori += 106;
                }
                if (kola.isChecked()) {
                    toplamCalori += 118;
                }
                if (sogukCay.isChecked()) {
                    toplamCalori += 60;
                }

                if (kahvalti.isChecked()) {
                    kahvalti2[0] = toplamCalori;
                }
                if (ogleYemegi.isChecked()) {
                    ogleYemegi2[0] = toplamCalori;
                }
                if (aksamYemegi.isChecked()) {
                    aksamYemegi2[0] = toplamCalori;
                }

                deneme.setText("Kahvaltı: "+String.valueOf(kahvalti2[0])+"\nÖğle yemeği: "+String.valueOf(ogleYemegi2[0])+"\nAkşam Yemeği: "+String.valueOf(aksamYemegi2[0]));


            }
        });

        yenile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}