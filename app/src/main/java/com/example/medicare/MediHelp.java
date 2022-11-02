package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medicare.databinding.ActivityMediHelpBinding;
import com.example.medicare.databinding.ActivityModifyLoginIdCheckBinding;

public class MediHelp extends AppCompatActivity {
    private ActivityMediHelpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMediHelpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //전 화면으로 이동
               // Intent intent = new Intent(getApplicationContext(),ModifyLoginID.class);
                //startActivity(intent);
                finish();
            }
        });

        //자주 묻는 질문
        binding.layoutSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MediAskQuestion.class);
                startActivity(intent);
                finish();
            }
        });

        //문의사항
        binding.layoutThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MediQuestion.class);
                startActivity(intent);
                finish();
            }
        });
    }
}