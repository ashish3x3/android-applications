package com.example.firstactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

 
public class GeographyQuiz extends Activity{
	private RadioGroup radioGroupWebsite;
	   private RadioButton radioBtn1;
	   private Button btnClickName;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geography_quiz);
        
        addListenerRadioButton();
        
        
        
        
    }
    
    private void addListenerRadioButton() {

        radioGroupWebsite = (RadioGroup) findViewById
        (R.id.rg1);
     	btnClickName = (Button) findViewById(R.id.bans);
      
     	btnClickName.setOnClickListener(new OnClickListener() {
      
           @Override
           public void onClick(View v) {

             // get selected radio button from radioGroupWebsite
             int selected =  
             radioGroupWebsite.getCheckedRadioButtonId();
             radioBtn1 = (RadioButton) findViewById(selected);
             Toast.makeText(GeographyQuiz.this,
             radioBtn1.getText(), Toast.LENGTH_SHORT).show();
     	  }
     	 });	
 	}
    
}