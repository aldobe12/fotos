package comi.example.lucas.mifoto01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FotoActivity extends AppCompatActivity {
    ImageView imgView;
    Button btnFoto;
    Button btnGalleria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        imgView = (ImageView) findViewById(R.id.imageView);
        btnFoto = (Button) findViewById(R.id.tomarCamara);
        btnGalleria = (Button) findViewById(R.id.tomarGaleria);

    btnFoto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });
    }

    public void TomarFoto(View vista){


    }

    public void TomarGalleria (View vista){

    }



}
