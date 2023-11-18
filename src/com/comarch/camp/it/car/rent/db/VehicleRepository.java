package com.comarch.camp.it.car.rent.db;

import com.comarch.camp.it.car.rent.authenticator.Authenticator;
import com.comarch.camp.it.car.rent.model.*;

import java.util.Collection;
import java.util.HashMap;

public class VehicleRepository {
    private final HashMap<String, Vehicle> vehicles = new HashMap<>();

    public VehicleRepository() {
        this.vehicles.put("KR11",new Car ("BMW", "5", 2020, 12.5, "KR11"));
        this.vehicles.put("KR22",new Car("Tesla", "5", 2020, 12.5, "KR22"));
        this.vehicles.put("KR33", new Car("Honda", "5",
                2023, 12.5, "KR33"));
        this.vehicles.put("KR44", new Car("Citroen", "5",
                2022, 12.5, "KR44"));
        this.vehicles.put("KR55",new Car("Audi", "5",
                2021, 12.5, "KR55"));
        this.vehicles.put("KR66",new Bus("Audi", "5",
                2021, 12.5, "KR66",5));
        this.vehicles.put("KR77",new Bus("Audi", "5",
                2021, 12.5, "KR77",45));
        this.vehicles.put("KR88",new Bus("Audi", "5",
                2021, 12.5, "KR88",23));
        this.vehicles.put("KR99",new Truck("Audi", "5",
                2021, 12.5, "KR99",1500));
        this.vehicles.put("KR10",new LuxuryCar("Porshe", "5",
                2021, 12.5, "KR10"));
        this.vehicles.put("KR00",new LuxuryCar("Bentley", "5",
                2021, 12.5, "KR00") );
    }

    public boolean rentVehicle(String plate) {
        Vehicle vehicle = this.vehicles.get(plate);
        if (vehicle instanceof LuxuryCar
                && !"ADMIN".equals(Authenticator.loggedUserRole)){
            return false;
        }
        if (vehicle != null && !vehicle.isRent()) {
            vehicle.setRent(true);
            return true;
        }
        return false;
    }

    public boolean returnVehicle(String plate) {
        Vehicle vehicle = this.vehicles.get(plate);
        if (vehicle instanceof LuxuryCar
                && !"ADMIN".equals(Authenticator.loggedUserRole)){
            return false;
        }
        if (vehicle != null && vehicle.isRent()) {   // & mozna uzyc zeby sie zrobily oba zapytania
            vehicle.setRent(false);
            return true;
        }
        return false;
    }

    public Collection<Vehicle> getVehicles() {
        return this.vehicles.values();
    }
}