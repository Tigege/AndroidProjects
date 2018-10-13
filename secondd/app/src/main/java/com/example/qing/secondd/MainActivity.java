package com.example.qing.secondd;

import android.app.Notification;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sentNotice=(Button)findViewById(R.id.startNotice);
        sentNotice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,NotificationActivity.class);
                startActivity(intent);
            }
        });

        Button stratmain=(Button) findViewById(R.id.startSecond);
        stratmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

        dbHelper=new MyDatabaseHelper(this,"BookStort.db",null,1);
        Button createdb=(Button) findViewById(R.id.creater_database);

        createdb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Create db succeed!",Toast.LENGTH_LONG).show();
                dbHelper.getWritableDatabase();
            }
        });
    }
}
