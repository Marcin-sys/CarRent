package com.comarch.camp.it.car.rent.db;

import com.comarch.camp.it.car.rent.model.Bus;
import com.comarch.camp.it.car.rent.model.Car;
import com.comarch.camp.it.car.rent.model.Truck;
import com.comarch.camp.it.car.rent.model.Vehicle;

public class VehicleRepository {
    private final Vehicle[] vehicles = new Vehicle[9];

    public VehicleRepository() {
        this.vehicles[0] = new Car("BMW", "5",
                2020, 12.5, "KR11");
        this.vehicles[1] = new Car("Tesla", "5",
                2020, 12.5, "KR22");
        this.vehicles[2] = new Car("Honda", "5",
                2023, 12.5, "KR33");
        this.vehicles[3] = new Car("Citroen", "5",
                2022, 12.5, "KR44");
        this.vehicles[4] = new Car("Audi", "5",
                2021, 12.5, "KR55");
        this.vehicles[5] = new Bus("Audi", "5",
                2021, 12.5, "KR66",5);
        this.vehicles[6] = new Bus("Audi", "5",
                2021, 12.5, "KR77",45);
        this.vehicles[7] = new Bus("Audi", "5",
                2021, 12.5, "KR88",23);
        this.vehicles[8] = new Truck("Audi", "5",
                2021, 12.5, "KR99",1500);
    }

    public boolean rentVehicle(String plate) {
        Vehicle vehicle = findVehicle(plate);
        if (vehicle != null && !vehicle.isRent()) {
            vehicle.setRent(true);
            return true;
        }
        return false;
    }

    public boolean returnVehicle(String plate) {
        Vehicle vehicle = findVehicle(plate);
        if (vehicle != null && vehicle.isRent()) {   // & mozna uzyc zeby sie zrobily oba zapytania
            vehicle.setRent(false);
            return true;
        }
        return false;
    }

    private Vehicle findVehicle(String plate) {
        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.getPlate().equals(plate)) {
                return vehicle;
            }
        }
        return null;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
}