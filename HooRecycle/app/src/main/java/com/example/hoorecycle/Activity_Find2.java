package com.example.hoorecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Find2 extends AppCompatActivity {

    private Button yes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__find2);

        yes = findViewById(R.id.yes);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFinalActivity();
            }
        });
    }

    public void openFinalActivity() {
        Intent intent = new Intent(this, Activity_Confirmed.class);
        startActivity(intent);
    }
}
