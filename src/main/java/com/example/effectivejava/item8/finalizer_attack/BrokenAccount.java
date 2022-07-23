package com.example.effectivejava.item8.finalizer_attack;

import java.math.BigDecimal;

public class BrokenAccount extends Account{
    public BrokenAccount(String accountId) {
        super(accountId);
    }

    @Override
    protected void finalize() throws Throwable {
        this.transfer(BigDecimal.valueOf(10000),"keesun");
    }
//
//    void 일반_계정() {
//        Account account = new Account("keesun");
//        account.transfer(BigDecimal.valueOf(100000),"jihun");
//    }
//
//    void 푸틴_계정() {
//        Account account = null;
//        try {
//            account = new BrokenAccount("푸틴");
//        } catch (Exception e) {
//            System.out.println("이러면???");
//        }
//
//        System.gc();
//        Thread.sleep(3000L);
//    }
}
