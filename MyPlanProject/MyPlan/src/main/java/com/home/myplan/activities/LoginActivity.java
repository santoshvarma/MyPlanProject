package com.home.myplan.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.home.myplan.R;

/**
 * Created by santosh on 12/24/13.
 */
public class LoginActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
    }

    public void validateLogin(View loginBtn){
        Intent userPostsIntent = new Intent(this, UserPostsActivity.class);
        startActivity(userPostsIntent);
    }

}
