package com.example.pizza_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class signup extends AppCompatActivity {
Button Signup;
Spinner spin;
String data[]={"Male","Female","Other"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        Signup=(Button)findViewById(R.id.signup);
        spin=(Spinner)findViewById(R.id.spin);

        ArrayAdapter adapter=new ArrayAdapter(signup.this,android.R.layout.simple_list_item_1,data);
        spin.setAdapter(adapter);


        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(signup.this,login.class);
                startActivity(i);
            }
        });
    }
}
