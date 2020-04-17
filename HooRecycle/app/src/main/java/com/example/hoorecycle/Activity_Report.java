package com.example.hoorecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_Report extends AppCompatActivity {

    public static final String INPUTTED_ADDRESS = "com.example.hoorecycle.INPUTTED_ADDRESS";
    private Button yes, no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__report);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFinalActivity();
            }
        });

    }

    public void openFinalActivity(){
        EditText textBox = findViewById(R.id.address);
        String text = textBox.getText().toString();

        Intent intent = new Intent(this, Activity_Confirmed.class);
        intent.putExtra(INPUTTED_ADDRESS, text);
        startActivity(intent);
    }
}
