package com.example.guesstheceleb;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;


public class CelebrityManager {

    private String assetPath;
    private String[] imagesNames;
    private AssetManager assetManager;


    CelebrityManager(AssetManager assetManager, String assetPath) {
        this.assetPath = assetPath;
        this.assetManager = assetManager;

        try {
            imagesNames = assetManager.list("celebs");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    Bitmap get(int i){

        InputStream stream = null;
        try {
            stream = assetManager.open("celebs/" + imagesNames[i]);
            return BitmapFactory.decodeStream(stream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }


}


