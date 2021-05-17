package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.counterapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        DecreaseCount();


        IncreaseCount();

    }

    private void IncreaseCount() {
        b.btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0) {
                    Toast.makeText(MainActivity.this, "Invalid", Toast.LENGTH_SHORT).show();
                    return;
                }
                b.count.setText(--count + "");
            }
        });
    }

    private void DecreaseCount() {
        b.btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.count.setText(++count + "");
            }
        });
    }
}