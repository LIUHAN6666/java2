package com.homework.HomeWork08;

public class homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.deposit(10);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(9);
        System.out.println(checkingAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
    }
}
