package com.example.newproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.bumptech.glide.Glide;

public class OrthopedicPain extends AppCompatActivity {

    ImageButton imageButton;
    ImageView imageView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_orthopedic_pain);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView = findViewById(R.id.oImg);
        Glide.with(this).load(R.drawable.ortho).into(imageView);

        imageButton = findViewById(R.id.oBtnId);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer mediaPlayer = MediaPlayer.create(OrthopedicPain.this,R.raw.click);
                mediaPlayer.start();

                startActivity(new Intent(OrthopedicPain.this,OrthoAcutePain.class));
                Animatoo.INSTANCE.animateFade(OrthopedicPain.this);
            }
        });

    }
}