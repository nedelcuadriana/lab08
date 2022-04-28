package ro.ase.cts.lab08.observer;

public class CarOs implements OS{
    private String lastUpdate;

    public CarOs() {
        this.lastUpdate = "";
    }

    public void printLastPackage() {
        System.out.printf(lastUpdate);
    }

    @Override
    public void update(String update) {
        if (!this.lastUpdate.equals(update)) {
            this.lastUpdate = update;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarOs{");
        sb.append("lastUpdate='").append(lastUpdate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
