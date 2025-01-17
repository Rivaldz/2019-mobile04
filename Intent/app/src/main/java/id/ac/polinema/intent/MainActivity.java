package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicitIntent(View view) {
        Intent inten = new Intent(this, ExplicitIntentActivity.class);
        startActivity(inten);
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleImplicitIntent(View view) {
        Intent inten = new Intent(this, ImplicitIntentActivity.class);
        startActivity(inten);

    }

//    public void handleProfileBundleActivity(View view) {
//    }

    public void handleActivityBundle(View view) {
        Intent inten = new Intent(this, BundleActivity.class);
        startActivity(inten);
    }

    public void handleParcelable(View view) {
        Intent inten = new Intent(this, ParcelableActivity.class);
        startActivity(inten);
    }
}
