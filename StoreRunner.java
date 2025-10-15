import java.util.Scanner;

public class StoreRunner {
  
    public static void main(String[] args) {
        Guitar g1 = new Guitar("Stratocaster", "Fender", 1200.00, 6, "Electric");
        Drum d1 = new Drum("Fusion Set", "Yamaha", 800.00, "Bass", 5);

        System.out.println(g1);
        System.out.println(d1);
    }
}