package com.example.homework6;

public class Task_1 {
    public static void main(String[] args){
        CreditCard mtbBank = new CreditCard("1111 1111 1111 1111", 1500.10);
        CreditCard alfaBank = new CreditCard("2222 2222 2222 2222", 1000.98);
        CreditCard bpsBank = new CreditCard("3333 3333 3333 3333", 3400);
        mtbBank.creditCardReplenishment();
        mtbBank.creditCardInformation();
        alfaBank.creditCardReplenishment();
        alfaBank.creditCardInformation();
        bpsBank.creditCardWithdrawal();
        bpsBank.creditCardInformation();

    }
}

class CreditCard {
    String cardNumber;
    double cardBalance;

    void creditCardReplenishment () {
        double putMoney = 120;
            cardBalance += putMoney;
    }
    void creditCardWithdrawal(){
        double takeMoney = 321;
        if (takeMoney > cardBalance){
            System.out.println("Wrong withdrawal amount");
        }else {
            cardBalance-=takeMoney;
        }
    }
    void creditCardInformation(){
        System.out.println("Your card number: " + cardNumber);
        System.out.println("Your card balance: " +cardBalance);
    }
    public CreditCard(String cardNumber, double cardBalance){
        this.cardNumber= cardNumber;
        this.cardBalance=cardBalance;
        }
    }


