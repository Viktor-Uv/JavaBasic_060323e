package com.auto.germany;

public class Car {
    public int weight;
    public int year;
    public String model;

    // Constructor
    public Car(int weight, int year, String model) {
        this(weight, year);
        this.model = model;
    }

    public Car(int weight, int year) {
        this(weight);
        this.year = year;
    }

    public Car(int weight) {
        this();
        this.weight = weight;
    }

    public Car() {
        weight = 500;
        year = 1900;
        model = "default_car";
    }
}
