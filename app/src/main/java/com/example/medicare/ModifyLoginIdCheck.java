package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medicare.databinding.ActivityModifyLoginIdBinding;
import com.example.medicare.databinding.ActivityModifyLoginIdCheckBinding;

public class ModifyLoginIdCheck extends AppCompatActivity {
    private ActivityModifyLoginIdCheckBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityModifyLoginIdCheckBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //전 화면으로 이동
                Intent intent = new Intent(getApplicationContext(),ModifyLoginID.class);
                startActivity(intent);
                finish();
            }
        });
    }
}