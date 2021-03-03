package com.example.calculatorinterest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    private Button dis10, dis20,dis30;
    private EditText edittext;
    private TextView result;
    private ImageView umph;
    private RadioButton inter, diskaun, u, non;
    private RadioGroup radiogr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dis10 = findViewById(R.id.button10);
        dis20 = findViewById(R.id.button20);
        dis30 = findViewById(R.id.button30);
        inter = findViewById(R.id.interest);
        diskaun= findViewById(R.id.discount);
        u = findViewById(R.id.umph);
        non = findViewById(R.id.none);
        edittext = findViewById(R.id.edittext);
        result = findViewById(R.id.textView);
        radiogr = findViewById(R.id.rGroup);



        dis10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edittext.getText().toString().matches("")){
                    double no1 = Double.parseDouble(edittext.getText().toString());
                    double res = no1 - (0.1 *no1);

                    result.setText(String.valueOf(res));
                }
                else
                    result.setText("Error");
            }
        });
        dis20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edittext.getText().toString().matches("")){
                    double no1 = Double.parseDouble(edittext.getText().toString());
                    double res = no1 - (0.2*no1);

                    result.setText(String.valueOf(res));
                }
                else
                    result.setText("Error");
            }
        });
        dis30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edittext.getText().toString().matches("")){
                    double no1 = Double.parseDouble(edittext.getText().toString());
                    double res = no1 - (0.3*no1);

                    result.setText(String.valueOf(res));
                }
                else
                    result.setText("Error");
            }
        });

    }
}
