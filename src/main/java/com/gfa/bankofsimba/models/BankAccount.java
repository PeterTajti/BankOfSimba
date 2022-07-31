package com.gfa.bankofsimba.models;

public class BankAccount {

    String name;
    int balance;
    String animalType;

    boolean isKing;
    boolean isGood;

    public BankAccount() {
    }

    public BankAccount(String name, int balance, String animalType, boolean isKing, boolean isGood) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isGood = isGood;
    }
    public String kingOrNot(){
        if (this.isKing){
            return "King";
        } else {
            return "NOTking";
        }
    }

    public String GoodOrBad(){
        if (this.isGood){
            return "Good!";
        } else {
            return "Bad :(";
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}

