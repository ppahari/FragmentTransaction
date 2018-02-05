package com.example.realnapster.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MyFragment frag = new MyFragment();
//        FragmentManager fm = getFragmentManager();
//        FragmentTransaction transaction = fm.beginTransaction();
//        transaction.add(R.id.my_layout,frag,"HelloFragment");
//        transaction.commit();
    }

    @Override
    public void response(String data) {
        FragmentManager fm = getFragmentManager();
        FragmentB fragB =(FragmentB) fm.findFragmentById(R.id.fragmentB);
        fragB.changeText(data);
    }
}
