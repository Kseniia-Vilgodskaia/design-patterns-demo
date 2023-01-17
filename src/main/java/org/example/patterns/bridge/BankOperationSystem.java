package org.example.patterns.bridge;

public class BankOperationSystem {

    public boolean isAccountValid() {
        //checking...
        return true;
    }

    public boolean isEnoughMoney() {
        //checking...
        return true;
    }
    public boolean deduct(int amount) {
        //deducting money...
        return true;
    }

    public boolean deposit(int amount) {
        //depositing money...
        return true;
    }
}
