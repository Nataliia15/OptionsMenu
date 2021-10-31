package com.example.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int ITEM_ONE=1;
    public static final int ITEM_TWO=2;
    public static final int ITEM_THREE=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0,ITEM_ONE,1,"Item 1");
        menu.add(0,ITEM_TWO,2,"Item2");
        menu.add(0,ITEM_THREE,3,"Item 3");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case ITEM_ONE:
                Toast.makeText(getApplicationContext(),"Item 1",Toast.LENGTH_LONG).show();
                break;
            case ITEM_TWO:
                Toast.makeText(getApplicationContext(),"Item 2",Toast.LENGTH_LONG).show();
                break;
            case ITEM_THREE:
                Toast.makeText(getApplicationContext(),"Item 3",Toast.LENGTH_LONG).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}