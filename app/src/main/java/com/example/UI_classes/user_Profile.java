package app.src.main.java.com.example.UI_classes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class user_Profile extends AppCompatActivity {


//    //
//    private DatabaseReference user_database;
//    //
//
//    public void writeProfile(DatabaseReference database) {
//        user_database = FirebaseDatabase.getInstance().getReference();
//    }
//    @IgnoreExtraProperties
//    public class User {
//
//        public String username;
//        public String email;
//        public String availability;
//        public String location;
//        public String fitnessLevel;
//
//        public User(String name, String email) {
//
//        }
//
//        public User(String username, String email, String availability, String location, String fitnessLevel) {
//            this.username = username;
//            this.email = email;
//            this.availability = availability;
//            this.location = location;
//            this.fitnessLevel = fitnessLevel;
//        }
//    }
//
//    public void writeNewProfile(String userId, String name, String email, String availability, String location, String fitnessLevel) {
//        User user = new User(name, email, availability, location, fitnessLevel);
//        user_database.push().getKey();
//        user_database.child("users").child(userId).setValue(user)
//                .addOnSuccessListener(new OnSuccessListener<Void>() {
//                    @Override
//                    public void onSuccess(Void aVoid) {
//
//                    }
//                });
//    }
//    private EditText name;
//    private EditText locations;
//    private EditText availability;
//    private EditText fitnessLevel;
//    private Spinner user_info_spinner;
//
//    Button add_btn = findViewById(R.id.pushUser);
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
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        Button profile = findViewById(R.id.button11);
        profile.setOnClickListener(v -> {
            Intent intent = new Intent(this, user_Profile.class);
            startActivity(intent);
        });

        Button editProfile = findViewById(R.id.button17);
        editProfile.setOnClickListener(v -> {
            Intent intent = new Intent(this, editProfile.class);
            startActivity(intent);
        });
    }
}
