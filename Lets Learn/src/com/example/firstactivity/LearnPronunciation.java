package com.example.firstactivity;


import java.util.Locale;
 
import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
 
public class LearnPronunciation extends Activity implements
        TextToSpeech.OnInitListener {
 
    private TextToSpeech tts;
    private Button btn;
    private EditText txt;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_pronunciation);
 
        tts = new TextToSpeech(this, this);
 
        btn = (Button) findViewById(R.id.bpro);
 
        txt = (EditText) findViewById(R.id.editText1);
        btn.setOnClickListener(new View.OnClickListener() {
 
            @Override
            public void onClick(View arg0) {
                speak();
            }
 
        });
    }
 
    @Override
    public void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
 
    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            int result = tts.setLanguage(Locale.US);
            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                btn.setEnabled(true);
                speak();
            }
 
        } else {
            Log.e("TTS", "Initilization Failed!");
        }
 
    }
 
    private void speak() {
        String text = txt.getText().toString();
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
 
}

