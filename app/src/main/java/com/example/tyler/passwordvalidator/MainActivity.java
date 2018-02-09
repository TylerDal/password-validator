package com.example.tyler.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View v) {
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);

        if (!Validator.validatePW(editText.getText().toString()))
            textView.setText("Not strong");
        else
            textView.setText("Strong");
    }
}
