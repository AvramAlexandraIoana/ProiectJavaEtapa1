package masini;

import legatura.Legatura;

import java.util.Arrays;

public class Disponibile {
    private Autobuz[] disponibile;
    protected int numar_autobuze;
    private Microbuz[] disponibile1;
    protected int  numar_microbuze;
    private Legatura[] legaturi;

    public Disponibile() {
    }

    public Disponibile(Autobuz[] disponibile, int numar_autobuze, Microbuz[] disponibile1, int numar_microbuze, Legatura[] legaturi) {
        this.disponibile = disponibile;
        this.numar_autobuze = numar_autobuze;
        this.disponibile1 = disponibile1;
        this.numar_microbuze = numar_microbuze;
        this.legaturi = legaturi;
    }

    public Autobuz[] getDisponibile() {
        return disponibile;
    }

    public void setDisponibile(Autobuz[] disponibile) {
        this.disponibile = disponibile;
    }

    public int getNumar_autobuze() {
        return numar_autobuze;
    }

    public void setNumar_autobuze(int numar_autobuze) {
        this.numar_autobuze = numar_autobuze;
    }

    public Microbuz[] getDisponibile1() {
        return disponibile1;
    }

    public void setDisponibile1(Microbuz[] disponibile1) {
        this.disponibile1 = disponibile1;
    }

    public int getNumar_microbuze() {
        return numar_microbuze;
    }

    public void setNumar_microbuze(int numar_microbuze) {
        this.numar_microbuze = numar_microbuze;
    }

    public Legatura[] getLegaturi() {
        return legaturi;
    }

    public void setLegaturi(Legatura[] legaturi) {
        this.legaturi = legaturi;
    }

    @Override
    public String toString() {
        return "Disponibile{" +
                "disponibile=" + Arrays.toString(disponibile) +
                ", numar_autobuze=" + numar_autobuze +
                ", disponibile1=" + Arrays.toString(disponibile1) +
                ", numar_microbuze=" + numar_microbuze +
                ", legaturi=" + Arrays.toString(legaturi) +
                '}';
    }
}
