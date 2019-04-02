package masini;

public class Autobuz extends Masina implements Comparable <Autobuz> {
    protected int nr_locuri;

    public Autobuz(String marca, int an_fabricatie, String nr_inmatriculare, int nr_locuri) {
        super(marca, an_fabricatie, nr_inmatriculare);
        this.nr_locuri = nr_locuri;
    }
    public int getNr_locuri() {
        return nr_locuri;
    }

    public void setNr_locuri(int nr_locuri) {
        this.nr_locuri = nr_locuri;
    }
    public int compareTo(Autobuz ob)
    {
        return this.nr_locuri - ob.getNr_locuri();
    }
    @Override
    public String toString() {
        return "Autobuz{" + super.toString() +
                "nr_locuri=" + nr_locuri +
                '}';
    }
}
