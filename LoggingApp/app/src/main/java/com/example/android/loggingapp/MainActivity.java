package com.example.android.loggingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.android.loggingapp.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {

        TextView fMItem= (TextView)findViewById(R.id.menu_item_1);
        String menuItem1= fMItem.getText().toString();
        Log.v("MainActivity",menuItem1);

        // Find second menu item TextView and print the text to the logs
        TextView sMItem= (TextView)findViewById(R.id.menu_item_2);
        String menuItem2= sMItem.getText().toString();
        Log.v("MainActivity",menuItem2);

        // Find third menu item TextView and print the text to the logs
        TextView tMItem= (TextView)findViewById(R.id.menu_item_3);
        String menuItem3= tMItem.getText().toString();
        Log.v("MainActivity",menuItem3);

    }
}