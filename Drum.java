public class Drum extends Instrument {
    private String drumType;
    private int pieces;

    // No-argument constructor
    public Drum() {
        super(); // calls Instrument() default constructor
        this.drumType = "Snare";
        this.pieces = 5;
    }

    // Parameterized constructor
    public Drum(String name, String brand, double price, String drumType, int pieces) {
        super(name, brand, price); // 
        this.drumType = drumType;
        this.pieces = pieces;
    }

    // Getters and setters
    public String getDrumType() {
        return drumType;
    }

    public void setDrumType(String drumType) {
        this.drumType = drumType;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Drum Type: " + drumType + ", Pieces: " + pieces;
    }
}
