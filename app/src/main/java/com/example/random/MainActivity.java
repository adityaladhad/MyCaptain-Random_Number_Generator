package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button b;
    EditText b1,b2;
    TextView e;
    float a1, a2;
    double c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.butt);
        b1 = (EditText) findViewById((R.id.start));
        b2 = (EditText) findViewById((R.id.end));
        e = (TextView) findViewById((R.id.value));

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1 = Float.parseFloat(b1.getText().toString());
                a2 = Float.parseFloat(b2.getText().toString());
                 c =(Math.random()*((a2-a1)+1));
                 c=c+a1;
                 String s=String.valueOf((int)c);
                 e.setText(s);
            }
        });
        b1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                    b1.setHint("");
            }
        });
        b2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                    b2.setHint("");
            }
        });


    }
}
