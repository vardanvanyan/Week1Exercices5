package com.example.vardan.week1exercices_5_true;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private static final String KEY_ONE = "key first";
    int plusminus = 0;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text = findViewById(R.id.textView);
        Button button1 = findViewById(R.id.btn1ID);
        Button button2 = findViewById(R.id.btn2ID);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plusminus--;
                text.setText(String.valueOf(plusminus));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plusminus++;
                text.setText(String.valueOf(plusminus));
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt(KEY_ONE, plusminus);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        plusminus = savedInstanceState.getInt(KEY_ONE);
        text.setText(String.valueOf(plusminus));
    }
}

