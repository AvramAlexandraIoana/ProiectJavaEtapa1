package masini;

public class Microbuz extends Masina {
    protected String nume_sofer;

    public Microbuz(String marca, int an_fabricatie, String nr_inmatriculare, String nume_sofer) {
        super(marca, an_fabricatie, nr_inmatriculare);
        this.nume_sofer = nume_sofer;
    }

    public String getNume_sofer() {
        return nume_sofer;
    }

    public void setNume_sofer(String nume_sofer) {
        this.nume_sofer = nume_sofer;
    }

    @Override
    public String toString() {
        return "Microbuz{" + super.toString() +
                "nume_sofer='" + nume_sofer + '\'' +
                '}';
    }
}
