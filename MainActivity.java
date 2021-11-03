package com.example.firebasedemo;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;
import android.view.*;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    int clicks = 0;
    private Button button;
    private DatabaseReference fireBase;

    class PlaceHolder {
        String name;
        int followers;
        PlaceHolder(String name, int followers) {
            this.name = name;
            this.followers = followers;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashMap<String, Object> userOne = new HashMap<>(); //user class
        userOne.put("Name", "User One");
        userOne.put("Gym", "AVAC");
        userOne.put("Bio", "Hello, I'm User One");
        userOne.put("Sports preference", "Track");

        HashMap<String, Object> userTwo = new HashMap<>();
        userTwo.put("Name", "User Two");
        userTwo.put("Gym", "RIMAC");
        userTwo.put("Bio", "Hi, I'm User Two");
        userTwo.put("Sports preference", "Swimming");
        FirebaseDatabase.getInstance().getReference().child("FireBaseTriDevDemo").child("1").updateChildren(userOne);
        FirebaseDatabase.getInstance().getReference().child("FireBaseTriDevDemo").child("2").updateChildren(userTwo);


        List<PlaceHolder> userList = new ArrayList<>();
        for(int i = 1; i < 11; i++)
            userList.add(new PlaceHolder("User " + i, 10 + i));

        UserProfile emptyUser = new UserProfile();
        FirebaseDatabase.getInstance().getReference().child("FireBaseTriDevDemo").child("Android").setValue(emptyUser);
        fireBase = FirebaseDatabase.getInstance().getReference();
        newUser("User Zero", 23);

        //FirebaseDatabase.getInstance().getReference().child("FireBaseTriDevDemo").child("Android").setValue("test!");
    }

    public void onClick(View view) {
        try {
            TextView text = findViewById(R.id.textDemo);
            text.setText("Button clicked " + ++clicks + " times");
        }
        catch(Exception e) {
            Log.d("Error", e.toString());
        }
    }

    public void newUser(String name, int followers) {
        PlaceHolder u = new PlaceHolder(name,followers);
        fireBase.child("users").setValue(u);
    }
}