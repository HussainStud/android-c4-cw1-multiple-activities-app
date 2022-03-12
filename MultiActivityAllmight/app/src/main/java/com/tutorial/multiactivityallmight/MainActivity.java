package com.tutorial.multiactivityallmight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnContinue = findViewById(R.id.btnContinue);
        EditText edtName = findViewById(R.id.edtName);
        EditText edtAge = findViewById(R.id.edtAge);

        final Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(TextUtils.isEmpty(edtName.getText().toString()) && TextUtils.isEmpty(edtAge.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please fill in the Input Fields", Toast.LENGTH_SHORT).show();
                } else {
                    String name = edtName.getText().toString();
                    int age = Integer.parseInt(edtAge.getText().toString());
                    intent.putExtra("NAME_KEY", name);
                    intent.putExtra("AGE_KEY", age);
                    startActivity(intent);
                }
            }
        });

    }



}