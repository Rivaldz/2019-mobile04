package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

//    private EditText outputUsename;
//    private EditText outputName;
//    private EditText outputAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        // TODO: bind here
        Bundle extras = getIntent().getExtras();
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        if (extras != null) {
            // TODO: display value her
            String username = extras.getString("username");
            String name = extras.getString("name");
            int age = extras.getInt("age");
            

            usernameText.setText(username);
            nameText.setText(name);





        }
    }
}
