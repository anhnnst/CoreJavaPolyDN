
package com.poly.ex4;

public interface DbAction {
    void insert();
    void delete();
    void udpate();
    void select();
}

class Order implements DbAction{
    @Override
    public void insert() {
        System.out.println("Order insert");
    }
    @Override
    public void delete() {
        System.out.println("Order delete");
    }
    @Override
    public void udpate() {
        
    }
    @Override
    public void select() {
        System.out.println("Order select");
    }
}

class DbManager{
    public static void main(String[] args) {
        DbAction db1 = new Order();
        db1.insert();
        db1.select();
    }
}