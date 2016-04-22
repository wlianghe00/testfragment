package com.test.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/21 0021.
 */
public class DFragment extends BaseFragment {
    TabLayout tab_layout;
    ViewPager viewpager;

    List<Category> categories = new ArrayList<>();
    TabFragmentAdapter tabFragmentAdapter;

    @Override
    public View getView() {
        View view = View.inflate(getContext(), R.layout.layout_d, null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        tab_layout = (TabLayout) view.findViewById(R.id.tab_layout);

        viewpager = (ViewPager) view.findViewById(R.id.me_viewpager);
        viewpager.setOffscreenPageLimit(2);

        categories.add(Category.createCategory("aaa", "a", ClassesFragment.class.getName()));
        categories.add(Category.createCategory("bbb", "b", ClassesFragment.class.getName()));
        categories.add(Category.createCategory("ccc", "c", ClassesFragment.class.getName()));

        tabFragmentAdapter = new TabFragmentAdapter(getFragmentManager(), categories);
        viewpager.setAdapter(tabFragmentAdapter);
        tab_layout.setupWithViewPager(viewpager);
    }
}
