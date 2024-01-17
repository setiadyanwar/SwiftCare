package com.example.swiftcare.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.swiftcare.databinding.ActivitySettingsBinding;

public class SettingsActivity extends AppCompatActivity {

    ActivitySettingsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}