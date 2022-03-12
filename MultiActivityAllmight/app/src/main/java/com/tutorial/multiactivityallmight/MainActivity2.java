package com.tutorial.multiactivityallmight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtNameView = findViewById(R.id.txtNameView);
        TextView txtAgeView = findViewById(R.id.txtAgeView);


        Bundle bundle = getIntent().getExtras();
        String inputName = bundle.getString("NAME_KEY");
        int inputAge = bundle.getInt("AGE_KEY");

        txtNameView.setText(inputName);
        txtAgeView.setText(Integer.toString(inputAge));
    }
}