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
    //private FragmentManager fragmentManager = getSupportFragmentManager();
    //private MainMenuSettingFragment fragmentSetting = new MainMenuSettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMediAccountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //FragmentTransaction transaction = fragmentManager.beginTransaction();
        //transaction.replace(R.id.account_setting,fragmentSetting).commitNowAllowingStateLoss();

        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(),MainMenuSettingFragment.class);
                //startActivity(intent);
                finish();
               }
        });

        //toolbar_back
    }
}