package com.example.intentsproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        final int number1 = intent.getIntExtra(FirstActivity.EXTRA_NUMBER1,0);
        final int number2 = intent.getIntExtra(FirstActivity.EXTRA_NUMBER2,0);

        final EditText textView1 = (EditText) findViewById(R.id.editTextTextPersonName3);
        final EditText textView2 = (EditText) findViewById(R.id.editTextTextPersonName4);

        Button add = (Button) findViewById(R.id.button2);
        Button subtract = (Button) findViewById(R.id.button3);
        Button multiply = (Button) findViewById(R.id.button4);
        Button divide = (Button) findViewById(R.id.button5);

        textView1.setText("" + number1);
        textView2.setText("" + number2);


        final TextView result = (TextView) findViewById(R.id.textView5);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(textView1.getText().toString());
                int num2 = Integer.parseInt(textView2.getText().toString());
                int res = num1 + num2;
                result.setText(Integer.toString(num1)+"+"+Integer.toString(num2)+"="+Integer.toString(res));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(textView1.getText().toString());
                int num2 = Integer.parseInt(textView2.getText().toString());
                int res = num1 - num2;
                result.setText(Integer.toString(num1)+"-"+Integer.toString(num2)+"="+Integer.toString(res));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(textView1.getText().toString());
                int num2 = Integer.parseInt(textView2.getText().toString());
                int res = num1 * num2;
                result.setText(Integer.toString(num1)+"*"+Integer.toString(num2)+"="+Integer.toString(res));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(textView1.getText().toString());
                int num2 = Integer.parseInt(textView2.getText().toString());
                int res = num1 / num2;
                result.setText(Integer.toString(num1)+"/"+Integer.toString(num2)+"="+Integer.toString(res));
            }
        });

    }

}