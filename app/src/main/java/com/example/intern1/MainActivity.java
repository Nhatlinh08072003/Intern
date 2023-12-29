package com.example.intern1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //khai bao
    Button btnopen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tham chieu
        btnopen = findViewById(R.id.btnopen);
        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //khai bao intenrt
                Intent myintent = new Intent(MainActivity.this,ChildActivity.class);
                startActivity(myintent);
            }
        });
    }
}