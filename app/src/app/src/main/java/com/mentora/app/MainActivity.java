package com.mentora.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Mentora v1.2");
        textView.setTextSize(28);
        textView.setPadding(40, 40, 40, 40);

        setContentView(textView);
    }
}