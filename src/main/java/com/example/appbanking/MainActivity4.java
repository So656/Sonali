package com.example.appbanking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
ImageView imageView4;
TextView textView2;
    TextView textView4;
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imageView4=findViewById(R.id.imageView4);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);

       // imageView4.setImageResource(getIntent().getIntExtra("imageIntent",R.drawable.ic_launcher_background));
        textView2.setText(getIntent().getStringExtra("nameIntent"));
        textView4.setText(getIntent().getStringExtra("email_idIntent"));
        textView5.setText(getIntent().getStringExtra("current_balanceIntent"));
    }
}