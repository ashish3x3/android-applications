package com.example.firstactivity;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 
public class Instructions extends Activity{
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions);
        Button button = (Button)findViewById(R.id.bans);
        button.setOnClickListener(new View.OnClickListener() {
 
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
            	startActivity(new Intent(Instructions.this,List.class));   
            }
        });
    }
}