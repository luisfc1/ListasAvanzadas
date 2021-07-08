package com.octopus.applistaavanzada2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.octopus.applistaavanzada2.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;
    Button btnAdvanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnAdvanced = binding.btnAdvanced;
        //btnAdvanced = (Button) findViewById(R.id.btnAdvanced);

    }

    public void btnAdvancedClick(View view){
        Intent intent = new Intent(this, AdvancedListActivity.class);
        startActivity(intent);
    }

}