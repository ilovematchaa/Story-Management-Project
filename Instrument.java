public class Instrument {
    private String name;
    private String brand;
    private double price;

    // No-arg constructor
    public Instrument() {
        this.name = "Unknown";
        this.brand = "Generic";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Instrument(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    public String toString() {
        return "Instrument Name: " + name + ", Brand: " + brand + ", Price: $" + price;
    }
}