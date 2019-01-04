package com.example.wayforlife.wayforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private ImageView wflLogo;
    private TextView Email, Password;
    private EditText editEmail, editPassword;
    private Button LoginButton;
    private FirebaseUser currentUser;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        InitializeFields();
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();

        if(currentUser!=null)
        {
            SendUserToHomeActivity();
        }

    }

    private void SendUserToHomeActivity() {

        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
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
