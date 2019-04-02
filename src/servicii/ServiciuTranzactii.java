package servicii;

import legatura.Legatura;
import masini.*;
import modele.Card;
import modele.Tranzactie;

import java.util.ArrayList;
import java.util.List;

public class ServiciuTranzactii {
    //determinare legaturi care au statia de plecare Bucuresti
    public List LegPlecareBucuresti(Disponibile leg){
        int size = leg.getLegaturi().length;
        List l = new ArrayList();
        for(int i=0; i< size; i++){
            if( leg.getLegaturi()[i].getOras_plecare().getNume() == "Bucuresti") {
                Legatura p1 = new Legatura(leg.getLegaturi()[i].getKm(),
                        leg.getLegaturi()[i].getOras_plecare(),
                        leg.getLegaturi()[i].getOras_destinatie());
                l.add(p1);
            }
            }
        return l;
    }
    //un String cu numele soferilor de pe microbuze
    public String[] NumeSoferi(Disponibile micro){
        int size = micro.getDisponibile1().length;
        String[] ob = new String[size];
        for(int i=0; i<size; i++)
            ob[i] = micro.getDisponibile1()[i].getNume_sofer();

        return ob;

    }
   // determina legatura cu cei mai multi km
    public Legatura NumarMaximKm(Disponibile leg)
    {
        int amax = 0;
        int size = leg.getLegaturi().length;
        int poz = 0;
        for(int i=0; i< size; i++){
            if(leg.getLegaturi()[i].getKm()> amax){
                amax = leg.getLegaturi()[i].getKm();
                poz = i;
            }
        }
        return leg.getLegaturi()[poz];

    }
    //determina cine are mai multe masini (Autobuzele/Microbuze)
    public int  NumarMaximAuto(Disponibile au){
        if(au.getNumar_autobuze() >= au.getNumar_microbuze()) return 1;
        return 0;
    }
    //adaugare autobuz (adaugare in lista + recalculare numar)
    public Disponibile AdaugareAutobuz(Disponibile autobuze, Autobuz autobuz){
        int size = autobuze.getDisponibile().length;
        Autobuz[] auto = new Autobuz[size + 1];
        for(int i=0; i< size; i++)
            auto[i] = autobuze.getDisponibile()[i];
        auto[size] = autobuz;
        autobuze.setDisponibile(auto);
        autobuze.setNumar_autobuze(autobuze.getNumar_autobuze() + 1);
        return autobuze;

    }
    //stergere autobuz (stergere din lista + recalculare numar)
    public Disponibile AnuleazaAutobuz(Disponibile autobuze, int numarAutobuz){
        int size = autobuze.getDisponibile().length;
        Autobuz[] auto =  new Autobuz[size - 1];
        for (int i=0; i< size; i++){
            if(i != numarAutobuz) auto[i] = autobuze.getDisponibile()[i];
               else
            {
                int poz = i;
                for (int j = poz; j< size-1; j++)
                    auto[j] = autobuze.getDisponibile()[j+1];
                break;
            }
        }
        autobuze.setDisponibile(auto);
        autobuze.setNumar_autobuze(autobuze.getNumar_autobuze() - 1);
        return autobuze;
    }
    //adaugare microbuz (adaugare in lista + recalculare numar)
    public Disponibile AdaugareMicrobuz(Disponibile microbuze, Microbuz microbuz){
        int size = microbuze.getDisponibile1().length;
        Microbuz[] auto = new Microbuz[size + 1];
        for(int i=0; i< size; i++)
            auto[i] = microbuze.getDisponibile1()[i];
        auto[size] = microbuz;
        microbuze.setDisponibile1(auto);
        microbuze.setNumar_microbuze(microbuze.getNumar_microbuze() + 1);
        return microbuze;

    }
    //stergere microbuz (stergere din lista + recalculare numar)
    public Disponibile AnuleazaMicrobuz(Disponibile microbuze, int numarMicrobuz){
        int size = microbuze.getDisponibile1().length;
        Microbuz [] auto =  new Microbuz[size - 1];
        for (int i=0; i< size; i++){
            if(i != numarMicrobuz) auto[i] = microbuze.getDisponibile1()[i];
            else
            {
                int poz = i;
                for (int j = poz; j< size-1; j++)
                    auto[j] = microbuze.getDisponibile1()[j+1];
                break;
            }
        }
        microbuze.setDisponibile1(auto);
        microbuze.setNumar_microbuze(microbuze.getNumar_microbuze() - 1);
        return microbuze;
    }
    //adauga legatura
    public Disponibile AdaugareLegatura(Disponibile legaturi, Legatura legatura){
        int size = legaturi.getLegaturi().length;
        Legatura[] leg = new Legatura[size + 1];
        for(int i=0; i< size; i++)
            leg[i] = legaturi.getLegaturi()[i];
        leg[size] = legatura;
        legaturi.setLegaturi(leg);
        return legaturi;

    }
    //adaugare tranzactie ( adaugare in lista + recalculare sold)
    public Card adaugaTranzactie(Card card, Tranzactie tranzactie) {
           // Tranzactie b = new Tranzactie(tranzactie.getSuma(),"Anulare calatorie");
            int size = card.getTranzactii().length;
            Tranzactie[] tranzactii = new Tranzactie[size + 1];

            if (card.getSold() > tranzactie.getSuma()) {
                //alocare lista noua cu valoarea adaugata

                for (int i = 0; i < size; i++) {
                    tranzactii[i] = card.getTranzactii()[i];
                }
                tranzactii[size] = tranzactie;
                card.setTranzactii(tranzactii);
                //Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer
                if (tranzactie.getDescriere().contentEquals("Anulare calatorie")){
                    double soldRamas = card.getSold() - tranzactie.getSuma();
                    card.setSold(soldRamas);
                }
                else {
                    double soldRamas = card.getSold() + tranzactie.getSuma();
                    card.setSold(soldRamas);
                }

            }

            return card;
        }






}
