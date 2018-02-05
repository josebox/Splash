package com.example.jose.spash;

import android.animation.Animator;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    ImageView img ;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        img = (ImageView)findViewById(R.id.imageView);
        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        //fuentes
        Typeface myFont = Typeface.createFromAsset(getAssets(),"American Captain.ttf");
        //Typeface myFont2 = Typeface.createFromAsset(getAssets(),"budmo.tff");
        textView1.setTypeface(myFont);
        // textView2.setTypeface(myFont2);


        //Imagen va apareciendo y el texto se desplaza desde fuera(dere) ala izquierda
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.pulse);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.leftin);
        img.startAnimation(myanim);
        textView1.startAnimation(myanim2);


        /*EFECTOS
            //implementando las animaciones
        //Animation rotate = AnimationUtils.loadAnimation(this,R.anim.rotation_animation1);
        //img.startAnimation(rotate);
        PARPADEO
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.blink);
        IZQUIERDA A DERECHA
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.hacialaderecha);
        FRENAZO
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.leftin);
        SE SALE FUERA HACIA LA IZQUIERDA
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.leftout);
        PULSACIONES
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.pulse);
        BAJA SUAVE
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.slidedown);
        SUBE SUAVE
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.slideup);
        SUBE HACIA  ARRIBA EN DIAGONAL(IZQ)
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.zoombackin);
        DESAPARECE Y VUELVE
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        APARECE EN DIAGONA DESDE ARRIBA
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.zoomout);
        XXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.simultaneo);

        */
    }
}
