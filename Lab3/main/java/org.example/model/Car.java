package org.example.model;

import java.time.Instant;

public class Car {
    private String carNumber;
    private String driverName;
    private Instant parkingTime;

    public Car(){

    }

    public Car(String carNumber, String driverName) {
        this.carNumber = carNumber;
        this.driverName = driverName;
        this.parkingTime = Instant.now();
    }

    public String geterCarNumber(){
        return this.carNumber;
    }

    public void seterCarNumber(String carNumber){
        this.carNumber = carNumber;
    }


    public String geterDriverName(){
        return this.driverName;
    }

    public void seterDriverName(String driverName){
        this.driverName = driverName;
    }


    public Instant geterParkingTime(){
        return this.parkingTime;
    }

    public void seterParkingTime(Instant parkingTime) {
        this.parkingTime = parkingTime;
    }


    public String toString(){
        return "Car number: " + carNumber + ";  Driver name: " + driverName + ";  Parking time: " + parkingTime;
    }
}

