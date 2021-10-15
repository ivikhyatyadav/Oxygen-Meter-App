package com.example.oxygenmeter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_vital_signs);


        Button VS = this.findViewById(R.id.StartVS);

        VS.setOnClickListener(v -> {

            //switch is to decide which activity must be opened

                    Intent i = new Intent(v.getContext(), com.example.oxygenmeter.OxygenProcess.class);
                    startActivity(i);
                    finish();

        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}
