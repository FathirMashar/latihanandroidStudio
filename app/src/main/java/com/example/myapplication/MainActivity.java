package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.drm.DrmStore;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    ActionBarDrawerToggle ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tb = findViewById(R.id.tb);
        DrawerLayout drawer = findViewById(R.id.drawer);
        ab = new ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close);
        drawer.addDrawerListener(ab);
        ab.syncState();
        tb.setOverflowIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_more_vert_black_24dp));
        setSupportActionBar(tb);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (ab.onOptionsItemSelected(item)){
            return true;
        }
        if (item.getItemId() == R.id.latihan1){
            Toast.makeText(this, "Latihan1", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.latihan2){
            Toast.makeText(this, "Latihan2", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.latihan3){
            Toast.makeText(this, "Latihan3", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.latihan4){
            Toast.makeText(this, "Latihan4", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
