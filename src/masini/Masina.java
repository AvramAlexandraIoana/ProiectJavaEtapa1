package masini;

public class Masina {
    private String marca;
    private int an_fabricatie;
    private String nr_inmatriculare;

    public Masina(String marca, int an_fabricatie, String nr_inmatriculare) {
        this.marca = marca;
        this.an_fabricatie = an_fabricatie;
        this.nr_inmatriculare = nr_inmatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAn_fabricatie() {
        return an_fabricatie;
    }

    public void setAn_fabricatie(int an_fabricatie) {
        this.an_fabricatie = an_fabricatie;
    }

    public String getNr_inmatriculare() {
        return nr_inmatriculare;
    }

    public void setNr_inmatriculare(String nr_inmatriculare) {
        this.nr_inmatriculare = nr_inmatriculare;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", an_fabricatie=" + an_fabricatie +
                ", nr_inmatriculare='" + nr_inmatriculare + '\'' +
                '}';
    }
}
