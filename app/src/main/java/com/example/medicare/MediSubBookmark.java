package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.medicare.databinding.ActivityMediSubBookmarkBinding;

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
               // finish();

                //getSupportFragmentManager().beginTransaction().replace(binding.searchButton,fragment)
                finish();
            }
        });

        boolean onNavigationItemSelected;
    }


}