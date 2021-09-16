package com.example.appbanking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    Contact o1 = new Contact("Name:Sona", "Email:Sona@300@gmail.com", "Current_balance:45785");
    Contact o2 = new Contact("Name:Kiran","Email:Kiran@377@gmail.com","Current_balance:67234");
    Contact o3 = new Contact("Name:Akash","Email:Akash@gmail.com","Current_balance:45234");
    Contact o4 = new Contact("Name:Alok","Email:Alok@754@gmail.com","Current_balance:45000");
    Contact o5 = new Contact("Name:Ritesh","Email:Ritesh@354@gmail.com","Current_balance:56085");
    Contact o6 = new Contact("Name:Rahul","Email:Rahul@210@gmail.com","Current_balance:35000");
    Contact o7 = new Contact("Name:Rakesh","Email:Rakesh@870@gmail.com","Current_balance:67000");
    Contact o8 = new Contact("Name:Araya","Email:Araya@650@gmail.com","Current_balance:55000");
    Contact o9 = new Contact("Name:Sonal","Email:Sonal@222@gmail.com","Current_balance:89000");
    Contact o10 = new Contact("Name:Saloni","Email:Saloni@311@gmail.com","Current_balance:50000");

    RecyclerView recyclerView;

    Contact [] contacts={o1,o2,o3,o4,o5,o6,o7,o8,o9,o10};
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts,getApplicationContext());
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        ad.OnRecyclerViewClickListener(new CustomAdapter.OnRecyclerViewClickListener() {
            @Override
            public void OnItemClick(int position) {
                //Toast.makeText(MainActivity2.this, "Position:"+position, Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(MainActivity2.this,MainActivity4.class);
               // intent.putExtra("imajeIntent",contacts.get(position).getName());
                intent1.putExtra("nameIntent", contacts[position].getName());
                intent1.putExtra("email_idIntent",contacts[position].getEmail_id());
                intent1.putExtra("current_balanceIntent",contacts[position].getCurrent_balance());
                startActivity(intent1);
            }
        });
    }


}