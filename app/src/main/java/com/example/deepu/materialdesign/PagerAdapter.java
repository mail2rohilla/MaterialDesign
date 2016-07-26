package com.example.deepu.materialdesign;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DEEPU on 7/19/2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        EmptyFragment f = new EmptyFragment();
        Bundle b = new Bundle();
        b.putInt("data", position);
        f.setArguments(b);
        return f;
    }

    @Override
    public int getCount() {
        return 20;
    }
}
