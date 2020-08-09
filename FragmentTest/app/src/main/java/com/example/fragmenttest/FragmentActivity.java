package com.example.fragmenttest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.fragmenttest.fragments.FirstFragment;
import com.example.fragmenttest.fragments.SecondFragment;

import java.util.ArrayList;
import java.util.List;

public class FragmentActivity extends AppCompatActivity {

    private ViewPager vpPager;
    private SwipeAdapter swipeAdapter;
    //private SlidePageAdapter slidePageAdapter;

    /***
     * Here we have created two different sliders
     * 1) First return same fragement with different text
     * 2) Second returns the different fragement.
     *  Just uncomment the onCreate method based on requirement.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        vpPager = (ViewPager) findViewById(R.id.vpPager);
        vpPager.setOffscreenPageLimit(1);
        swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
        vpPager.setAdapter(swipeAdapter);
        vpPager.setCurrentItem(0);
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        List<Fragment> list = new ArrayList<>();
        list.add(new FirstFragment());
        list.add(new SecondFragment());

        vpPager = (ViewPager) findViewById(R.id.vpPager);
        vpPager.setOffscreenPageLimit(1);
        slidePageAdapter = new SlidePageAdapter(getSupportFragmentManager(),list);
        vpPager.setAdapter(slidePageAdapter);
    }*/
}