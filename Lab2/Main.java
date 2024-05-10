package main;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BW1234CD", "Микита Лукянов");
        // System.out.println(myCar);

        Car[] cars = new Car[10];
        cars[0] = myCar;
        cars[1] = new Car("BB7245CC", "Олена Кіт");
        cars[2] = new Car("DS1122AA", "Дмитро Федчук");
        cars[3] = new Car("BN6655OA", "Лея Сміт");
        cars[4] = new Car("AE2365AB", "Тарас Ромаш");


        ParkingServiceArray parkingServiceArray = new ParkingServiceArray(3);
        parkingServiceArray.parkCar(cars[1]);
        parkingServiceArray.parkCar(cars[2]);
        parkingServiceArray.parkCar(cars[3]);
        parkingServiceArray.parkCar(cars[0]);

        //Повертаю автомобіль за номером
        System.out.println(parkingServiceArray.getCar("DS1122AA"));

        parkingServiceArray.removeCar("BN6655OA");
        parkingServiceArray.printParkedCars();

        System.out.println();


        ParkingServiceList parkingServiceList = new ParkingServiceList(3);
        parkingServiceList.parkCar(cars[4]);
        parkingServiceList.parkCar(cars[0]);
        parkingServiceList.parkCar(cars[2]);

        System.out.println(parkingServiceList.getCar("BW1234CD"));
        System.out.println(parkingServiceList.getCar("AB1234JJ"));

        parkingServiceList.removeCar("BB7245CC");
        parkingServiceList.printParkedCars();

        System.out.println();


        ParkingServiceSet parkingServiceSet = new ParkingServiceSet(2);
        parkingServiceSet.parkCar(cars[2]);
        parkingServiceSet.parkCar(cars[3]);
        parkingServiceSet.parkCar(cars[4]);
        parkingServiceSet.printParkedCars();

        System.out.println(parkingServiceSet.getCar("DS1122AA"));

        parkingServiceSet.removeCar("BN6655OA");
        parkingServiceSet.printParkedCars();
        System.out.println();


        ParkingServiceMap parkingServiceMap = new ParkingServiceMap(3);
        parkingServiceMap.parkCar(cars[2]);
        parkingServiceMap.parkCar(cars[0]);
        parkingServiceMap.parkCar(cars[3]);

        System.out.println(parkingServiceMap.getCar("BN6655OA"));

        parkingServiceMap.removeCar("BW1234CD");
        parkingServiceMap.parkCar(cars[4]);
        parkingServiceMap.printParkedCars();


        // Додати до лабораторної №2 можливість взаємодії з користувачем.
        //2. В програмі має бути можливість переглянути всі автомобілі на
        //парковці, додати автомобіль на парковку і видалити автомобіль з парковки

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nОберіть, що ви хочете зробити:\n" +
                    "1 - Переглянути усі авто на парковці\n" +
                    "2 - Додати новий автомобіль на парковку\n" +
                    "3 - Прибрати автомобіль з парковки\n" +
                    "4 - Закрити програму\n");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        parkingServiceArray.printParkedCars();
                        break;
                    case 2:
                        System.out.println("Будь ласка, введіть номер автомобіля та ім'я водія:\n");
                        String[] adddata = scanner.nextLine().split(" ");
                        if (adddata.length == 2) {
                            Car newCar = new Car(adddata[0], adddata[1]);
                            parkingServiceArray.parkCar(newCar);
                        } else {
                            System.out.println("Неправильний формат вводу");
                        }
                        break;
                    case 3:
                        System.out.println("Введіть автомобіль, який треба прибрати з парковки:\n");
                        String carNumber = scanner.nextLine();
                        parkingServiceArray.removeCar(carNumber);
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Введіть число від 1 до 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Помилка, спробуйте ще раз");
            }
        }

    }

}
