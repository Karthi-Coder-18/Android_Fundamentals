package com.karthik.android_fundamentals;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityMethods extends AppCompatActivity implements View.OnClickListener {

    Button newActivity;
    String TAG = "Lifecycle Methods:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Whenever an activity is created the android system calls the onCreate() method which creates the activity.
        // Here the startup logic can be written which happens only once in the lifecycle of the activity. Declaring UI i.e. setting the content view using the XML file, defining member variables etc..
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methods);
        Log.i(TAG, "onCreate Method called");
        newActivity = findViewById(R.id.btn_activity);
        newActivity.setOnClickListener(this);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        this.startActivity(intent);

        // savedInstanceState parameter which is a Bundle object will save the previous state of the application and opens the same state when the user returns back to activity.
        // If the activity has never existed before the value of Bundle object is "NULL"

    }

    public void onClick(View v) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart method called");
        // When this method is called the UI logic of the app is initialized & app enters into the foreground state where it will be visible to the user.
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume method called");
        // When the activity enters the Resumed state, it comes to the foreground, and the system invokes the onResume() callback.
        // This is the state in which the app interacts with the user. The app stays in this state until something happens to take focus away from the app, such as the device receiving a phone call, the user navigating to another activity, or the device screen turning off.


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause method called");
        // The opening of a new, semi-transparent activity, such as a dialog, pauses the activity it covers. As long as the activity is partially visible but not in focus, it remains paused.
        // in this state activity is still in foreground state and will be visible to the user, but user will not be able to interact with the UI.
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop method called");
        // When your activity is no longer visible to the user, it enters the Stopped state, and the system invokes the onStop() callback. This can occur when a newly launched activity covers the entire screen.

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart method called");
        // From the onStop state if the activity comes back to be visible to the user or interact then onRestart method gets called.

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy method called");
        // From onStop state if the application is finished running and is no longer required for the user interaction the onDestroy method gets called.
    }
}