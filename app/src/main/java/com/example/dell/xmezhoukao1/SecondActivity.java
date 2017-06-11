package com.example.dell.xmezhoukao1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String title = getIntent().getStringExtra("title");
        String data = getIntent().getStringExtra("data");

        TextView text_title = (TextView) findViewById(R.id.text_title);
        TextView text_data = (TextView) findViewById(R.id.text_data);
        text_title.setText(title);
        text_data.setText(data);
    }
}
