package com.example.guesstheceleb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AssetManager manager = getAssets();
        CelebrityManager celebrityManager = new CelebrityManager(manager, "celebs");
        Bitmap iAmAName = celebrityManager.get(5);
        System.out.println();

    }
}


