package com.example.ailtonfh.singleactivity_01;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import layout.Fragment1;
import layout.Fragment2;

public class MainActivity extends FragmentActivity implements Fragment1.OnFragmentInteractionListener, Fragment2.OnFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // https://developer.android.com/training/basics/fragments/fragment-ui.html
        if (findViewById(R.id.frameLayout) != null) {
            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            Fragment1 fragment1 = new Fragment1();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, fragment1);
            fragmentTransaction.commit();
        }



        }

    public void change_fragment(View v){
        Fragment2 fragment2 = new Fragment2();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.frameLayout, fragment2);
        fragmentTransaction.addToBackStack(null);

    // Commit the transaction
        fragmentTransaction.commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
