package Assignment3FacadeDesign;

import java.math.BigDecimal;

public class Customer {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        int mySavingAccount = bankService.createAccount("saving", new BigDecimal(1000));
        int myInvestmentAccount = bankService.createAccount("investment", new BigDecimal(2000));
        int myChequingAccount = bankService.createAccount("chequing", new BigDecimal(3000));
        bankService.transferMoney(mySavingAccount, myInvestmentAccount, new BigDecimal(500));
        System.out.println("My current savings account balance is " + bankService.getBalance(mySavingAccount));
        System.out.println("My current investment account balance is " + bankService.getBalance(myInvestmentAccount));
        System.out.println("My current chequing account balance is " + bankService.getBalance(myChequingAccount));

    }
}
