package com.comarch.camp.it.car.rent.gui;

import com.comarch.camp.it.car.rent.authenticator.Authenticator;
import com.comarch.camp.it.car.rent.model.LuxuryCar;
import com.comarch.camp.it.car.rent.model.User;
import com.comarch.camp.it.car.rent.model.Vehicle;

import java.util.Scanner;

public class GUI {
    private static final Scanner scanner = new Scanner(System.in);

    public static String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Return car");
        System.out.println("4. Exit");
        String input = scanner.nextLine();
        System.out.println("What did you chose: " + input);
        return input;
    }

    public static void printAllCars(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof LuxuryCar && !"ADMIN".equals(Authenticator.loggedUserRole)) {
                continue;
            }
            System.out.println(vehicle);
        }
    }

    public static String readPlate() {
        System.out.println("What you want to rent ? Write plate of car: ");
        return scanner.nextLine();
    }

    public static void showResult(boolean rentResult) {
        if (rentResult) {
            System.out.println("Success !!!");
        } else {
            System.out.println("Error");
        }
    }

    public static void exitShop() {
        System.out.println("See you again");
    }

    public static void showWrongChoose() {
        System.out.println("Wrong choose!!");
    }

    public static User readLoginData() {
        System.out.println("Write Login: ");
        String login = scanner.nextLine();
        System.out.println("Write Password: ");
        return new User(login, scanner.nextLine());
    }

}
