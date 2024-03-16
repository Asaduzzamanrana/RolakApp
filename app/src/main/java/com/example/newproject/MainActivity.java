package com.example.newproject;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    ImageButton btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn1 = findViewById(R.id.btn1Id);
        btn2 = findViewById(R.id.btn2Id);
        btn3 = findViewById(R.id.btn3Id);
        btn4 = findViewById(R.id.btn4Id);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click);
                mediaPlayer.start();

                startActivity(new Intent(MainActivity.this,MainActivity2.class));
                Animatoo.INSTANCE.animateFade(MainActivity.this);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click);
                mediaPlayer.start();

                startActivity(new Intent(MainActivity.this,DentalPain.class));
                Animatoo.INSTANCE.animateFade(MainActivity.this);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click);
                mediaPlayer.start();

                startActivity(new Intent(MainActivity.this,GynecoPain.class));
                Animatoo.INSTANCE.animateFade(MainActivity.this);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click);
                mediaPlayer.start();

                startActivity(new Intent(MainActivity.this,OrthopedicPain.class));
                Animatoo.INSTANCE.animateFade(MainActivity.this);
            }
        });

    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setIcon(R.drawable.ques);
        alertDialogBuilder.setMessage(R.string.message_text);
        alertDialogBuilder.setTitle(R.string.alert_text);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNeutralButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}