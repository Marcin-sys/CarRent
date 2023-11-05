package com.comarch.camp.it.car.rent.gui;

import com.comarch.camp.it.car.rent.model.User;
import com.comarch.camp.it.car.rent.model.Vehicle;

import java.util.Scanner;

public class GUI {

    private final Scanner scanner;

    public GUI() {
        this.scanner = new Scanner(System.in);
    }

    public String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Return car");
        System.out.println("4. Exit");
        String input = this.scanner.nextLine();
        System.out.println("What did you chose: " + input);
        return input;
    }

    public void printAllCars(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public String readPlate() {
        System.out.println("What you want to rent ? Write plate of car: ");
        return this.scanner.nextLine();
    }

    public void showResult(boolean rentResult) {
        if (rentResult) {
            System.out.println("Success !!!");
        } else {
            System.out.println("Error");
        }
    }

    public void exitShop() {
        System.out.println("See you again");
    }

    public void showWrongChoose() {
        System.out.println("Wrong choose!!");
    }

    public User readLoginData() {
        System.out.println("Write Login: ");
        String login = this.scanner.nextLine();
        System.out.println("Write Password: ");
        return new User(login, this.scanner.nextLine());
    }

}
