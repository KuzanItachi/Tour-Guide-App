package com.example.android.tourguideappdhanbad;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionFragment();
        } else if (position == 1) {
            return new ReligiousFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.religious_sites);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurant);
        } else {
            return mContext.getString(R.string.shopping);
        }
    }
}
