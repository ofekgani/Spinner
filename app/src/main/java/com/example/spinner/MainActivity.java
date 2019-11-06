package com.example.spinner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.layout);
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
}
