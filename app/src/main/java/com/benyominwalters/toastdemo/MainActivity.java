package com.benyominwalters.toastdemo;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void showToast(View view) {

        Log.i("Info:", "clicked");

        EditText nameEditText2 = (EditText) findViewById(R.id.nameEditText2);

        Toast.makeText(MainActivity.this, "Hi there, " + nameEditText2.getText().toString(), Toast.LENGTH_LONG ).show();
    }

    public void showCat (View view) {
        Log.i("Info:", "Want cat!");

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.cat);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
