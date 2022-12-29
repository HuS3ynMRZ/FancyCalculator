package com.example.designtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button clearbutton, clearAllbutton, onebutton, twobutton, threebutton, fourbutton, fivebutton, sixbutton, sevenbutton, eightbutton, ninebutton, zerobutton, dotbutton, doubleZero;

    TextView screenText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onebutton = findViewById(R.id.onebutton);
        twobutton = findViewById(R.id.twobutton);
        threebutton = findViewById(R.id.threebutton);
        fourbutton = findViewById(R.id.fourbutton);
        fivebutton = findViewById(R.id.fivebutton);
        sixbutton = findViewById(R.id.sixbutton);
        sevenbutton = findViewById(R.id.sevenbutton);
        eightbutton = findViewById(R.id.eightbutton);
        ninebutton = findViewById(R.id.ninebutton);
        zerobutton = findViewById(R.id.zerobutton);
        dotbutton = findViewById(R.id.dotbutton);
        doubleZero = findViewById(R.id.doublezerobutton);

        clearAllbutton = findViewById(R.id.clearAllbutton);
        clearbutton = findViewById(R.id.clearbutton);

        screenText = findViewById(R.id.equationTextView);

    }
    public void one(View view){
        if (screenText.getText().toString() == "") {
            screenText.setText("1");
        } else {
            screenText.setText(screenText.getText().toString()+"1");
        }
    }
    public void two(View view){
        if (screenText.getText().toString() == "") {
            screenText.setText("2");
        } else {
            screenText.setText(screenText.getText().toString()+"2");
        }
    }
    public void three(View view){
        if (screenText.getText().toString() == "") {
            screenText.setText("3");
        } else {
            screenText.setText(screenText.getText().toString()+"3");
        }
    }
    public void four(View view){
        if (screenText.getText().toString() == "") {
            screenText.setText("4");
        } else {
            screenText.setText(screenText.getText().toString()+"4");
        }
    }
    public void five(View view){
        if (screenText.getText().toString() == "") {
            screenText.setText("5");
        } else {
            screenText.setText(screenText.getText().toString()+"5");
        }
    }
    public void six(View view){
        if (screenText.getText().toString() == "") {
            screenText.setText("6");
        } else {
            screenText.setText(screenText.getText().toString()+"6");
        }
    }
    public void seven(View view){
        if (screenText.getText().toString() == "") {
            screenText.setText("7");
        } else {
            screenText.setText(screenText.getText().toString()+"7");
        }
    }
    public void eight(View view){
        if (screenText.getText().toString() == "") {
            screenText.setText("8");
        } else {
            screenText.setText(screenText.getText().toString()+"8");
        }
    }
    public void nine(View view){
        if (screenText.getText().toString() == "") {
            screenText.setText("9");
        } else {
            screenText.setText(screenText.getText().toString()+"9");
        }
    }
    public void zero(View view){
        if (screenText.getText().toString() == "") {
        } else {
            screenText.setText(screenText.getText().toString()+"0");
        }
    }
    public void doubleZero(View view){

    }
    public void dot(View view){

    }
    public void clearAllbutton(View view){
        screenText.setText("");
    }
    public void clearbutton(){
        StringBuffer st = new StringBuffer(String.valueOf(screenText.getText().toString()));
        st.deleteCharAt(st.length()-1);
        screenText.setText(st);
    }

}