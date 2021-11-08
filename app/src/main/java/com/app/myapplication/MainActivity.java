package com.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.app.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = ActivityMainBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        setContentView(v);
        passMainActivityValue();
    }

    private void passMainActivityValue() {
        RadioGroup jenisTes = findViewById(R.id.rgJenisTes);

        binding.btnDaftar.setOnClickListener(view -> {
            int radioId = jenisTes.getCheckedRadioButtonId();
            RadioButton valueJenisTes = findViewById(radioId);
            Intent i = new Intent(MainActivity.this,SecondActivity.class);
            i.putExtra("valueNama",binding.etName.getText().toString());
            i.putExtra("valueNim",binding.etNim.getText().toString());
            i.putExtra("valueEmail",binding.etEmail.getText().toString());
            i.putExtra("valueHp",binding.etHp.getText().toString());
            i.putExtra("valueJenisTes",valueJenisTes.getText().toString());
            startActivity(i);
        });
    }
}