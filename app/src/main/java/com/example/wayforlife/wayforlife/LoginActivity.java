package com.example.wayforlife.wayforlife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private ImageView wflLogo;
    private TextView Email, Password;
    private EditText editEmail, editPassword;
    private Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        InitializeFields();

    }

    private void InitializeFields() {
        wflLogo = (ImageView)findViewById(R.id.wfl_logo);
        Email = (TextView)findViewById(R.id.email);
        Password = (TextView)findViewById(R.id.password);
        editEmail = (EditText)findViewById(R.id.edit_email);
        editPassword = (EditText)findViewById(R.id.edit_password);
        LoginButton = (Button)findViewById(R.id.loginButton);

    }
}
