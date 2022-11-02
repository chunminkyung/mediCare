package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medicare.databinding.ActivityMediAccountBinding;

public class MediAccount extends AppCompatActivity {
    private ActivityMediAccountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMediAccountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //전 화면으로 이동
                finish();
               }
        });

        //아이디(이메일) 수정
        binding.layoutSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ModifyLoginID.class);
                startActivity(intent);
                finish();
            }
        });

        //비밀번호 변경
        binding.layoutThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ModifyLoginPassword.class);
                startActivity(intent);
                finish();
            }
        });
    }
}