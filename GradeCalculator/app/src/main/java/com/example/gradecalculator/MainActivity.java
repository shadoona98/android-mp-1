package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText q = findViewById(R.id.quiz);
        EditText h = findViewById(R.id.hw);
        EditText m = findViewById(R.id.midterm);
        EditText f = findViewById(R.id.finals);

        TextView result = findViewById(R.id.result);

        Button buttonR = findViewById(R.id.resetButton);
        Button buttonC = findViewById(R.id.calculateButton);

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quizString = q.getText().toString();
                double quiz = Double.parseDouble(quizString);

                String hwString = h.getText().toString();
                double hw = Double.parseDouble(hwString);

                String midtermString = m.getText().toString();
                double mid = Double.parseDouble(midtermString);

                String finalsString = f.getText().toString();
                double finals = Double.parseDouble(finalsString);

                double resultNum = quiz + hw + mid + finals;

                //Toast.makeText(MainActivity.this, resultNum+"", Toast.LENGTH_LONG).show();

                if (resultNum >= 90 && resultNum <= 100){
                    result.setText("A");
                    result.setTextColor(Color.parseColor("#61b15a"));
                }
                else if (resultNum >= 80 && resultNum <= 89 ){
                    result.setText("B");
                    result.setTextColor(Color.parseColor("#51adcf"));
                }
                else if (resultNum >= 70 && resultNum <= 79 ){
                    result.setText("C");
                    result.setTextColor(Color.parseColor("#583d7215"));
                }
                else if ( resultNum >= 60 && resultNum <= 69){
                    result.setText("D");
                    result.setTextColor(Color.parseColor("#fd8c04"));
                }
                else if (resultNum < 60){
                    result.setText("F");
                    result.setTextColor(Color.parseColor("#ec524b"));
                }

            }
        });

        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q.setText("");
                h.setText("");
                m.setText("");
                f.setText("");
                result.setText("");
            }
        });

    }
}