package com.example.realnapster.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Realnapster on 2/4/2018.
 */

public class FragmentB extends Fragment {

    TextView tvFragB;
    String data;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        if (savedInstanceState==null){}
        else{
            data = savedInstanceState.getString("text");
//            TextView tv = view.findViewById(R.id.tvFragB);
//            tv.setText(data);
            tvFragB = view.findViewById(R.id.tvFragB);
            tvFragB.setText(data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvFragB = getActivity().findViewById(R.id.tvFragB);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",data);
    }

    public void changeText(String data){
        this.data=data;
        tvFragB.setText(data);
    }
}
