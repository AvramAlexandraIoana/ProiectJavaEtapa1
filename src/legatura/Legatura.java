package legatura;

import oras.Oras;

public class Legatura {
    protected int km;
    Oras oras_plecare, oras_destinatie;

    public Legatura() {
    }

    public Legatura(int km, Oras oras_plecare, Oras oras_destinatie) {
        this.km = km;
        this.oras_plecare = oras_plecare;
        this.oras_destinatie = oras_destinatie;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Oras getOras_plecare() {
        return oras_plecare;
    }

    public void setOras_plecare(Oras oras_plecare) {
        this.oras_plecare = oras_plecare;
    }

    public Oras getOras_destinatie() {
        return oras_destinatie;
    }

    public void setOras_destinatie(Oras oras_destinatie) {
        this.oras_destinatie = oras_destinatie;
    }

    @Override
    public String toString() {
        return "legatura{" +
                "km=" + km +
                ", oras_plecare=" + oras_plecare +
                ", oras_destinatie=" + oras_destinatie +
                '}';
    }
}
