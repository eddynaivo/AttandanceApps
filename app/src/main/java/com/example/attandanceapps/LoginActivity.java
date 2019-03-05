package com.example.attandanceapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.attandanceapp.R;

public class LoginActivity extends AppCompatActivity {
    Button Login;
    EditText userName;
    EditText userPassord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login=findViewById(R.id.btnLogin);
        userName=findViewById(R.id.username);
        userPassord=findViewById(R.id.password);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                methodLoginUser(userName.getText().toString(),userPassord.getText().toString());
            }
        });

    }

    public void methodLoginUser(String name,String password){
        if (TextUtils.isEmpty(name) && TextUtils.isEmpty(password)){
            userName.setError("Fill in the user name");
            userPassord.setError("Fill in the user password");
        }

        else  if(TextUtils.isEmpty(name)){
            userName.setError("Fill in the user name");
        }
        else if(TextUtils.isEmpty(password)){
            userPassord.setError("Fill in the user password");

        }
        else {
            Intent intent=new Intent(LoginActivity.this,StudentActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"Loaded",Toast.LENGTH_SHORT).show();
        }
    }
}
