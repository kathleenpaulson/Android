package com.kathleenpaulson.bankaccount2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kathleen Paulson on 3/27/2018.
 */

public class AppInfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentRootView = inflater.inflate(R.layout.fragment_appinfo, container, false);

        return fragmentRootView;
    }

}
