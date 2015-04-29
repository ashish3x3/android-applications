package com.example.firstactivity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
 
public class List extends Activity {
	
	ListView listView ;
 
    String list_item[] = { "Instructions", "LearnTopics", "TakeQuiz" ,"LearnPronunciation" };
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.list_view);
        
        listView = (ListView) findViewById(R.id.list);
        
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
              android.R.layout.simple_list_item_1, android.R.id.text1, list_item);
    
    
            // Assign adapter to ListView
            listView.setAdapter(adapter); 
            
            // ListView Item Click Listener
            listView.setOnItemClickListener(new OnItemClickListener() {
 
                  @Override
                  public void onItemClick(AdapterView<?> parent, View view,
                     int position, long id) {
                    
                   // ListView Clicked item index
                   int itemPosition     = position;
                   
                   // ListView Clicked item value
                   String  itemValue    = (String) listView.getItemAtPosition(position);
                   String  itemValueName=list_item[position]; 
                  // String className = "com.example.firstactivity."+values[itemPosition] +".class";
                   //Intent openNewIntent = new Intent( this, Class.forName( className ) );
                   //String className = "com.example.firstactivity.itemValue";
                      
                    // Show Alert 
                    /*Toast.makeText(getApplicationContext(),
                      "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                      .show();*/
                    String open_class = list_item[position];

                    try {
                        /*String className = "com.www.tutorialforandroid.com.geoQuiz";
                        Intent i = new Intent( List.this, Class.forName( className ) );
                        i.putExtra("id",itemPosition);*/
                    	Class selected = Class.forName("com.example.firstactivity."+open_class);
                        Intent i = new Intent(List.this,selected);
                        
                        startActivity(i);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                      

                     
                 
                  }
    
             });
 
       
         
        
        
        /*setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, list_item));*/
    }
 
    /*@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);
        String open_class = list_item[position];
        try{
          Class selected = Class.forName("com.example.firstactivity."+open_class);
          Intent selected_activity = new Intent(this,selected);
          startActivity(selected_activity);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
 
        
 
    }*/
}