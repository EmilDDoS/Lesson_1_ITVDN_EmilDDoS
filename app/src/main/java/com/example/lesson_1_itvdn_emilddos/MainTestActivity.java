package com.example.lesson_1_itvdn_emilddos;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainTestActivity extends AppCompatActivity {
    private TextView textSay;
    int x=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        textSay =findViewById(R.id.textView);
    }

    public void click(View v){
        switch (v.getId()){
            case R.id.button2:textSay.setBackgroundColor(getColor(R.color.red));
                break;
            case R.id.button3:textSay.setBackgroundColor(getColor(R.color.blue));
                break;
            case R.id.button4:textSay.setBackgroundColor(getColor(R.color.green));
        }
    }
}
