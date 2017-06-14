package com.example.febriantonugroho.androidstudio_howto3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Todo: to Portrait Activity */
        findViewById(R.id.btnPortrait).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPortrait = new Intent(getBaseContext(), PortraitActivity.class);
                startActivity(intentPortrait);
            }
        });

        /* Todo: to Landscape Activity */
        findViewById(R.id.btnLandscape).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLandscape = new Intent(getBaseContext(), LandscapeActivity.class);
                startActivity(intentLandscape);
            }
        });
    }
}
