package com.kathleenpaulson.bankaccount2;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Kathleen Paulson on 3/27/2018.
 */

public class AccountListFragment extends Fragment {

    //Declare the adapter
    private ArrayAdapter<BankAccount> itemsListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {
        View fragmentRootView = inflater.inflate(R.layout.fragment_accountlist, container, false);

        //Create the one and only instance of Bank Account List.  If it exists, use the instance.
        ArrayList<BankAccount> localBankArrayList = BankAccountList.getInstance().GetInternalList();


        //Setup the array adapter (link the adapter and the arraylist)
        itemsListAdapter = new ArrayAdapter<BankAccount>(getActivity(), R.layout.bankacct_list_item,
                localBankArrayList);

        //Get list view from the layout (get the listview)
        ListView lv = (ListView)fragmentRootView.findViewById(R.id.bankacctlistview);

        //Set the adapter for the list view
        lv.setAdapter(itemsListAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3) {
                BankAccount itemBA = new BankAccount();
                itemBA = (BankAccount) adapter.getItemAtPosition(position);
                String bankacct = itemBA.getAcctName();

                Intent intent = new Intent(getActivity(), AccountDetailActivity.class);
                intent.putExtra("Bank Acct", bankacct);
                startActivity(intent);
            }
        });

        //Get the add account button
        Button addacctbutton = (Button)fragmentRootView.findViewById(R.id.addacctbutton);

        addacctbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), AddAccountActivity.class);
                startActivity(intent);
            }
        });

        return fragmentRootView ;
    }

    @Override
    public void onResume() {
        super.onResume();

        itemsListAdapter.notifyDataSetChanged();


    }
}
