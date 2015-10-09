package com.cabatuan.starratingdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout rating;
    private  CheckBox star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rating = (LinearLayout) findViewById(R.id.ratings);

        /* Set listeners for each checkbox */
        for (int i = 1; i <= 5; i++) {
            star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener);
        }
    }

    private View.OnClickListener starsListener = new View.OnClickListener() {

        public void onClick(View view) {

            int tag = Integer.valueOf((String) view.getTag());

            /* Check all preceding checkbox and the current tag */
            for (int i = 1; i <= tag; i++) {
                star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }

            /* Uncheck the rest of the checkbox */
            for (int i = tag + 1; i <= 5; i++) {
                star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };

}
