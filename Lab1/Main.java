public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BW1234CD", "Микита Лукянов");
        // System.out.println(myCar);

        Car[] cars = new Car[10];
        cars[0] = myCar;
        cars[1] = new Car("BB7245CC", "Олена Кіт");
        cars[2] = new Car("DS1122AA", "Дмитро Федчук");
        cars[3] = new Car("BN6655OA", "Лея Сміт");

        /* for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        } */

        for (Car car : cars) {
            System.out.println(car);
        }

        //17. Які значення мають елементи масиву в які ми не проставили значення? Що це значить?
        // Виводить "null" тобто відсутні данні

        //19
        String saveNumber = "BB7245CC";
        for (Car car : cars) {
            if (car != null && car.carNumber.equals(saveNumber)) {
                System.out.println(car);
            }
        }

        //22-23
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].carNumber.equals(saveNumber)) {
                cars[i] = null;
            }
        }
        for (Car car : cars) {
            System.out.println(car);
        }
        //24. Як тепер виглядає масив?
        // cars[1] став null
    }
}
