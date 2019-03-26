package edu.psu.ist;

/*
Project: Lab 10
Purpose Details: Pizza ordering application
Course: IST 242
Author: Alex Hirsh
Date Developed: 3/13/19
Last Date Changed: 3/25/19
Rev: 4
 */


import java.util.ArrayList;
import java.util.Scanner;

    public class Main {




        public static void main(String[] args) {

            Main main = new Main();
            final char EXIT_CODE = 'E';
            final char CUST_CODE = 'C';
            final char MENU_CODE = 'M';
            final char ORDE_CODE = 'O';
            final char PRNT_ORDE = 'B';
            final char TRAN_CODE = 'T';
            final char TRAN_PRNT = 'N';
            final char PRNT_CUST = 'P';
            final char HELP_CODE = '?';
            char userAction;
            final String PROMPT_ACTION = "Add 'C'ustomer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
            ArrayList<Customer> cList = new ArrayList<>();
            ArrayList<Menu> mList = new ArrayList<>();
            ArrayList<Order> oList = new ArrayList<>();
            ArrayList<Transaction> tList = new ArrayList<>();



            Customer cust1 = new Customer(1);
            Customer cust2 = new Customer(2);
            Customer cust3 = new Customer(3);
            Customer cust4 = new Customer(4);

            Menu menu1 = new Menu(1, "Plain",9.75);
            Menu menu2 = new Menu(2, "Meat",10.75);
            Menu menu3 = new Menu(3, "Extra",10.00);
            Menu menu4 = new Menu(4, "Veggie",10.25);

            Order order1 = new Order(1);
            Order order2 = new Order(2);
            Order order3 = new Order(3);
            Order order4 = new Order(4);

            Transaction trans1 = new Transaction(1);
            Transaction trans2 = new Transaction(1);
            Transaction trans3 = new Transaction(1);
            Transaction trans4 = new Transaction(1);



            mList.add(menu1);
            mList.add(menu2);
            mList.add(menu3);
            mList.add(menu4);

            cList.add(cust1);
            cList.add(cust2);
            cList.add(cust3);
            cList.add(cust4);

            oList.add(order1);
            oList.add(order2);
            oList.add(order3);
            oList.add(order4);

            tList.add(trans1);
            tList.add(trans2);
            tList.add(trans3);
            tList.add(trans4);

            userAction = getAction(PROMPT_ACTION);

            while (userAction != EXIT_CODE) {
                switch(userAction) {
                    case CUST_CODE : cList.add(main.addCustomer());//addCustomer();
                        break;
                    case PRNT_CUST: Customer.printCustomer(cList);
                        break;
                    case MENU_CODE : Menu.listMenu(mList);
                        break;
                    case ORDE_CODE : Order.printOrders(oList);//addOrders();
                        break;
                    case PRNT_ORDE : oList.add(main.addOrder());
                        break;
                    case TRAN_CODE : Transaction.printTransactions(tList);//listTransactions();
                        break;
                    case TRAN_PRNT : tList.add(main.addTransaction());
                        break;
                }

                userAction = getAction(PROMPT_ACTION);
            }
        }
        public static char getAction(String prompt) {
            Scanner scnr = new Scanner(System.in);
            String answer = "";
            System.out.println(prompt);
            answer = scnr.nextLine().toUpperCase() + " ";
            char firstChar = answer.charAt(0);
            return firstChar;
        }
        public Customer addCustomer() {
            int customerCount = 1;
            Customer customer = new Customer(customerCount++);
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter Your Name: ");
            customer.setCustomerName(scnr.nextLine());
            System.out.println("Enter Your Phone Number: ");
            customer.setCustomerPhoneNumber(scnr.nextLine());
            return customer;
        }
        public Order addOrder(){
            int orderCount = 1;
            Order order = new Order(orderCount++);
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter Order ID: ");
            order.setOrderId(scnr.nextLine());
            System.out.println("Enter Items in Order");
            order.setMenuItem(menuItem.valueOf(scnr.nextLine()));
            System.out.println("Order Total: ");
            order.setOrderTotal(scnr.nextLine());
            return order;

        }
        public Transaction addTransaction() {
            int transCount = 1;
            Transaction transaction = new Transaction(transCount++);
            Scanner scnr = new Scanner(System.in);
            System.out.println("Transaction ID: ");
            transaction.setTransactionId(scnr.nextLine());
            System.out.println("Order: ");
            transaction.setOrder(scnr.nextLine());
            System.out.println("Payment Type: ");
            transaction.setPaymentType(PaymentType.valueOf(scnr.nextLine()));
            return transaction;
        }

            






}
