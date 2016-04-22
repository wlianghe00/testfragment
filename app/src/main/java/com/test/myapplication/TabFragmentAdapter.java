package com.test.myapplication;

/**
 * Created by Administrator on 2016/4/22 0022.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/3/23 0023.
 */
public class TabFragmentAdapter extends FragmentPagerAdapter {
    public List<Category> categories;

    public TabFragmentAdapter(FragmentManager fm, List<Category> categories) {
        super(fm);
        this.categories = categories;
    }


    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        Category category = categories.get(position);
        String fragmentName = category.getFragmentName();
        Bundle bundle = new Bundle();
        try {
            Class c = Class.forName(fragmentName);
            fragment = (Fragment) c.newInstance();
            bundle.putParcelable("category", category);
            bundle.putInt("tabPosition", position);
            fragment.setArguments(bundle);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return categories == null ? 0 : categories.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return categories.get(position).getCateName();
    }

}

