public class Main {
    public static void main(String[] args) {
        CarDealership dealership = new CarDealership("AutoPardubice", 5);

        dealership.addCar(new Car("Škoda", "Octavia", 120000, 5.4));
        dealership.addCar(new Car("Volkswagen", "Golf", 85000, 6.1));
        dealership.addCar(new Car("Toyota", "Yaris", 40000, 4.8));

        dealership.printCars();

        System.out.println("Has a Škoda? " + dealership.hasCarFromManufacturer("Škoda"));

        Car lowest = dealership.findLowestMileage();
        if (lowest !=null) {
            System.out.println("Lowest mileage: " + lowest);
        }
    }
}
