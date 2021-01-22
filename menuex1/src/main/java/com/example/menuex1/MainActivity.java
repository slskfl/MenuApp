package com.example.menuex1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    EditText edtRadius;
    ImageView imageView;
    int radius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.layout);
        edtRadius=findViewById(R.id.edtRadius);
        imageView=findViewById(R.id.image);
        radius=Integer.getInteger(edtRadius.getText().toString());
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
            case R.id.imgRotation:
                imageView.setRotation(radius);
                break;
            case R.id.imgScale:
                imageView.setScaleX(2);
                imageView.setScaleY(2);
                break;
            case R.id.imgBase:
                imageView.setScaleX(1);
                imageView.setScaleY(1);
                imageView.setRotation(0);
                break;
            case R.id.imgHan:
                imageView.setImageResource(R.drawable.image02);
                break;
            case R.id.imgChu:
                imageView.setImageResource(R.drawable.chuja);
                break;
            case R.id.imgBam:
                imageView.setImageResource(R.drawable.bam);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}