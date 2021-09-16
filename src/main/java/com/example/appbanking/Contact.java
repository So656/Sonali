package com.example.appbanking;

import android.content.Context;

public class Contact {
    public String name;
    public String email_id;
    public String current_balance;

    Contact(String name,String email_id,String current_balance){
        this.name=name;
        this.email_id=email_id;
        this.current_balance=current_balance;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getCurrent_balance() {
        return current_balance;
    }

    public void setCurrent_balance(String current_balance) {
        this.current_balance = current_balance;
    }
}

