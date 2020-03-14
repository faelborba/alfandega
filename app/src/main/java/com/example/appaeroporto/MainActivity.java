package com.example.appaeroporto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imagem;
    TextView texto;
    Animation aparece;
    Animation some;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = findViewById(R.id.minhaImagem);
        texto = findViewById(R.id.meuTexto);

        texto.setText("Toque para continuar.");

        aparece = new AlphaAnimation(0, 1);
        some = new AlphaAnimation(1, 0);

        aparece.setDuration(500);
        some.setDuration(500);
    }
    public void clicouTela(View view){

        imagem.setScaleX(-1f);
        //imagem.startAnimation(some);
        if(Math.random()<0.5){
            texto.setText("Siga Para Esquerda.");
            imagem.setScaleX(1f);
        }else{
            texto.setText("Siga Para Direita.");
            imagem.setScaleX(-1f);
        }
        imagem.startAnimation(aparece);
    }
}
