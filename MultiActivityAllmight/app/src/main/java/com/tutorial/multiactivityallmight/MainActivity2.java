package com.tutorial.multiactivityallmight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtNameView = findViewById(R.id.txtNameView);
        TextView txtAgeView = findViewById(R.id.txtAgeView);
        Button btnContinueUrl = findViewById(R.id.btnContinueUrl);


        Bundle bundle = getIntent().getExtras();
        String inputName = bundle.getString("NAME_KEY");
        int inputAge = bundle.getInt("AGE_KEY");

        txtNameView.setText(inputName);
        txtAgeView.setText(Integer.toString(inputAge));

        btnContinueUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://heroaca.com";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}