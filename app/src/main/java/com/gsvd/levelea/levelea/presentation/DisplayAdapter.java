package com.gsvd.levelea.levelea.presentation;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;


public class DisplayAdapter<DisplayAdapter> extends FragmentPagerAdapter {
    public DisplayAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                Tab1Presentation t1 = new Tab1Presentation();
                return t1;
            case 1:
                Tab2Presentation t2 = new Tab2Presentation();
                return t2;
            case 2:
                Tab3Presentation t3 = new Tab3Presentation();
                return t3;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }//set the number of tabs

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Welcome";
            case 1:

                return "Student";
            case 2:

                return "Experience";

        }
        return null;
    }



}
