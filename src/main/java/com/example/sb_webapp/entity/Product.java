package com.example.sb_webapp.entity;

public class Product {

    private int pid;
    private String pname;
    private double price;
    private long quantity;

    public Product() {
    }

    public Product(int pid, String pname, double price, long quantity) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid +
               ", pname=" + pname +
               ", price=" + price +
               ", quantity=" + quantity + "]";
    }
}