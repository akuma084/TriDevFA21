package app.src.main.java.com.example.UI_classes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);



        // Get the Intent that started this activity and extract the string
        Intent search = getIntent();
        String message = search.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        Button btn1 = findViewById(R.id.button7);

        btn1.setOnClickListener(v -> {

            Intent intent = new Intent(this, Feed.class);

            startActivity(intent);
        });

        Button home = findViewById(R.id.button8);
        home.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        Button profile = findViewById(R.id.button9);
        profile.setOnClickListener(v -> {
            Intent intent = new Intent(this, user_Profile.class);
            startActivity(intent);
        });
    }

}


