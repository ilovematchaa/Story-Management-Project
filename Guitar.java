public class Guitar extends Instrument {
    private int numberOfStrings;
    private String type; // Acoustic or Electric

    // No-arg constructor
    public Guitar() {
        super();
        this.numberOfStrings = 6;
        this.type = "Acoustic";
    }

    // Parameterized constructor
    public Guitar(String name, String brand, double price, int numberOfStrings, String type) {
        super(name, brand, price);
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    // Getters and Setters
    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Guitar Type: " + type + ", Strings: " + numberOfStrings;
    }
}