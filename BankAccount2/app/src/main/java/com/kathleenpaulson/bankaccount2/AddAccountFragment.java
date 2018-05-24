package com.kathleenpaulson.bankaccount2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Kathleen Paulson on 3/27/2018.
 */

public class AddAccountFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentRootView = inflater.inflate(R.layout.fragment_addaccount, container, false);

        //Get the edit text fields for user input
        EditText addNameET = (EditText) fragmentRootView.findViewById(R.id.addNameEditText);
        EditText addBalanceET = (EditText) fragmentRootView.findViewById(R.id.addBalanceEditText);

        //Get the save button
        Button saveButton = (Button)fragmentRootView.findViewById(R.id.saveButton);

        String nameToAdd = addNameET.getText().toString();
        double balanceToAdd = Double.parseDouble(addBalanceET.getText().toString());

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        //Since the list is private, and specs did not say to code ways to add items to the list,
        //how can it be updated??

        getActivity().finish();


            }
        });

        return fragmentRootView;
    }

}
