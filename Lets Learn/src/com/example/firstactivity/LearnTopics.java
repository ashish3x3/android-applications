package com.example.firstactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

 
public class LearnTopics extends Activity{
	 ListView listView ;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);


          // Get ListView object from xml
       listView = (ListView) findViewById(R.id.list);
            
            // Defined Array values to show in ListView
            final String[] values = new String[] { "Culture", 
                                             "Geography",
                                             "Parliament",
                                             "Constitution", 
                                             "Sports", 
                                             
                                            };
    
            // Define a new Adapter
            // First parameter - Context
            // Second parameter - Layout for the row
            // Third parameter - ID of the TextView to which the data is written
            // Forth - the Array of data
    
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
              android.R.layout.simple_list_item_1, android.R.id.text1, values);
    
    
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
                   String  itemValueName=values[position]; 
                  // String className = "com.example.firstactivity."+values[itemPosition] +".class";
                   //Intent openNewIntent = new Intent( this, Class.forName( className ) );
                   //String className = "com.example.firstactivity.itemValue";
                      
                    // Show Alert 
                    /*Toast.makeText(getApplicationContext(),
                      "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                      .show();*/
                    String open_class = values[position];

                    try {
                        /*String className = "com.www.tutorialforandroid.com.geoQuiz";
                        Intent i = new Intent( FirstActivity.this, Class.forName( className ) );
                        i.putExtra("id",itemPosition);*/
                    	Class selected = Class.forName("com.example.firstactivity."+open_class);
                        Intent i = new Intent(LearnTopics.this,selected);
                        
                        startActivity(i);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                      

                     
                 
                  }
    
             });


    } //onCretate
 
}