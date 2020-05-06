package com.company;

public class Main {

    public static void main(String[] args)
    {
        Bank bank = new Bank();
        Account konto1=new Account("1"),konto2=new Account("2"),konto3=new Account("3"),konto4=new Account("4"),konto5=new Account("5"),konto6=new Account("6"),konto7=new Account("7"),konto8=new Account("8");
        Person osoba1=new Person("Jan","Kowalski","12345678901");
        Importantperson osoba2=new Importantperson("Mariusz","Pudzianowski","12345678902");
        Importantperson osoba3=new Importantperson("Mariusz","Pudzianowski","12345678902");
        Company firma1=new Company("Apple","krs");
        Bigcompany firma2=new Bigcompany("MariuszPudzianowskiTransports","niepotrzeba");
        osoba1.accounts.add(konto1);
        osoba2.accounts.add(konto2);
        osoba2.accounts.add(konto3);
        osoba2.accounts.add(konto4);
        firma1.accounts.add(konto5);
        firma2.accounts.add(konto6);
        firma2.accounts.add(konto7);
        bank.clients.add(osoba1);
        bank.clients.add(osoba2);
        bank.clients.add(firma1);
        bank.clients.add(firma2);
        System.out.println(bank.toString());
		
		//dodanie zmiany
		System.out.println("Nowa część kodu");

        osoba2.accounts.get(0).deposit(1000);
        osoba2.accounts.get(1).deposit(1000);//2 razy dodane do jednego konta
        osoba2.accounts.get(1).deposit(2137);
        osoba1.accounts.get(0).deposit(2);
        firma1.accounts.get(0).deposit(1);
        firma2.accounts.get(0).deposit(30);
        firma2.accounts.get(1).deposit(7);
        System.out.println(bank.summaryofImportnatpeople());
        System.out.println(bank.summaryofPeople());
        System.out.println(bank.summaryofCompanies());
        System.out.println(bank.summaryofBigcompanies());
        System.out.println(bank.toString());//fort
        //nite
	// write your code here
    }
}
