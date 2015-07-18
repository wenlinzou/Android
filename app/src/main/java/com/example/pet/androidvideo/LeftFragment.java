package com.example.pet.androidvideo;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment {


    public LeftFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        Log.e("LeftFragment","onAttach()");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e("LeftFragment","onCreate()");
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("LeftFragment","onCreateView()");
        return inflater.inflate(R.layout.fragment_left, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.e("LeftFragment","onActivityCreated()");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e("LeftFragment","onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("LeftFragment","onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("LeftFragment","onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("LeftFragment","onStop()");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.e("LeftFragment","onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onDetach(){
        Log.e("LeftFragment","onDetach()");
        super.onDetach();
    }
}
