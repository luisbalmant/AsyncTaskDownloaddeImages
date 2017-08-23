package com.example.luisbalmant.asynctask_downloaddeimages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void downloadImage_Button(View view){
        Toast.makeText(this, "Request sent...", Toast.LENGTH_SHORT).show();

    }

}
