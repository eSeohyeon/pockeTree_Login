package com.example.a1122_2128;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_logo=findViewById(R.id.img_logo);
        Animation splashLogo = AnimationUtils.loadAnimation(this, R.anim.anim_splash_logo);
        img_logo.startAnimation(splashLogo);
    }
}