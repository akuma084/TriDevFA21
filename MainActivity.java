package com.example.getuserinput;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.*;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.*;
import com.google.firebase.firestore.auth.User;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "egg";
    String name, email;
    int user = 0;
    EditText nameInput, emailInput;
    Button submitButton, readButton;

    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("Users");

    //get from database
    private FirebaseDatabase rb = FirebaseDatabase.getInstance();
    private DatabaseReference dataReference = rb.getReference();
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        submitButton = (Button)findViewById(R.id.button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();

                HashMap<String, String> usermap = new HashMap<>();
                usermap.put("Name", name);
                usermap.put("Email", email);

                root.child("" + ++user).setValue(usermap);
            }
        });

//ok up to this point

        dataReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                showData(snapshot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }

    private void showData(DataSnapshot snapshot) {
        int i = 0;
        for(DataSnapshot data:snapshot.getChildren()) {
            UserInfo user = new UserInfo();
            user.setName(snapshot.child("" + ++i).getValue(UserInfo.class).getName());
            user.setEmail(snapshot.child("" + ++i).getValue(UserInfo.class).getEmail());

            Log.d(TAG, "Name: " + user.getName());
            Log.d(TAG, "Email: " + user.getEmail());

            ArrayList<String> arr = new ArrayList<>();
            arr.add(user.getName());
            arr.add(user.getEmail());
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, arr);
            mListView.setAdapter(adapter);
        }
    }

}