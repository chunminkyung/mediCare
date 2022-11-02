package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medicare.databinding.ActivityModifyLoginIdCheckBinding;
import com.example.medicare.databinding.ActivityModifyLoginPasswordBinding;

public class ModifyLoginPassword extends AppCompatActivity {
    private ActivityModifyLoginPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityModifyLoginPasswordBinding.inflate(getLayoutInflater());
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
    }
}