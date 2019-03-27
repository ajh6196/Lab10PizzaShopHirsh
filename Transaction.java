package edu.psu.ist;

import java.util.ArrayList;

enum PaymentType {Cash, Credit, Debit}

public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId;
    private int orderId;
    private PaymentType paymentType;

    //Constructor Method
    public Transaction(int transactionId){

        this.transactionId = transactionId;
        this.orderId = orderId;
        this.paymentType = paymentType;
    }




    //Setters and Getters
    public int getTransactionId() {

        return transactionId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
            System.out.println("Transaction ID: " + transaction.getTransactionId());
            System.out.println("Order: " + transaction.getOrderId());
            System.out.println("PaymentType: " + transaction.getPaymentType());
        }
    }


    public void setTransactionId(String nextLine) {
        this.transactionId = transactionId;
    }



    public void setPaymentType(String nextLine) {
        this.paymentType = paymentType;
    }
}
