package com.company;

import java.util.LinkedList;
import java.util.List;

public abstract class Client
{
    List<Account> accounts=new LinkedList<>();
    public Client() {

    }
    @Override

    public String toString()
    {
        return "Client{" + "accounts=" + accounts + '}';
    }
}
