package com.comarch.camp.it.car.rent;

import com.comarch.camp.it.car.rent.authenticator.Authenticator;
import com.comarch.camp.it.car.rent.db.VehicleRepository;
import com.comarch.camp.it.car.rent.gui.GUI;
import com.comarch.camp.it.car.rent.model.User;

public final class App {
    public static void main(String[] args) {
        final VehicleRepository carDatabase = new VehicleRepository();
        final Authenticator authenticator = new Authenticator();
        boolean loop = false;

        for (int i = 0; i < 3; i++) {
            User user = GUI.readLoginData();
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

            switch (GUI.showMenuAndReadChoose()) {
                case "1":
                    GUI.printAllCars(carDatabase.getVehicles());
                    break;
                case "2":
                    GUI.showResult(carDatabase.rentVehicle(GUI.readPlate()));
                    break;
                case "3":
                    GUI.showResult(carDatabase.returnVehicle(GUI.readPlate()));
                    break;
                case "4":
                    GUI.exitShop();
//                    System.exit(0);    // wychodzisz z aplikacji calkowicie
//                    break mainLoop;  //nazywanie pętli
                    loop = false;   // albo ladnie
                    break;
                default:
                    GUI.showWrongChoose();
                    break;
            }
        }
    }
}
