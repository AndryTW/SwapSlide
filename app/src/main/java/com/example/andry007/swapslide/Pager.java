package com.example.andry007.swapslide;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by andry007 on 07/12/2016.
 */

public class Pager extends FragmentStatePagerAdapter {
    int indi;
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        indi= tabCount;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab1();
            case 1:
                return new Tab2();
            case 2:
                return new Tab3();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return indi;
    }
}
