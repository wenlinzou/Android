package com.example.pet.androidvideo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    public void onStart() {
        Log.i("MainActivity", "onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("MainActivity","onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("MainActivity","onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("MainActivity","onStop()");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.i("MainActivity","onDestroy()");
        super.onDestroy();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChangeFragment = (Button)findViewById(R.id.btnChangeRightFragment);
        btnChangeFragment.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                AnotherRightFragment anotherRightFragment = new AnotherRightFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fl_right,anotherRightFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

        });
    }



}
