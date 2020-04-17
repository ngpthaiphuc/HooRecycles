package com.example.hoorecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Find1 extends AppCompatActivity {

    private Button address1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__find1);

        address1 = findViewById(R.id.address1);
        address1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConfirmActivity();
            }
        });
    }

    public void openConfirmActivity(){
        Intent intent = new Intent(this, Activity_Find2.class);
        startActivity(intent);
    }
}
