package com.sam43.notificaitontest;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotificationOne extends AppCompatActivity {

    @BindView(R.id.text2)
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_one);
        ButterKnife.bind(this);
        String output = "Inside the activity of Notification two: ";

        // take the data and the extras of the intent
        Uri url = getIntent().getData();
        Bundle extras = getIntent().getExtras();

        output = output + url.toString();
        // if there are extras, add them to the output string
        if (extras != null) {
            output = output + " from " + extras.getString("from");

        }
        text2.setText(output);
    }
}
