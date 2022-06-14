package com.jvillacorta.cargarimagendesdeurlpicasso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class MainActivity extends AppCompatActivity {

    ImageView ivImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImagen = findViewById(R.id.ivImagenURL);
        picasso(ivImagen);

    }

    private void picasso(ImageView iv){
        Picasso.get()
                .load("https://raw.githubusercontent.com/junevig/upn-semana02/main/imagenes/cod_mobile.jpg")
                .error(R.mipmap.ic_launcher_round)
                .into(iv);
    }
}