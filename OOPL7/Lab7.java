package lab7;


public class Lab7 {

    public static void main(String[] args) {
        
        Student s1= new Student(10001,"dzienne", "inf",3,  "Andrzej", "Słon","1998.02.05","mezczyzna" );
        Wykladowca w1= new Wykladowca(310,5000,"Doktor","Błazej","Chmura","1980.05.01","Mezczyzna");
                System.out.println(s1.toString());
                System.out.println(w1.toString());
    }
    
}
