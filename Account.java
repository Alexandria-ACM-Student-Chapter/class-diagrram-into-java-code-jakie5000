package com.company;

public class Account {
    public static void account(String[] args) {}
    private String id;
    private String name;
    private int balance;

    public Account(String id,String name)
    {
        this.id = id;
        this.name=name;
    }
    public Account(String id,String name,int balance)
    {
        this.id = id;
        this.name=name;
        this.balance=balance;
    }
    public String getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getBalance()
    {
        return balance;
    }
    public int credit(int amount)
    {
        return balance + amount;
    }
    public int debit(int amount)
    {
        if(amount <= balance)
        {
            return balance - amount;
        }else
        {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another,int amount)
    {
        if(amount <=balance)
        {
            another.balance=amount;
        }else
        {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString ()
    {
        return "Account[id =" + getID() + "name =" + getName() + "balance =" + getBalance() + "]";
    }
}
