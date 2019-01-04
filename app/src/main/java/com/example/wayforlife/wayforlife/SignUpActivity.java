package com.example.wayforlife.wayforlife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    private TextView FullName, Email, Password, ConfirmPassword, Mobile, State, City;
    private EditText EditName, EditEmail, EditPassword, EditConfirmPassword, EditMobile;
    private Button SignUpButton;
    private Spinner EditState, EditCity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        InitializeFields();
    }

    private void InitializeFields() {

        FullName = (TextView)findViewById(R.id.fullname);
        Email = (TextView)findViewById(R.id.email);
        Password = (TextView)findViewById(R.id.password);
        ConfirmPassword = (TextView)findViewById(R.id.confirm_password);
        Mobile = (TextView)findViewById(R.id.mobile);
        State = (TextView)findViewById(R.id.state);
        City = (TextView)findViewById(R.id.city);
        EditCity = (Spinner)findViewById(R.id.spinner_city);
        EditState = (Spinner)findViewById(R.id.spinner_state);
        SignUpButton = (Button)findViewById(R.id.sign_up);
        EditName = (EditText)findViewById(R.id.edit_name);
        EditPassword = (EditText)findViewById(R.id.edit_password);
        EditConfirmPassword = (EditText)findViewById(R.id.edit_confirmpassword);
        EditMobile = (EditText)findViewById(R.id.edit_mobile);
        EditEmail = (EditText)findViewById(R.id.edit_email);


    }
}
