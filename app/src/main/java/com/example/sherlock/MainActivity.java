package com.example.sherlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    static final private int CHOOSE_THIEF = 0;

    public void onClick(View v) {
        Intent questionIntent = new Intent(MainActivity.this,
                Kot.class);
       // startActivityForResult(questionIntent, CHOOSE_THIEF);
        startActivity(new Intent("com.example.sherlock.Kot"));
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView infoTextView = (TextView) findViewById(R.id.textViewInfo);

        if (requestCode == CHOOSE_THIEF) {
            if (resultCode == RESULT_OK) {
                String thiefname = data.getStringExtra(Kot.THIEF);
                infoTextView.setText(thiefname);
            }else {
                infoTextView.setText(""); // стираем текст
            }
        }
    }
//    public void onClick1(View view) {
//        startActivity(new Intent("com.example.sherlock.Kot"));
//    }



}
