package com.example.baitaptablayout;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewpagerAdapter extends FragmentStatePagerAdapter {
    public ViewpagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NameFragment();
            case 1:
                return new IdFragment();
            case 2:
                return new ClassFragment();
            default:
                return new ClassFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}