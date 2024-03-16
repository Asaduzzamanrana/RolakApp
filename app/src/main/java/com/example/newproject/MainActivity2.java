package com.example.newproject;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    ImageButton fBtn1,fBtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        fBtn1 = findViewById(R.id.fbtn1);
        fBtn2 = findViewById(R.id.fbtn2);

        fBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity2.this,R.raw.click);
                mediaPlayer.start();

                Toast.makeText(MainActivity2.this, "clicked", Toast.LENGTH_SHORT).show();
            }
        });


        fBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity2.this,R.raw.click);
                mediaPlayer.start();

                Toast.makeText(MainActivity2.this, "clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}