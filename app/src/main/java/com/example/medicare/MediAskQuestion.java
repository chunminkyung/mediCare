package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medicare.databinding.ActivityMediAskQuestionBinding;
import com.example.medicare.databinding.ActivityMediQuestionBinding;

public class MediAskQuestion extends AppCompatActivity {
    private ActivityMediAskQuestionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMediAskQuestionBinding.inflate(getLayoutInflater());
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

        //비밀번호 바꾸는 방법 페이지로 이동
        binding.layoutThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HCPassword.class);
                startActivity(intent);
                finish();
            }
        });
    }
}