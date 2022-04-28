package ro.ase.cts.lab08.composite;

public class Main {
    public static void main(String[] args) {
        Angajat TM1 = new Angajat("Alina", "RS11", 4500.00);
        Angajat TM2 = new Angajat("Alin", "RS12", 4500.00);

        Angajat PM1 = new Angajat("Elena", "RS13", 4500.00);
        Angajat PM2 = new Angajat("Eli", "RS14", 4500.00);
        Angajat PM3 = new Angajat("Maria", "RS15", 4500.00);
        Angajat PM4 = new Angajat("Ion", "RS16", 4500.00);
        PM1.addSubordonat(TM1);
        PM2.addSubordonat(TM2);

        Angajat SDVanzari = new Angajat("Adi", "RS13", 4500.00);
        Angajat SDMArketing = new Angajat("Sebi", "RS14", 4500.00);
        Angajat SDDezvoltator = new Angajat("Mihai", "RS15", 4500.00);
        SDVanzari.addSubordonat(PM1);
        SDVanzari.addSubordonat(PM2);
        SDMArketing.addSubordonat(PM3);
        SDDezvoltator.addSubordonat(PM4);

        Angajat CEO = new Angajat("SEFU", "RS16", 4500.00);
        CEO.addSubordonat(SDVanzari);
        CEO.addSubordonat(SDMArketing);
        CEO.addSubordonat(SDDezvoltator);

        CEO.printDetalii();
    }
}
