package com.task3.taxinterface;


class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;


    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }


    @Override
    public double calcTax() {
        return price * salesTax;
    }


    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
