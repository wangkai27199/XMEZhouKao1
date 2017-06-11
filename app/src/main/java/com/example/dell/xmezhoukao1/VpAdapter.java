package com.example.dell.xmezhoukao1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DELL on 2017/6/10.
 */

public class VpAdapter extends FragmentPagerAdapter {

    String[] arr = {"热点", "娱乐", "体育", "科技", "财经"};

    public VpAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (0 == position){
            AFragment aFragment = new AFragment();
            return aFragment;
        }else if (1 == position){
            BFragment bFragment = new BFragment();
            return bFragment;
        }else {
            CFragment cFragment = new CFragment();
            return cFragment;
        }
    }

    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return arr[position];
    }
}
