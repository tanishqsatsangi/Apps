package com.google.android.abndproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        In  this module I  have described all the required Functions.
        Images are taken from Internet.
        I have changed the default color for which i have gone through the material design specs
         and have used the colors from there .
        With that i have used nested Layouts hope it passes all the requirements.
        Since my image pixels were high and was causing runtime error as : Too large Bitmap
        to fix this error i have created a folder as :drawable-xxhdpi and stored my images there
        (founded solution on google stackoverflow) please let me know if it correct or not .
       Also i have tested this app on phone and have edited it accordingly.
        Thanks
        */
    }
}
