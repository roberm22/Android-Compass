package es.upm.dit.adsw.compass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean imagenInicial = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiaImagen(View v){
        ImageView foto =(ImageView) findViewById(R.id.imageView);
        if(imagenInicial)
            foto.setImageResource(R.drawable.foto_teleco_a);
        else
            foto.setImageResource(R.drawable.foto_teleco_b);
        imagenInicial = !imagenInicial;
    }
    public void muestraMensaje(View v){
        Toast.makeText(this,"La Escuela decana de Ingeniería de Telecomunicación",Toast.LENGTH_LONG).show();
    }
}
