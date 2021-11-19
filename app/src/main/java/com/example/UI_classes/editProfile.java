package app.src.main.java.com.example.UI_classes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class editProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);


        Button home = findViewById(R.id.button19);
        home.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });


        Button feed = findViewById(R.id.button2);
        feed.setOnClickListener(v -> {
            Intent intent = new Intent(this, Feed.class);
            startActivity(intent);
        });


        Button userProfile = findViewById(R.id.button3);
        userProfile.setOnClickListener(v -> {
            Intent intent = new Intent(this, user_Profile.class);
            startActivity(intent);
        });
    }
}
