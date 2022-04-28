package ro.ase.cts.lab08.composite;

import java.util.ArrayList;
import java.util.List;

public class Angajat implements IAngajat{
    private String nume;
    private String codAngajat;
    private Double salariu;
    private List<IAngajat> subordonati;

    public Angajat(String nume, String codAngajat, Double salariu) {
        this.nume = nume;
        this.codAngajat = codAngajat;
        this.salariu = salariu;
        this.subordonati = new ArrayList<>();
    }

    public void addSubordonat(IAngajat angajat) {
        this.subordonati.add(angajat);
    }

    public void delSubordonat(IAngajat angajat) {
        this.subordonati.remove(angajat);
    }

    @Override
    public void printDetalii() {
        System.out.printf("\n"+this.nume + " " + this.codAngajat + " " + this.salariu );
        if(subordonati.size()>0){
            System.out.printf(" Subordonati:[");
            for (IAngajat a:subordonati){
                System.out.println(a.toString());
            }
            System.out.println("]");
        }
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Composite.Angajat{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", codAngajat='").append(codAngajat).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append(", subordonati=").append(subordonati);
        sb.append('}');
        return sb.toString();
    }
}
