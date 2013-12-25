package com.home.myplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.home.myplan.activities.LoginActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //---Link to Login Activity---
        Intent loginIntent = new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
    }
}
