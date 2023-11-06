package com.example.mysristitogproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.mysristitogproject.levels.level1;

public class GameLavelActivity extends AppCompatActivity {
    Button btBack;
    TextView tvlavel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_lavel);


        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        btBack = (Button) findViewById(R.id.bt_game_level_back);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameLavelActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        tvlavel1 = (TextView) findViewById(R.id.tv_level_1);
        tvlavel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameLavelActivity.this, level1.class);
                startActivity(intent);
                finish();
            }
        });


    }
}