package com.home.myplan.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.home.myplan.fragments.AllPostsFragment;
import com.home.myplan.fragments.CityRTownPostsFragment;
import com.home.myplan.fragments.FriendsPostsFragment;

/**
 * Created by santosh on 12/24/13.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Friends fragment activity
                return new FriendsPostsFragment();
            case 1:
                // City/Town fragment activity
                return new CityRTownPostsFragment();
            case 2:
                // All Posts fragment activity
                return new AllPostsFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
}
