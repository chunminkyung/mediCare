package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medicare.databinding.ActivityMediHelpBinding;
import com.example.medicare.databinding.ActivityMediQuestionBinding;

public class MediQuestion extends AppCompatActivity {
    private ActivityMediQuestionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMediQuestionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //전 화면으로 이동
                Intent intent = new Intent(getApplicationContext(),MediHelp.class);
                startActivity(intent);
                finish();
            }
        });

    }
}