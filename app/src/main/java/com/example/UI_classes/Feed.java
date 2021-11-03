package app.src.main.java.com.example.UI_classes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Feed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        Button feed = findViewById(R.id.button12);

        feed.setOnClickListener(v -> {

            Intent intent = new Intent(this, Feed.class);

            startActivity(intent);
        });

        Button home = findViewById(R.id.button13);
        home.setOnClickListener(v -> {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        });

        Button profile = findViewById(R.id.button14);
        profile.setOnClickListener(v -> {
            Intent intent = new Intent(this, user_Profile.class);
            startActivity(intent);
        });
    }

}
