package edu.psu.ist;

import java.awt.*;
import java.util.ArrayList;
enum menuItem {Plain, Meat, Extra, Veggie}
public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private String itemsInOrder;
    private double orderTotal;
    private menuItem menuItem;
    private Customer customer;

    //Constructor Method
    public Order(int orderId){

        this.orderId = orderId;
        this.itemsInOrder = itemsInOrder;
        this.orderTotal = orderTotal;
        this.menuItem = menuItem;
        this.customer = customer;
    }


    //Setters and Getters
    public int getorderId() {

        return orderId;
    }
    public void setorderId(int _orderId) {

        this.orderId = orderId;
    }
    public String getItemsInOrder(){
        return itemsInOrder;
    }
    public void setItemsInOrder(String itemsInOrder){
        this.itemsInOrder = itemsInOrder;
    }

    public double getOrderTotal() {
        return orderTotal;
    }
    public void setOrderTotal(double orderTotal){
        this.orderTotal = orderTotal;
    }

    public menuItem getmenuItem() {
        return menuItem;
    }
    public void setMenuItem(menuItem menuItem){
        this.menuItem = menuItem;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public static void printOrders(ArrayList<Order> oList) {
        for (Order order: oList){
            System.out.println(order.getorderId());
            System.out.println(order.getItemsInOrder());
            System.out.println(order.getOrderTotal());
            System.out.println(order.getmenuItem());
            System.out.println(order.getCustomer());
        }

    }

    public void setOrderId(String nextLine) {
        this.orderId = orderId;

    }

    public void setOrderTotal(String nextLine) {
        this.orderTotal = orderTotal;
    }
}
    

