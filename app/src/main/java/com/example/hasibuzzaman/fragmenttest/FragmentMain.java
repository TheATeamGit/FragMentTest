package com.example.hasibuzzaman.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Hasibuzzaman on 8/12/2016.
 */
public class FragmentMain  extends Fragment{
    Button btn;
    MainActivity mn;
    int a=10;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_main,container,false);
        btn = (Button) layout.findViewById(R.id.button);
        return layout;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        mn= (MainActivity) getActivity();
        super.onActivityCreated(savedInstanceState);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mn.action();
            }
        });
    }
}
