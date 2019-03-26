package edu.psu.ist;

import java.util.ArrayList;

enum PaymentType {Cash, Credit, Debit}

public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId;
    private Order order;
    private PaymentType paymentType;

    //Constructor Method
    public Transaction(int transactionId){

        this.transactionId = transactionId;
        this.order = order;
        this.paymentType = paymentType;
    }




    //Setters and Getters
    public int getTransactionId() {

        return transactionId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void setTransactionId(int _transactionId, String nextLine) {
        this.transactionId = _transactionId;
    }
    public static void printTransactions(ArrayList<Transaction> tList){
        for (Transaction transaction: tList){
            System.out.println("Cash, Credit, or Debit");
            System.out.println("Transaction ID: " + transaction.getTransactionId());
            System.out.println("Order:" + transaction.getOrder());
            System.out.println("PaymentType: " + transaction.getPaymentType());
        }
    }


    public void setTransactionId(String nextLine) {
        this.transactionId = transactionId;
    }

    public void setOrder(String nextLine) {
        this.order = order;
    }

    public void setPaymentType(String nextLine) {
        this.paymentType = paymentType;
    }
}
