package com.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.app.myapplication.databinding.ActivityMainBinding;
import com.app.myapplication.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        setContentView(v);
        getIntentExtras();
    }

    private void getIntentExtras() {
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String valueName = extras.getString("valueNama");
            binding.tvNama.setText(valueName);
            String  valueNim = extras.getString("valueNim");
            binding.tvNim.setText(valueNim);
            String  valueEmail = extras.getString("valueEmail");
            binding.tvEmail.setText(valueEmail);
            String valueHp = extras.getString("valueHp");
            binding.tvNoHp.setText(valueHp);
            String valueJenisTes =  extras.getString("valueJenisTes");
            binding.tvJenisTes.setText(valueJenisTes);
        }

    }
}