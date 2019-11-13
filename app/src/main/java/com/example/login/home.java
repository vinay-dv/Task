package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class home extends AppCompatActivity {
    private ImageView button;
    private  FrameLayout frameLayout1;
    private  FrameLayout frameLayout2;
    private  FrameLayout frameLayout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button = findViewById(R.id.logout_button);
        frameLayout1 = findViewById(R.id.frame_state);
        frameLayout2 = findViewById(R.id.frame_district);
        frameLayout3 = findViewById(R.id.frame_child);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openlogin();
             }
         });

         frameLayout1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v0) {
                 openState();
             }
         });

        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v0) {
                openDistrict();
            }
        });

        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v0) {
                openchild();
            }
        });

    }

    public void openlogin()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void openDistrict()
    {
        Intent intent = new Intent(this, district.class);
        startActivity(intent);

    }
    public void openState()
    {
        Intent intent2 = new Intent(this, state.class);
        startActivity(intent2);
    }

    public void openchild()
    {
        Intent intent = new Intent(this, child.class);
        startActivity(intent);
    }
}
