package com.example.projectone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class VPAdapter extends FragmentPagerAdapter {
    private List<Fragment> views;

    public VPAdapter(FragmentManager fm, List<Fragment> views) {
        super(fm);
        this.views = views;
    }

    @Override
    public Fragment getItem(int i) {
        return views.get(i);
    }

    @Override
    public int getCount() {
        return views.size();
    }
}
