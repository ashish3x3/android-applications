package com.example.firstactivity;

import android.app.Activity;
import android.content.*;
import android.view.LayoutInflater;
import android.view.*;
import android.view.ViewGroup;
import android.widget.*;
import android.widget.ImageView;
import android.widget.TextView;


public class OptionAdapter extends ArrayAdapter<Options>{

    Context context;
    int layoutResourceId;   
    Options data[] = null;
   
    public OptionAdapter(Context context, int layoutResourceId, Options[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
      OptionHolder holder = null;
       
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
           
            holder = new OptionHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
            
            
           
            row.setTag(holder);
            
            
        }
        else
        {
            holder = (OptionHolder)row.getTag();
        }
       
        Options options = data[position];
        holder.txtTitle.setText(options.title);
        holder.imgIcon.setImageResource(options.icon);
        
       
       
        return row;
    }
   
    static class OptionHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}