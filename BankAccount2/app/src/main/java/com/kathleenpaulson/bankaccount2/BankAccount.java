package com.kathleenpaulson.bankaccount2;

/**
 * Created by Kathleen on 4/12/2018.
 */

public class BankAccount
{
    //Member Variables
    private String acctName;
    private double balance;

    //Member methods
    public String getAcctName()
    {
        return acctName;
    }

    public void setAcctName(String m_acctName)
    {
        acctName = m_acctName;
    }

    public double getBalance ()
    {
        return balance;
    }

    public void setBalance(double m_balance)
    {
        balance = m_balance;
    }

    public String toString(){
        return acctName;
    }
}
