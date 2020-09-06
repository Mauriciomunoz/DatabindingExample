package com.mapp.databinding;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ButterknifeActivity extends AppCompatActivity {

    /**
     * This is an example to understand how Butterknife work.
     * Native android contains a native version of DataBinding in latest versions
     *
     */

    @BindView(R.id.textViewBK)
    TextView textViewBK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnButterknife) void btnButterknife(){
        textViewBK.setText("Button clicked");
    }
}