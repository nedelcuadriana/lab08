package ro.ase.cts.lab08.observer;

public class Main {
    public static void main(String[] args) {
        UpdateServer server = new UpdateServer("TW1000");
        CarOs car1 = new CarOs();
        CarOs car2 = new CarOs();
        server.addObs(car1);
        server.addObs(car2);

        server.seeObservers();
        server.pushUpdates("TW2000");
        server.seeObservers();

        
    }
}
