package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "parked_cars")
public class Car {

    @Id
    private String carNumber;

    private String driverName;
    private Instant parkingTime;

    public Car() {
    }

    public Car(String carNumber, String driverName) {
        this.carNumber = carNumber;
        this.driverName = driverName;
        this.parkingTime = Instant.now();
    }

    public String geterCarNumber() {
        return carNumber;
    }

    public void seterCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String geterDriverName() {
        return driverName;
    }

    public void seterDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Instant geterParkingTime() {
        return parkingTime;
    }

    public void seterParkingTime(Instant parkingTime) {
        this.parkingTime = parkingTime;
    }

    @Override
    public String toString(){
        return "Car number: " + carNumber + ";  Driver name: " + driverName + ";  Parking time: " + parkingTime;
    }
}
