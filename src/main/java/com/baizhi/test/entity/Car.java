package com.baizhi.test.entity;

public class Car {
    private String carname;
    private String carcolor;
    private String price;

    public Car(String carname, String carcolor, String price) {
        this.carname = carname;
        this.carcolor = carcolor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carname='" + carname + '\'' +
                ", carcolor='" + carcolor + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
