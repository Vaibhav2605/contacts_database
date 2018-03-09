package com.example.vaibhav.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db= new DatabaseHandler(this);

        //insert contacts
        Log.d("Insert:","Insertin..");
        db.addContact(new Contact("Vaibhav","9876543210"));
        db.addContact(new Contact("LOL","9876243240"));
        db.addContact(new Contact("DUN DUN","9876543223"));
        db.addContact(new Contact("Shaam tak khelenge","9652343210"));

        //read them back
        Log.d("Reading:","Reading all contacts...");
        List<Contact> contactList=db.getAllContacts();

        


    }
}
