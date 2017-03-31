package com.example.sergbek.lessonfiveadvanse;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {
    ImageView imageView;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.button);
        imageView.setBackgroundResource(R.drawable.bc_btn_pressed);
        animationDrawable = (AnimationDrawable) imageView.getBackground();

    }

    public void onClick(View view) {

        animationDrawable.run();


    }

}
