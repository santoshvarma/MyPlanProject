package com.home.myplan.fragments;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.home.myplan.R;

/**
 * Created by santosh on 12/24/13.
 */
public class FriendsPostsFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_friends_posts, container, false);

        String[] values = new String[] { "Darin Cummins", "Rob Grimstad", "Jarad Duersch",
                "Wall Brad", "Jay Ashworth", "Jason Belcher", "Mike Hepworth", "Chris Denos",
                "Caldwell Jaimie", "Christopher Hauck" };

        ArrayAdapter<String> files = new ArrayAdapter<>(getActivity(),
                R.layout.list_view_row,R.id.friendsName,
                values);

        this.setListAdapter(files);



        return rootView;
    }
}
