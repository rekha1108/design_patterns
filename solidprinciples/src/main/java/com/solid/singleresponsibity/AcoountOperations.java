package com.solid.singleresponsibity;

import java.util.HashMap;
import java.util.Map;

public class AcoountOperations {

    private static Map<Integer, Account> map = new HashMap<>();

    public void addAccount(Account account){
        map.put(account.getAccountNumber(),account);
    }

    public void updateAccount(Account account){
        map.put(account.getAccountNumber(),account);
    }

    public Account getAccount(int accountNumber){
        return map.get(accountNumber);

    }
}
