package com.developer.albert.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgMachupicchu;
    private ImageView imgPlazaArmas;
    private ImageView imgPisac;
    private ImageView imgMoray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgMachupicchu = (ImageView) findViewById(R.id.imgMachupicchu);
        imgPlazaArmas = (ImageView) findViewById(R.id.imgPlazaArmas);
        imgPisac = (ImageView) findViewById(R.id.imgPisac);
        imgMoray = (ImageView) findViewById(R.id.imgMoray);


        imgMachupicchu.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double latitud = -13.163068068195967;
                double longitud = -72.54504203796387;
                Ubicar(latitud,longitud,"Machupicchu");
            }
        });
        imgPlazaArmas.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double latitud = -13.516742352566387;
                double longitud = -71.97882771492004;
                Ubicar(latitud,longitud,"Plaza de Armas Cusco");
            }
        });
        imgPisac.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                double latitud = -13.41441710834668;
                double longitud = -71.84380531311035;
                Ubicar(latitud,longitud,"Pisac");
            }
        });
        imgMoray.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                double latitud = -13.329827877338785;
                double longitud = -72.19717025756836;
                Ubicar(latitud,longitud,"Moray");
            }
        });
    }

    public void Ubicar(double latitud, double longitud, String lugar)
    {
        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra("latitud",latitud);
        intent.putExtra("longitud",longitud);
        intent.putExtra("lugar",lugar);
        startActivity(intent);

    }
}
