package com.example.test;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addListenerOnButton(View V){
        pass = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);
        btn.setText("Done");
        btn.setBackgroundColor(Color.BLUE);
        Toast.makeText(MainActivity.this, pass.getText(),Toast.LENGTH_SHORT).show();
    }
}
