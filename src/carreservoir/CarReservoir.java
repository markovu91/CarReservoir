package carreservoir;

import java.util.EventObject;

public class CarReservoir {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting the engine...");
        ReservoirEvent re = new ReservoirEvent();
        re.addListener((EventObject ev) -> {
            System.out.println(ANSI_RED + "You are on reserve... please refill the car!" + ANSI_RESET);
        });
        
        for (int i = 0; i < 100; i++) {
            re.consumeFuel();
            Thread.sleep(500);
        }
        System.out.println("Car stopped!");
        
    }
    
}
