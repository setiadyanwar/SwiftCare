package com.example.swiftcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.swiftcare.databinding.ActivityCtaactivityBinding;

import java.util.ArrayList;
import java.util.List;

public class CTAActivity extends AppCompatActivity {

    ActivityCtaactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCtaactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        imageSlider();
    }

    private void imageSlider() {
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.slider1, null, ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.slider2, null, ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.slider3, null, ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.slider4, null, ScaleTypes.CENTER_INSIDE));
        binding.imageSlider.setImageList(slideModels);
        setListener();
    }

    private void setListener(){
        binding.buttonSignIn.setOnClickListener( v ->
                startActivity(new Intent(getApplicationContext(), SignInActivity.class)));
        binding.buttonSignUp.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
        });
    }
}