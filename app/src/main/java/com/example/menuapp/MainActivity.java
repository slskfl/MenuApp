package com.example.menuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    ImageView imgChuja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.layout1);
        imgChuja=findViewById(R.id.imgChuja);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.optmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.bgRed:
                layout.setBackgroundColor(Color.RED);
                break;
            case R.id.bgGreen:
                layout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.bgBlue:
                layout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.bgBase:
                layout.setBackgroundColor(Color.WHITE);
                break;
            case R.id.imgRotation:
                imgChuja.setRotation(180);
                break;
            case R.id.imgBase:
                imgChuja.setRotation(0);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}