package org.example.primitive_wrappers.challenge1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");
        bank.addCustomer("Katheer");
        bank.addCustomer("Dhanalakshmi");
        bank.addCustomer("Faizal");
        bank.addCustomer("Marliya");

        bank.printStatement("Katheer");
        bank.addTransaction("Katheer", 10.76);
        bank.addTransaction("Katheer", -30.90);
        bank.printStatement("Katheer");
    }
}
