package com.test.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/4/22 0022.
 */
public class ClassesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView tv = new TextView(getContext());
        Bundle bundle = getArguments();
        if(bundle != null) {
            int position = bundle.getInt("tabPosition");
            tv.setText(position + "!!!!!!!!!!\n\n\n\n\n" + position);
        }
        return tv;
    }
}
