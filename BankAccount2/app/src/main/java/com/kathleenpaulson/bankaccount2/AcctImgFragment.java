package com.kathleenpaulson.bankaccount2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * Created by Kathleen on 4/12/2018.
 */

public class AcctImgFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentRootView = inflater.inflate(R.layout.fragment_acctimg, container, false);

        ImageButton acctbutton = (ImageButton) fragmentRootView.findViewById(R.id.bankAcctListButton);
        ImageButton infobutton = (ImageButton) fragmentRootView.findViewById(R.id.appinfoButton);

        acctbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AccountListActivity.class);
                startActivity(intent);
            }
        });

        infobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AppInfoActivity.class);
                startActivity(intent);
            }
        });

        return fragmentRootView;
    }
}