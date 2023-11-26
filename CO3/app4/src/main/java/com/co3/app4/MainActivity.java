package com.co3.app4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.item1) {
            Toast.makeText(MainActivity.this, "item1", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.item2) {
            Toast.makeText(MainActivity.this, "item2", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (itemId == R.id.item3) {
            Toast.makeText(MainActivity.this, "item3", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (itemId == R.id.item4) {
            Toast.makeText(MainActivity.this, "item4", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}