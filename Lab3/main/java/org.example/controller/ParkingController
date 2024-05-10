package org.example.controller;

import org.example.model.Car;
import org.example.service.ParkingServiceArray;
import org.example.service.ParkingServiceList;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("/parking")
public class ParkingController {
    private final ParkingServiceList parkingServiceList;

    public ParkingController(ParkingServiceList parkingServiceList) {
        this.parkingServiceList = parkingServiceList;
    }

    @GetMapping
    public List<Car> getCars() {
        return parkingServiceList.getCarsList();
    }

    @GetMapping("/cars/{carNumber}")
    public Car getCar(@PathVariable("carNumber") String carNumber) {
        if (parkingServiceList.getCar(carNumber) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return parkingServiceList.getCar(carNumber);
    }

    @PostMapping("/cars")
    @ResponseStatus(HttpStatus.CREATED)
    public Car parkCar(@RequestBody Car car){
        if(parkingServiceList.parkCar(car)){
            return parkingServiceList.getCar(car.geterCarNumber());
        }else{
            throw new ResponseStatusException((HttpStatus.CONFLICT));
        }
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/car/{carNumber}")
    public void removeCar(@PathVariable("carNumber") String carNumber){
        if(parkingServiceList.getCar(carNumber) == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        parkingServiceList.removeCar(carNumber);
    }

}

