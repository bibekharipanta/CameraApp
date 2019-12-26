package com.example.cameraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class Gallery extends AppCompatActivity {
    private ImageView imgProfile ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        imgProfile =  findViewById(R.id.imgPhoto) ;
    };

    private void BrowseImage() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        StartActivityForResult(intent,requestCode:0)
    }
}