package com.company;

import java.util.Objects;

public class Account
{
    private String nr;
    private double balance=0;

    public Account(String nr)
    {
        this.nr =new String(nr);
    }
//nr
    public String getNr()
    {
        return nr;
    }
   //saldo
    public double getBalance()
    {
        return balance;
    }
    public void withdraw(double amount)
    {
        this.balance-=amount;
    }
    public void deposit(double amount)
    {
        this.balance+=amount;
    }
    @Override
    public String toString() {
        return "Account{" + "nr='" + nr + '\'' + ", balance=" + balance + '}';
    }
}
