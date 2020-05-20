package com.example.guesstheceleb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Bundle;

import com.example.guesstheceleb.game.GameBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AssetManager manager = getAssets();
        GameBuilder.CelebrityManager celebrityManager = new GameBuilder.CelebrityManager(manager, "celebs");
        Bitmap iAmAName = celebrityManager.get(5);
        System.out.println();

    }
}


