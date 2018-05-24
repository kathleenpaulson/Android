package com.kathleenpaulson.bankaccount2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kathleen on 4/12/2018.
 */

public final class BankAccountList {
    //Member variables
    private static BankAccountList INSTANCE = null;
    private ArrayList<BankAccount> bankAcctList = new ArrayList<BankAccount>();

    //Member Methods

    //*************************************************************************
    //Default constructor for BankAccountList class.
    //Creates new Bank Accounts to populate the BankAcctList with default data
    //*************************************************************************
    private BankAccountList() {
        BankAccount newAcct1 = new BankAccount();
        newAcct1.setAcctName("Checking");
        newAcct1.setBalance(1000);
        bankAcctList.add(newAcct1);

        BankAccount newAcct2 = new BankAccount();
        newAcct2.setAcctName("Savings");
        newAcct2.setBalance(1000);
        bankAcctList.add(newAcct2);
    }

    public static BankAccountList getInstance()
    {
        if (INSTANCE == null) {
            INSTANCE = new BankAccountList();
        }
        return INSTANCE;
    }

    public BankAccount GetAccountByName (String name)
    {
        for (int i=0; i <bankAcctList.size(); i++) {
            if (bankAcctList.get(i).getAcctName().equals(name))
            {
                return bankAcctList.get(i);
            }
        }
        return null;
    }

    public ArrayList<BankAccount> GetInternalList() {
        return bankAcctList;
    }


}

