package com.example.callbackandlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton1 = (Button) findViewById(R.id.myButton1);
        TextView textField1 = (TextView) findViewById(R.id.myText1);
        Button myButton2 = (Button) findViewById(R.id.myButton2);

        myButton1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        textField1.setText("You Just Tapped on Button.");
                    }
                }
        );

        myButton2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textField1 = (TextView) findViewById(R.id.myText1);
                        textField1.setText("Tap On Button.");
                    }
                }
        );
    }
}