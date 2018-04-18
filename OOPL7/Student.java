
package lab7;

public class Student extends Osoba{
    
    private int NrIndeks;
    private String TypStud;
    private String kierunek;
    private int RokStudiow;

    public Student(int NrIndeks, String TypStud, String kierunek, int RokStudiow, String Imie, String Nazwisko, String DataUrodz, String Plec) {
        super(Imie, Nazwisko, DataUrodz, Plec);
        this.NrIndeks = NrIndeks;
        this.TypStud = TypStud;
        this.kierunek = kierunek;
        this.RokStudiow = RokStudiow;
    }

    public int getNrIndeks() {
        return NrIndeks;
    }

    public void setNrIndeks(int NrIndeks) {
        this.NrIndeks = NrIndeks;
    }

    public String getTypStud() {
        return TypStud;
    }

    public void setTypStud(String TypStud) {
        this.TypStud = TypStud;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRokStudiow() {
        return RokStudiow;
    }

    public void setRokStudiow(int RokStudiow) {
        this.RokStudiow = RokStudiow;
    }

    @Override
    public String toString() {
        return "Student{"+super.toString() + "NrIndeks=" + NrIndeks + ", TypStud=" + TypStud + ", kierunek=" + kierunek + ", RokStudiow=" + RokStudiow + '}';
    }

    
    
    }
   
   
   

 
    
    
    
    
    

