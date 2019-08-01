package com.example.myregcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    TextView result;
    Button btn_add;
    Button btn_subtract;
    Button btn_multiply;
    Button btn_divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.Et_first_input);
        input2 = findViewById(R.id.Et_second_input);
        result = findViewById(R.id.Tv_output);
        btn_add = findViewById(R.id.Btn_add);
        btn_subtract = findViewById(R.id.Btn_subtract);
        btn_multiply = findViewById(R.id.Btn_multiply);
        btn_divide = findViewById(R.id.Btn_divide);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()){
                    result.setText("input number");
                }else {
                    int add_result = Integer.parseInt(input1.getText().toString()) + Integer.parseInt(input2.getText().toString());
                    result.setText(Integer.toString(add_result));
                }
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()){
                    result.setText("input number");
                }else {
                    int subtract_result = Integer.parseInt(input1.getText().toString()) - Integer.parseInt(input2.getText().toString());
                    result.setText(Integer.toString(subtract_result));
                }
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()){
                    result.setText("input number");
                }else {
                    int multiply_result = Integer.parseInt(input1.getText().toString()) * Integer.parseInt(input2.getText().toString());
                    result.setText(Integer.toString(multiply_result));
                }
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()){
                    result.setText("input number");
                }else if (Integer.parseInt(input2.getText().toString()) == 0){

                    String err = "error";
                    result.setText(err);


                }else {
                    int divide_result = Integer.parseInt(input1.getText().toString()) / Integer.parseInt(input2.getText().toString());
                    result.setText(Integer.toString(divide_result));
                }

                //division();


            }
        });
    }

    /*private void addition(){
        int add_result = Integer.parseInt(input1.getText().toString()) + Integer.parseInt(input2.getText().toString());
        result.setText(add_result);
    }

    private void subtraction(){
        int subtract_result = Integer.parseInt(input1.getText().toString()) - Integer.parseInt(input2.getText().toString());
        result.setText(subtract_result);
    }

    private void multiplication(){
        int multiply_result = Integer.parseInt(input1.getText().toString()) * Integer.parseInt(input2.getText().toString());
        result.setText(multiply_result);
    }

    private void division(){
        int divide_result = Integer.parseInt(input1.getText().toString()) + Integer.parseInt(input2.getText().toString());
        result.setText(divide_result);
    }*/


}
