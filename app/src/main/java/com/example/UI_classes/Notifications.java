package app.src.main.java.com.example.UI_classes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifcations);

        Button btn1 = findViewById(R.id.button18);

        btn1.setOnClickListener(v -> {

            Intent intent = new Intent(this, Feed.class);

            startActivity(intent);
        });

        Button home = findViewById(R.id.button21);
        home.setOnClickListener(v -> {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        });

        Button profile = findViewById(R.id.button22);
        profile.setOnClickListener(v -> {
            Intent intent = new Intent(this, user_Profile.class);
            startActivity(intent);
        });


        Button notifications = findViewById(R.id.button23);
        notifications.setOnClickListener(v -> {
            Intent intent = new Intent(this, Notifications.class);
            startActivity(intent);
        });

        Button messages = findViewById(R.id.button24);
        messages.setOnClickListener(v -> {
            Intent intent = new Intent(this, Messages.class);
            startActivity(intent);
        });
    }
}
