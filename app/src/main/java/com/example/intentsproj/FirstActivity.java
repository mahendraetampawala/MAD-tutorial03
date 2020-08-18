package com.example.intentsproj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER1 = "com.example.intentsproj.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2 = "com.example.intentsproj.EXTRA_NUMBER2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        Context context = getApplicationContext();
        CharSequence message = "You have just click the OK button";

        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);

        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        int number1 = Integer.parseInt(editText.getText().toString());

        EditText editText2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        int number2 = Integer.parseInt(editText2.getText().toString());

        intent.putExtra(EXTRA_NUMBER1, number1);
        intent.putExtra(EXTRA_NUMBER2, number2);

        startActivity(intent);

    }

}