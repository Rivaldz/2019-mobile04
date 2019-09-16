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

    private EditText username;
    private EditText name;
    private EditText age;
    User user = new User(username, name, age);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
    }
    public void handleSubmit(View view) {
        String username = username.getText().toString();
        String name = name.getText().toString();
        int age = Integer.parseInt(age.getText().toString());
        Intent intent = new Intent(this, ProfileBundleActivity.class);
        intent.putExtra(USERNAME_KEY,username);
        intent.putExtra(NAME_KEY , name);
        intent.putExtra(AGE_KEY , age);
        startActivity(intent);
    }

}
