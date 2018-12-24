package com.example.test;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText pass;
    private Button btn,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addListenerOnButton1(View V){
        pass = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);
        btn.setText("Done");
        btn.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
        Toast.makeText(MainActivity.this, pass.getText(),Toast.LENGTH_SHORT).show();
    }
    public void addListenerOnButton2(View V){
        pass = (EditText)findViewById(R.id.editText);
        btn2 = (Button)findViewById(R.id.button3);
        btn.setText("Changed");
        btn2.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
        btn.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
        Toast.makeText(MainActivity.this, "Button 1 was changed",Toast.LENGTH_SHORT).show();
    }
}
