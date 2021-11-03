package app.src.main.java.com.example.UI_classes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button2);

        btn1.setOnClickListener(v -> {

                    Intent intent = new Intent(this, Feed.class);

                    startActivity(intent);

                });
        Button user_profile = findViewById(R.id.button3);
        user_profile.setOnClickListener(v -> {
            Intent intent = new Intent(this, user_Profile.class);
            startActivity(intent);
            });
        Button dms = findViewById(R.id.button5);
        dms.setOnClickListener(v -> {
            Intent intent = new Intent(this, direct_message.class);
            startActivity(intent);
            });
        Button home = findViewById(R.id.button6);
        home.setOnClickListener(v -> {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
            });
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}