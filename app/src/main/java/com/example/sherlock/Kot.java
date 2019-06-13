package com.example.sherlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Kot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kot);
    }
    public final static String THIEF = "ru.alexanderklimov.sherlock.THIEF";

    public void onRadioClick(View v) {
        Intent answerIntent = new Intent();

        switch (v.getId()) {
            case R.id.radioDog:
                answerIntent.putExtra(THIEF, "Сраный пёсик");
                break;
            case R.id.radioCrow:
                answerIntent.putExtra(THIEF, "Ворона");
                break;
            case R.id.radioCat:
                answerIntent.putExtra(THIEF, "Лошадь Пржевальского");
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent);
        finish();
    }
}
