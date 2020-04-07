package com.example.hoorecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button find, report;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        find    = findViewById(R.id.find);
        report  = findViewById(R.id.report);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFindActivity();
            }
        });

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReportActivity();
            }
        });
    }

    public void openFindActivity(){
        Intent intent = new Intent(this, Activity_Find1.class);
        startActivity(intent);
    }

    public void openReportActivity(){
        Intent intent = new Intent(this, Activity_Report.class);
        startActivity(intent);
    }
}
