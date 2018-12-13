package com.softwareengineering.softwareengineering;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static long buttonPushMeClicksCount = 0L;
    private static long buttonClickMeClicksCount = 0L;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Widgets
        Button buttonPushMe = findViewById(R.id.buttonPushMe);
        Button buttonClickMe = findViewById(R.id.buttonClickMe);

        // Updating buttons color
        updateButtonPushMeColor(buttonPushMe);
        updateButtonClickMeColor(buttonClickMe);
    }



    public void onClickButtonPushMe(View view) {
        Toast.makeText(this, String.format("This was clicked %d times.", ++buttonPushMeClicksCount), Toast.LENGTH_SHORT).show();
        updateButtonPushMeColor(view);
    }

    public void onClickButtonClickMe(View view) {
        Toast.makeText(this, String.format("This was clicked %d times.", ++buttonClickMeClicksCount), Toast.LENGTH_SHORT).show();
        updateButtonClickMeColor(view);
    }



    private static void updateButtonPushMeColor(View view) {
        Button button = (Button) view;
        button.setBackgroundColor(getColorRandomly());
        button.setTextColor(getColorRandomly());
    }

    private static void updateButtonClickMeColor(View view) {
        Button button = (Button) view;
        button.setBackgroundColor(getColorRandomly());
        button.setTextColor(getColorRandomly());
    }

    public static int getColorRandomly() {
        int r = (new Random()).nextInt(256); // 0 to 255
        int g = (new Random()).nextInt(256); // 0 to 255
        int b = (new Random()).nextInt(256); // 0 to 255
        return Color.parseColor(String.format("#%02x%02x%02x", r, g, b));
    }
}
