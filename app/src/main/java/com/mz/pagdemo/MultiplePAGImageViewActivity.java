package com.mz.pagdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.libpag.PAGImageView;

public class MultiplePAGImageViewActivity extends AppCompatActivity {

    private static final String TAG = "PAG-MultiplePAGImageViewActivity";

    PAGImageView view1;
    PAGImageView view2;
    PAGImageView view3;
    PAGImageView view4;
    PAGImageView view5;
    PAGImageView view6;
    PAGImageView view7;
    PAGImageView view8;
    PAGImageView view9;
    PAGImageView view10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_pagimage_view);
        initView();
    }

    private void initView() {
        view1 = findViewById(R.id.pagView1);
        view1.setPath("assets://20.pag");
        view1.setRepeatCount(-1);
        view1.play();

        view2 = findViewById(R.id.pagView2);
        view2.setPath("assets://2.pag");
        view2.setRepeatCount(-1);
        view2.play();

        view3 = findViewById(R.id.pagView3);
        view3.setPath("assets://18.pag");
        view3.setRepeatCount(-1);
        view3.play();

        view4 = findViewById(R.id.pagView4);
        view4.setPath("assets://particle_video.pag");
        view4.setRepeatCount(-1);
        view4.play();

        view5 = findViewById(R.id.pagView5);
        view5.setPath("assets://5.pag");
        view5.setRepeatCount(-1);
        view5.play();

        view6 = findViewById(R.id.pagView6);
        view6.setPath("assets://6.pag");
        view6.setRepeatCount(-1);
        view6.play();

        view7 = findViewById(R.id.pagView7);
        view7.setPath("assets://7.pag");
        view7.setRepeatCount(-1);
        view7.play();

        view8 = findViewById(R.id.pagView8);
        view8.setPath("assets://8.pag");
        view8.setRepeatCount(-1);
        view8.play();

        view9 = findViewById(R.id.pagView9);
        view9.setPath("assets://12.pag");
        view9.setRepeatCount(-1);
        view9.play();

        view10 = findViewById(R.id.pagView10);
        view10.setPath("assets://11.pag");
        view10.setRepeatCount(-1);
        view10.play();
    }


}
