package com.sam43.notificaitontest;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotificationTwo extends AppCompatActivity {

    @BindView(R.id.tv_test_view)
    TextView tvTestView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_two);
        ButterKnife.bind(this);
        CharSequence s = "Inside the activity of Notification one ";
        int id = 0;

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            s = "error";
        } else {
            id = extras.getInt("notificationId");
        }

        s = s + "with id = " + id;
        tvTestView.setText(s);
        NotificationManager myNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // remove the notification with the specific id
        myNotificationManager.cancel(id);
    }
}
