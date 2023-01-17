package org.example.patterns.bridge;

public class ATM {

    //bridge...
    private final BankOperationSystem bankOperationSystem;

    public ATM(BankOperationSystem bankOperationSystem) {
        this.bankOperationSystem = bankOperationSystem;
    }

    public boolean transferMoney(int amount) {
        if (bankOperationSystem.isAccountValid() && bankOperationSystem.isEnoughMoney()) {
            bankOperationSystem.deduct(amount);
            bankOperationSystem.deposit(amount);
            return true;
        }
        return false;
    }
}
