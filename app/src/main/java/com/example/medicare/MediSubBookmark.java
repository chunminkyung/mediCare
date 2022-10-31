package com.example.medicare;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.medicare.databinding.ActivityMediSubBookmarkBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

    public class MediSubBookmark extends AppCompatActivity {
        private ActivityMediSubBookmarkBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //setContentView(R.layout.activity_medi_sub_bookmark);
            binding = ActivityMediSubBookmarkBinding.inflate(getLayoutInflater());
            View view = binding.getRoot();
            setContentView(view);

            binding.searchButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Intent intent = new Intent(MediSubBookmark.this, MainMenuMediBookmark.class);
                    // startActivity(intent);

                    //finish();
                    finish();
                }
            });

            binding.toolbarLogo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MediSubBookmark.this, MainMenuActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
    // finish();

    //getSupportFragmentManager().beginTransaction().replace(binding.searchButton,fragment)
    //finish();



