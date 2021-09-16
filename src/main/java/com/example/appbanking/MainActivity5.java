package com.example.appbanking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
TextView textView6;
    ImageView imageView7;
    EditText editTextTextPersonName;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView6=findViewById(R.id.textView6);
        imageView7=findViewById(R.id.imageView7);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        button3=findViewById(R.id.button3);
        textView6.setText(getIntent().getStringExtra("nameIntent"));
    }
    public void Okuser(View v) {
        Toast.makeText(this, "Amount Transffered Successfully", Toast.LENGTH_SHORT).show();
        Intent intent3 = new Intent(MainActivity5.this, MainActivity6.class);
        startActivity(intent3);
    }
}