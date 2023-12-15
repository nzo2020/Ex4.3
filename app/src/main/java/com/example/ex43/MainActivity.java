package com.example.ex43;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int ClickCount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }

    // method that start when button clicked
    public void clicked(View view) {
        ClickCount++;
        btn.setText("This is a click number:"+ClickCount);
        if (ClickCount==6){
            btn.setText("Enough to click. Go to new start!");
            ClickCount=0;
        }
    }
}