package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     * Both times you grab the View object (a TextView in one case, an ImageView in the other) using the findViewById method. You pass the id for the view, which you can find in the xml.
     * For the ImageView, you use the setImageResource method and pass the id of the drawable.
        For the TextView, you use the setText method we’ve seen before.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);

        // Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.status_text_view);
        textView.setText("I'm so full");

    }
}