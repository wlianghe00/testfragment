package com.test.myapplication;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabWidget;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    FragmentTabHost tabHost;
    TabWidget tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        tabHost.addTab(tabHost.newTabSpec("1").setIndicator(getView("1")), AFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("2").setIndicator(getView("2")), BFrament.class, null);
        tabHost.addTab(tabHost.newTabSpec("3").setIndicator(getView("3")), CFragement.class, null);
        tabHost.addTab(tabHost.newTabSpec("4").setIndicator(getView("4")), DFragment.class, null);
        tabs = tabHost.getTabWidget();
        tabs.setDividerDrawable(null);
    }

    public View getView(String str) {
        TextView tv = new TextView(this);
        tv.setText(str);
        return tv;
    }
}
