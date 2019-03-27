package com.example.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button image, video, pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        image = (Button) findViewById( R.id.image );
        video = (Button) findViewById( R.id.video );


//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
//            image.setEnabled(false);
//            video.setEnabled(false);
//            ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE }, 0);
//        } else {
//            image.setEnabled(true);
//            video.setEnabled(true);
//        }
//        image.setOnClickListener(this);
//        video.setOnClickListener(this);
//    }

//    @Override
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        if (requestCode == 0) {
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED
//                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                image.setEnabled(true);
//                video.setEnabled(true);
//            }
//        }
//    }
    }

    @Override
    public void onClick(View v) {
    }

    public void videoss(View view) {
        startActivity( new Intent( this, VideoActivity.class ) );
    }
}