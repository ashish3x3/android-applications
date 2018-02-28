package com.example.firstactivity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.view.*;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.*;
 
public class MainActivity extends Activity {
	
	//private ListView listView1;
	//Options optionsdata []=null;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
 
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
            	startActivity(new Intent(MainActivity.this,List.class));   
            }
        });

        /*    optionsdata = new Options[]
        {
            new Options(R.drawable.quiz1, "Quiz"),
            new Options(R.drawable.quiz, "Quiz1"),
            new Options(R.drawable.logo, "Logo"),
            new Options(R.drawable.study, "Study"),
            new Options(R.drawable.ic_launcher, "Launcher")
        };
       
        OptionAdapter adapter = new OptionAdapter(this,
                R.layout.listview_item_row, optionsdata);
       
       
        listView1 = (ListView)findViewById(R.id.list);
        
        View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
        listView1.addHeaderView(header);
       
        listView1.setAdapter(adapter);
        
        ListView listView = getListView();
		listView.setTextFilterEnabled(true);
 
		listView.setOnItemClickListener(new OnItemClickListener() {
			
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
			    // When clicked, show a toast with the TextView text
			    Toast.makeText(getApplicationContext(),
				((TextView) view).getText(), Toast.LENGTH_SHORT).show();
			}
		});*/
        
        
    }
    //}
    
    /*@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);
       // String item = (String) listView1.getAdapter().getItem(position);
        Object o = this.getListAdapter().getItem(position);
        String keyword = o.toString();
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected OnListItemClicked", Toast.LENGTH_LONG).show();
 
        
 
    }
    */
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
 
}