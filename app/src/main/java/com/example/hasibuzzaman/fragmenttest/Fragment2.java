package com.example.hasibuzzaman.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hasibuzzaman on 8/12/2016.
 */
public class Fragment2 extends Fragment {
    TextView tv;
    int n=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout= inflater.inflate(R.layout.fragment_2,container,false);
        tv= (TextView) layout.findViewById(R.id.textView);
        return layout;
    }

    public void post() {
        tv.setText((n++)+"");
    }
}
