package com.mapp.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.mapp.databinding.databinding.ActivityDataBindingBinding;

/**
 * Databinding is used to bind data. This help to bind data to views
 *
 */

public class DataBindingActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityDataBindingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //We are going to remove this line
        //setContentView(R.layout.activity_data_binding);

        //We create the binding and inflate the layout
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        binding.setData("This textview is using databinding");
        binding.setMain(this);
        binding.btnDataBinding.setOnClickListener(this);

    }

    public void changeText(){
        binding.setData("Changed using OnClick event bind in button");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDataBinding:
                binding.setData("Changed by simple binding");
        }
    }
}