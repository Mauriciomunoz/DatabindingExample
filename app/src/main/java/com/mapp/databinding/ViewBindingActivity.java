package com.mapp.databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.mapp.databinding.databinding.ActivityViewBindingBinding;

/**
 * View binding is most used to bind views.
 * Is Null safety
 * Is Type safety
 */

public class ViewBindingActivity extends AppCompatActivity {

    ActivityViewBindingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove this line
        //setContentView(R.layout.activity_view_binding);
        binding = ActivityViewBindingBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.txtViewBinding.setText("This text is set using ViewBinding");
        binding.btnViewbinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtViewBinding.setText("Change the text using click on button");
            }
        });
    }
}