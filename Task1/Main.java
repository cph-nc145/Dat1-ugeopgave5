package Task1;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Niclas", 21);
        Car car = new Car("AMG", "200", "IdontknowCars", 2017);
        Car car2 = new Car("Aygo", "100s", "littlecar", 2012);
        car.setDriver("Niclas");
        car2.setDriver("Niclas");
        System.out.println(car.toString());
    }






}
