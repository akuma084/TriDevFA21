package app.src.main.java.com.example.UI_classes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class user_Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        Button btn1 = findViewById(R.id.button4);

        btn1.setOnClickListener(v -> {

            Intent intent = new Intent(this, Feed.class);

            startActivity(intent);
        });

        Button home = findViewById(R.id.button10);
        home.setOnClickListener(v -> {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        });

        Button profile = findViewById(R.id.button11);
        profile.setOnClickListener(v -> {
            Intent intent = new Intent(this, user_Profile.class);
            startActivity(intent);
        });
    }
}