package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.intent.model.User;

public class ParcelableActivity extends AppCompatActivity {
    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";

    private EditText inputusername;
    private EditText inputname;
    private EditText inputage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        inputusername = findViewById(R.id.input_username);
        inputname = findViewById(R.id.input_name);
        inputage = findViewById(R.id.input_age);
    }

    public void handleSubmitParcelable(View view) {
        String username = inputusername.getText().toString();
        String name = inputname.getText().toString();
        int age = Integer.parseInt(inputage.getText().toString());
        User user = new User(username, name, age);
        Intent i = new Intent(this, ProfileParcelableActivity.class);
        i.putExtra("USERNAME", user.getUsername());
        i.putExtra("NAME", user.getName());
        i.putExtra("AGE", user.getAge());
        startActivity(i);
    }

}
