package com.kathleenpaulson.bankaccount2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kathleen Paulson on 3/27/2018.
 */

public class AccountDetailFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentRootView = inflater.inflate(R.layout.fragment_accountdetail, container, false);

        //Get the fields from the fragment that will hold the data to be displayed
        TextView acctNametv = (TextView) fragmentRootView.findViewById(R.id.acctnametextView);
        TextView balancetv = (TextView) fragmentRootView.findViewById(R.id.balanceTv);

        Intent i = getActivity().getIntent();
        String newAcctName = i.getStringExtra("Bank Acct");

        acctNametv.setText(newAcctName);

        BankAccount newBankAcct = BankAccountList.getInstance().GetAccountByName(newAcctName);

        double rawBalance = newBankAcct.getBalance();

        String balanceFormatted = String.format("%.2f", rawBalance);

        balancetv.setText (balanceFormatted);

        return fragmentRootView;
    }

}
