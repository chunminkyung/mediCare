package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medicare.databinding.ActivityModifyLoginIdBinding;

public class ModifyLoginID extends AppCompatActivity {
    private ActivityModifyLoginIdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityModifyLoginIdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //전 화면으로 이동
                Intent intent = new Intent(getApplicationContext(),MediAccount.class);
                startActivity(intent);
                finish();
            }
        });

        binding.pageNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ModifyLoginIdCheck.class);
                startActivity(intent);
                finish();
            }
        });
    }
}