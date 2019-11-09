package com.example.spinner;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button button;
    LinearLayout linearLayout;
    Intent next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.layout);
        button = findViewById(R.id.btn_next);

         next = new Intent(this,NextActivity.class);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st = item.getTitle().toString();
        if(st.equals("White")){
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        if(st.equals("Green")){
            linearLayout.setBackgroundColor(Color.GREEN);
        }
        if(st.equals("Red")){
            linearLayout.setBackgroundColor(Color.RED);
        }
        if(st.equals("Blue")){
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        return true;
    }

    public void next(View view) {
        startActivity(next);
    }
}
