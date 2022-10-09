package com.example.btth4trongnghia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        Toast.makeText(MainActivity5.this, "Home", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.action_list:
                        Toast.makeText(MainActivity5.this, "List", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
                        startActivity(intent);
                        break;

                    case R.id.action_profile:
                        Toast.makeText(MainActivity5.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(MainActivity5.this, MainActivity2.class);
                        startActivity(intent1);
                        break;
                }
                return true;
            }
        });
    }
}