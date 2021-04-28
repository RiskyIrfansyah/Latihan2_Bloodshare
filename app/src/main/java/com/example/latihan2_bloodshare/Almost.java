package com.example.latihan2_bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Almost extends AppCompatActivity {
    private Button btnalmost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.almost);

        //28-04-2021,10118085,Risky Irfansyah, IF2

        btnalmost = findViewById(R.id.btnalmost);
        btnalmost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Almost.this,Verify.class));
            }
        });
    }
}