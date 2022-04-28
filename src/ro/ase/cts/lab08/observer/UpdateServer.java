package ro.ase.cts.lab08.observer;

import java.util.ArrayList;
import java.util.List;

public class UpdateServer {
    private String updatePackage;
    private List<OS> observers;

    public UpdateServer(String updatePackage) {
        this.updatePackage = updatePackage;
        this.observers = new ArrayList<>();
    }

    public void addObs(OS os) {
        this.observers.add(os);
    }

    public void delObs(OS os) {
        this.observers.remove(os);
    }

    public void pushUpdates(String update) {
        this.updatePackage = update;
        for (OS os : this.observers) {
            os.update(this.updatePackage);
        }
    }

    public void seeObservers() {
        for (OS os : this.observers) {
            System.out.println(os.toString());
        }
        System.out.println();
    }
}
