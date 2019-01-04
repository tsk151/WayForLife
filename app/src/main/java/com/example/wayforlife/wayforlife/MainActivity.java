package com.example.wayforlife.wayforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Login, SignUp;
    private TextView Or;
    private ImageView WflLogo;
    private View FirstLine, SecondLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitializeFields();

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });



        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });








    }

    private void InitializeFields() {
        Login = (Button)findViewById(R.id.main_login);
        SignUp = (Button)findViewById(R.id.main_signup);
        Or = (TextView) findViewById(R.id.or);
        WflLogo = (ImageView)findViewById(R.id.wfl_logo);
        FirstLine = (View)findViewById(R.id.first_line);
        SecondLine = (View)findViewById(R.id.second_line);
        }
}
