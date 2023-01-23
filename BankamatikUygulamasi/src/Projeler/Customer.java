package Projeler;

import java.util.Scanner;

public class Customer {
    private String userName;
    private String userPassword;
    private int balance = 0;

    public Customer(){
        System.out.println("Bankamatik Uygulamamiza Hosgeldiniz...");
    }

    public Customer(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void withdraw(){
        Scanner input = new Scanner(System.in);

        System.out.println("cekmek istediginiz tutari girin");
        int withdraw = input.nextInt();
        System.out.println("eski bakiye : " + balance);
        balance -=withdraw;
        System.out.println("cekilen miktar : " + withdraw);
        System.out.println("son bakiye : " + balance);
    }

    public void investment(){
        Scanner input = new Scanner(System.in);

        System.out.println("yatirmak istediginiz tutari girin");
        int investment = input.nextInt();
        System.out.println("eski bakiye : " + balance);
        balance +=investment;
        System.out.println("yatirilan miktar : " + investment);
        System.out.println("son bakiye : " + balance);
    }
    public void showBalance(){
        System.out.println("bakiyeniz : " + balance);
    }
}
