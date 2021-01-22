package com.example.javamemu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    ImageView imgRab;
    static int BACKRED=1, BACKGREEN=2, BACKBLUE=3, BACKBASE=4;
    static int IMGROT=5, IMGBASE=6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.layout);
        imgRab=findViewById(R.id.imgRab);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,BACKRED,0,"배경_빨강");
        menu.add(0,BACKGREEN,0,"배경_초록");
        menu.add(0,BACKBLUE,0,"배경_파랑");
        menu.add(0,BACKBASE,0,"배경_기본");
        SubMenu subMenu=menu.addSubMenu("이미지 변경>>");
        subMenu.add(0,IMGROT,0,"이미지 180도 회전");
        subMenu.add(0,IMGBASE,0,"이미지 원래대로");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 1:
                layout.setBackgroundColor(Color.RED);
                break;
            case 2:
                layout.setBackgroundColor(Color.GREEN);
                break;
            case 3:
                layout.setBackgroundColor(Color.BLUE);
                break;
            case 4:
                layout.setBackgroundColor(Color.WHITE);
             break;
            case 5:
                imgRab.setRotation(180);
                break;
            case 6:
                imgRab.setRotation(0);
                break;
    }
        return super.onOptionsItemSelected(item);
    }
}