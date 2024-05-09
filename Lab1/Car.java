import java.time.Instant;

public class Car {
    String carNumber;
    String driverName;
    Instant parkingTime;

    public Car(String carNumber, String driverName) {
        this.carNumber = carNumber;
        this.driverName = driverName;
        this.parkingTime = Instant.now();
    }

    @Override
    public String toString() {
        return "Car number: " + carNumber + ";  Driver name: " + driverName + ";  Parking time: " + parkingTime;
    };

}
