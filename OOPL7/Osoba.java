
package lab7;

public class Osoba {
    
    public String Imie;
    public String Nazwisko;
    public String DataUrodz;
    public String Plec;

    public Osoba(String Imie, String Nazwisko, String DataUrodz, String Plec) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.DataUrodz = DataUrodz;
        this.Plec = Plec;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String Imie) {
        this.Imie = Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }

    public String getDataUrodz() {
        return DataUrodz;
    }

    public void setDataUrodz(String DataUrodz) {
        this.DataUrodz = DataUrodz;
    }

    public String getPlec() {
        return Plec;
    }

    public void setPlec(String Plec) {
        this.Plec = Plec;
    }

    @Override
    public String toString() {
        return "Osoba{" + "Imie=" + Imie + ", Nazwisko=" + Nazwisko + ", DataUrodz=" + DataUrodz + ", Plec=" + Plec + '}';
    }

    
    }

