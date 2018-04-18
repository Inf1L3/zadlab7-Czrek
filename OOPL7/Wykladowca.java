
package lab7;

public class Wykladowca extends Osoba{
    
          private int pokoj;
          private int wyplata;
          private String tytul;

    public Wykladowca(int pokoj, int wyplata, String tytul, String Imie, String Nazwisko, String DataUrodz, String Plec) {
        super(Imie, Nazwisko, DataUrodz, Plec);
        this.pokoj = pokoj;
        this.wyplata = wyplata;
        this.tytul = tytul;
    }

    public int getPokoj() {
        return pokoj;
    }

    public void setPokoj(int pokoj) {
        this.pokoj = pokoj;
    }

    public int getWyplata() {
        return wyplata;
    }

    public void setWyplata(int wyplata) {
        this.wyplata = wyplata;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    @Override
    public String toString() {
        return "Wykladowca{"+super.toString() + "pokoj=" + pokoj + ", wyplata=" + wyplata + ", tytul=" + tytul + '}';
    }
          
          
}
