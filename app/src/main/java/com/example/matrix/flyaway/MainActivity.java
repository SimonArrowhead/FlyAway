package com.example.matrix.flyaway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void count (View view){
        display(number);
        number++;
    }

    private void display(int testNumber){
        TextView testTextView = (TextView) findViewById(R.id.test);
        testTextView.setText(NumberFormat.getNumberInstance().format(number));
    }
}
