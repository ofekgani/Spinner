package com.example.spinner;

import android.graphics.Color;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class NextActivity extends AppCompatActivity {

    Button button;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        linearLayout = findViewById(R.id.linearLayout);
        button = findViewById(R.id.btn_back);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add("Yellow");
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
        if(st.equals("Yellow")){
            linearLayout.setBackgroundColor(Color.YELLOW);
        }
        return true;
    }

    public void back(View view) {
        finish();
    }
}
