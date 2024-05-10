package main;

import java.time.Instant;

public class Car {
    private String carNumber;
    private String driverName;
    private Instant parkingTime;

    public Car(String carNumber, String driverName) {
        this.carNumber = carNumber;
        this.driverName = driverName;
        this.parkingTime = Instant.now();
    }

    public String geterCarNumber(){
        return this.carNumber;
    }


    public String geterDriverName(){
        return this.driverName;
    }


    public Instant geterParkingTime(){
        return this.parkingTime;
    }


    public String toString(){
        return "Car number: " + carNumber + ";  Driver name: " + driverName + ";  Parking time: " + parkingTime;
    }
}
