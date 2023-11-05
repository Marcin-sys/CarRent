package com.comarch.camp.it.car.rent.model;

public class Vehicle {

    private String brand;
    private String model;
    private int year;
    private double price;
    private String plate;
    private boolean rent;

    public Vehicle(String brand, String model, int year,
                   double price, String plate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.plate = plate;
        this.rent = false;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Brand: ")
                .append(this.getBrand())
                .append(" Model: ")
                .append(this.getModel())
                .append(" Year: ")
                .append(this.getYear())
                .append(" Price: ")
                .append(this.getPrice())
                .append(" Plate: ")
                .append(this.getPlate())
                .append(" Not available?: ")
                .append(this.isRent())
                .append(" ")
                .toString();
    }


    public Vehicle(boolean rent) {
        this.rent = rent;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

}
