package com.example.appbanking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {
    transfer o1 = new transfer("Name:Sona");
    transfer o2 = new transfer("Name:Kiran");
    transfer o3 = new transfer("Name:Akash");
    transfer o4 = new transfer("Name:Alok");
    transfer o5 = new transfer("Name:Ritesh");
    transfer o6 = new transfer("Name:Rahul");
    transfer o7 = new transfer("Name:Rakesh");
    transfer o8 = new transfer("Name:Araya");
    transfer o9 = new transfer("Name:Sonal");
    transfer o10 = new transfer("Name:Saloni");

    RecyclerView recyclerView2;
    transfer[] trans = {o1, o2, o3, o4, o5, o6, o7, o8, o9, o10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView2 = findViewById(R.id.recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        transferadapter adp = new transferadapter(trans,getApplicationContext());
        recyclerView2.setAdapter(adp);
        recyclerView2.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        adp.OnRecyclerViewClickListener(new transferadapter.OnRecyclerViewClickListener() {
            @Override
            public void OnItemClick(int position) {
                //Toast.makeText(MainActivity2.this, "Position:"+position, Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(MainActivity3.this,MainActivity5.class);
                intent2.putExtra("nameIntent", trans[position].getName());
                startActivity(intent2);
            }
        });
    }

}
