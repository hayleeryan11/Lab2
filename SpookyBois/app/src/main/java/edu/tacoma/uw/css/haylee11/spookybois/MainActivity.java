package edu.tacoma.uw.css.haylee11.spookybois;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kaiMethod(View view) {
        Intent intent = new Intent(this, imageActivity.class);
        startActivity(intent);
    }
}
