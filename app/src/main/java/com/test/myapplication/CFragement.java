package com.test.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/4/21 0021.
 */
public class CFragement extends BaseFragment {

    @Override
    public View getView() {
        TextView tv = new TextView(getContext());
        tv.setText(getClass().getSimpleName());
        return tv;
    }
}
