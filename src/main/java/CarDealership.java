public class CarDealership {
    private String name;
    private Car[] cars;
    private int carCount;

    public CarDealership(String name, int capacity) {
        this.name = name;
        this.cars = new Car[capacity];
        this.carCount = 0;
    }

    public boolean addCar(Car car) {
        if (carCount < cars.length) {
            cars[carCount] = car;
            carCount++;
            return true;
        }
        return false;
    }

    public void printCars() {
        System.out.println("Dealership " + name + ":");
        for (int i = 0; i < carCount; i++) {
            System.out.println(" - " + cars[i]);
        }
    }

    public boolean hasCarFromManufacturer(String manufacturer) {
        for (int i = 0; i < carCount; i++) {
            if (cars[i].getManufacturer().equalsIgnoreCase(manufacturer)) {
                return true;
            }
        }
        return false;
    }

    public Car findLowestMileage() {
        if (carCount == 0) {
            return null;
        }
        Car lowest = cars[0];
        for (int i = 0; i < carCount; i++) {
            if (cars[i].getMileage() < lowest.getMileage()) {
                lowest = cars[i];
            }
        }
        return lowest;
    }
}

