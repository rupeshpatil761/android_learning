package com.example.fragmenttest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.fragmenttest.fragments.FirstFragment;

public class SwipeAdapter extends FragmentStatePagerAdapter {

    public SwipeAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment firstFragment = new FirstFragment();
        Bundle bundle = new Bundle();
        String pageNumber  = "PAGE " + (++position);
        bundle.putString("pageNumber", pageNumber);
        firstFragment.setArguments(bundle);
        return firstFragment;
    }


    @Override
    public int getCount() {
        return 4;
    }
}
