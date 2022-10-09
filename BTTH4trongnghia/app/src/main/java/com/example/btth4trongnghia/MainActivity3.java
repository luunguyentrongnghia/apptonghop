package com.example.btth4trongnghia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button btnprofile,btnlistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Anhxa();
        ControlButton();
    }
   private void ControlButton() {
       btnprofile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
               startActivity(intent);
           }
       });
       btnlistview.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
               startActivity(intent);
           }
       });
   }
    private void Anhxa(){
        btnprofile=(Button) findViewById(R.id.openprofile);
        btnlistview=(Button) findViewById(R.id.openlistview);
    }
}
