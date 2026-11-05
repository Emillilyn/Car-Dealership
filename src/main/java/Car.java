public class Car {
    private String manufacturer;
    private String model;
    private int mileage;
    private double consumption;

    public Car(String manufacturer, String model, int mileage, double consumption) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.mileage = mileage;
        this.consumption = consumption;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public double getConsumption() {
        return consumption;
    }

    @Override
    public String toString() {
        return manufacturer + " " + model + ", mileage: " + mileage
                + " km, consumption: " + consumption + " l/100 km";
    }
}
