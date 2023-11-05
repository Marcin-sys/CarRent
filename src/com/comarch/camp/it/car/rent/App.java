package com.comarch.camp.it.car.rent;

import com.comarch.camp.it.car.rent.authenticator.Authenticator;
import com.comarch.camp.it.car.rent.db.VehicleRepository;
import com.comarch.camp.it.car.rent.gui.GUI;
import com.comarch.camp.it.car.rent.model.User;

public class App {
    public static void main(String[] args) {
        VehicleRepository carDatabase = new VehicleRepository();
        Authenticator authenticator = new Authenticator();
        GUI gui = new GUI();
        boolean loop = false;

        for (int i = 0; i < 3; i++) {
            User user = gui.readLoginData();
            boolean authResult = authenticator.authenticator(user.getLogin(), user.getPassword());

            if (authResult) {
                System.out.println("Logged !!");
                loop = true;
                break;
            }
            System.out.println("Incorrect login data !!");
        }

        mainLoop:
        while (loop) {

            switch (gui.showMenuAndReadChoose()) {
                case "1":
                    gui.printAllCars(carDatabase.getVehicles());
                    break;
                case "2":
                    gui.showResult(carDatabase.rentVehicle(gui.readPlate()));
                    break;
                case "3":
                    gui.showResult(carDatabase.returnVehicle(gui.readPlate()));
                    break;
                case "4":
                    gui.exitShop();
//                    System.exit(0);    // wychodzisz z aplikacji calkowicie
//                    break mainLoop;  //nazywanie pętli
                    loop = false;   // albo ladnie
                    break;
                default:
                    gui.showWrongChoose();
                    break;
            }
        }
    }
}
