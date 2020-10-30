package com.example.mycalc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText calcEditText;

    float mValueOne, mValueTwo;

    boolean calcAddition, calcSubtract, calcMultiplication, calcDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivision = findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttoneql);
        calcEditText = findViewById(R.id.edt1);


        button1.setOnClickListener(v -> calcEditText.setText(String.format("%s1", calcEditText.getText())));

        button2.setOnClickListener(v -> calcEditText.setText(String.format("%s2", calcEditText.getText())));

        button3.setOnClickListener(v -> calcEditText.setText(String.format("%s3", calcEditText.getText())));

        button4.setOnClickListener(v -> calcEditText.setText(String.format("%s4", calcEditText.getText())));

        button5.setOnClickListener(v -> calcEditText.setText(String.format("%s5", calcEditText.getText())));

        button6.setOnClickListener(v -> calcEditText.setText(String.format("%s6", calcEditText.getText())));

        button7.setOnClickListener(v -> calcEditText.setText(String.format("%s7", calcEditText.getText())));

        button8.setOnClickListener(v -> calcEditText.setText(String.format("%s8", calcEditText.getText())));

        button9.setOnClickListener(v -> calcEditText.setText(String.format("%s9", calcEditText.getText())));

        button0.setOnClickListener(v -> calcEditText.setText(String.format("%s0", calcEditText.getText())));

        buttonAdd.setOnClickListener(v -> {
            if (calcEditText != null) {
                mValueOne = Float.parseFloat(calcEditText.getText() + "");
                calcAddition = true;
                calcEditText.setText(null);
            }
        });


        buttonSub.setOnClickListener(v -> {
            if(calcEditText != null){
                mValueOne = Float.parseFloat(calcEditText.getText() + "");
                calcSubtract = true;
                calcEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(v -> {
            if(calcEditText != null){
                mValueOne = Float.parseFloat(calcEditText.getText() + "");
                calcMultiplication = true;
                calcEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(v -> {
            if(calcEditText != null){
                mValueOne = Float.parseFloat(calcEditText.getText() + "");
                calcDivision = true;
                calcEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(v -> {
            if(calcEditText != null){
                mValueTwo = Float.parseFloat(calcEditText.getText() + "");

                if (calcAddition) {
                    calcEditText.setText(String.format("%s", mValueOne + mValueTwo));
                    calcAddition = false;
                }

                if (calcSubtract) {
                    calcEditText.setText(String.format("%s", mValueOne - mValueTwo));
                    calcSubtract = false;
                }

                if (calcMultiplication) {
                    calcEditText.setText(String.format("%s", mValueOne * mValueTwo));
                    calcMultiplication = false;
                }

                if (calcDivision) {
                    calcEditText.setText(String.format("%s", mValueOne / mValueTwo));
                    calcDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(v -> calcEditText.setText(""));

        button10.setOnClickListener(v -> calcEditText.setText(String.format("%s.", calcEditText.getText())));


    }
}