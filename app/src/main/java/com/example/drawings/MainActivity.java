package com.example.drawings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DrawView drawView;
    TextView textView;
    FragmentA fragmentA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawView = findViewById(R.id.drawView);
        textView = findViewById(R.id.main_textview);
        fragmentA = (FragmentA)getSupportFragmentManager().findFragmentById(R.id.a_fragment);
    }

    public void reverseY(View view) {
        drawView.setdY(drawView.getdY()*-1);
    }

    public void update_main(View view) {
        textView.setText("Hello TJHSST");
        ((Button)view).setText("I have been clicked");
        fragmentA.update("I have been updated");
    }
}