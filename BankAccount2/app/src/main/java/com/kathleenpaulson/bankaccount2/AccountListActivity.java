package com.kathleenpaulson.bankaccount2;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

/**
 * Created by Kathleen on 4/12/2018.
 */

public class AccountListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountlistactivity);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        //If the orientation is portrait, add the AccountListFragment
        //to the portrait version of activity_accountlistactivity.
        //
        //If the orientation is landscape, add the AccountListFragment and
        //the AccountDetailFragment to the landscape layout version of
        //activity_accountlistactivity.
        int currentOrientation = getResources().getConfiguration().orientation;
        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            // Portrait
            ft.add( R.id.ui_fragment_container_2, new AccountListFragment() );
        }
        else {
            // Landscape
            ft.add( R.id.ui_fragment_container_3, new AccountListFragment() );
            ft.add( R.id.ui_fragment_container_4, new AccountDetailFragment() );
        }

        ft.commit();
    }

}


