package com.mapp.databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnButterknife;
    Button btnDatabinding;
    Button btnViewbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Normal "binding". Using 'findViewById; we are going to get the view and work with it
        btnButterknife = (Button) findViewById(R.id.butterknife_btn);
        btnDatabinding = (Button) findViewById(R.id.databindingAndroid_btn);
        btnViewbinding = (Button) findViewById(R.id.viewbindingAndroid_btn);

        btnButterknife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), ButterknifeActivity.class);
                startActivity(i);
            }
        });

        btnDatabinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), DataBindingActivity.class);
                startActivity(i);
            }
        });

        btnViewbinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), ViewBindingActivity.class);
                startActivity(i);
            }
        });


    }
}