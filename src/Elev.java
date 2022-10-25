import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Elev   extends  User {
    public Elev(String fullName, String email) {
        super(fullName, email);
    }

    private char gen;
    private int varsta;
    private String dataNasterii,adresaCompleta;
    private Materie materie;

    private Clasa clase;
    private Set<Materie> materie1 = new HashSet<>();

    public Set<Materie> getMaterie1() {
        return materie1;
    }

    public void setMaterie1(Set<Materie> materie1) {
        this.materie1 = materie1;
    }

    public char getGen() {
        return gen;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getDataNasterii() {
        return dataNasterii;
    }

    public String getAdresaCompleta() {
        return adresaCompleta;
    }

    private boolean areBursa;

    public Elev(String fullName, String email, char gen, int varsta, String dataNasterii, String adresaCompleta, Clasa clase, boolean areBursa, Materie materie) {
        super(fullName, email);
        this.gen = gen;
        this.varsta = varsta;
        this.dataNasterii = dataNasterii;
        this.adresaCompleta = adresaCompleta;
        this.clase = clase;
        this.areBursa = areBursa;
        this.materie = materie;
    }






    public void setGen(char gen) {
        this.gen = gen;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setAdresaCompleta(String adresaCompleta) {
        this.adresaCompleta = adresaCompleta;
    }

    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
        validateJavaDate(dataNasterii);
    }

    public boolean isAreBursa() {
        return areBursa;
    }

    public void setAreBursa(boolean areBursa) {
        this.areBursa = areBursa;

    }

    public static String validateJavaDate(String strDate) {
        // vedem daca data este nula sau nu
        if (strDate.trim().equals("")) {
            System.out.println("Este nula");
        }
        // data  nu este nuula
        else {

            // setam formatul de data preferat
            SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy/MM/dd");
            sdfrmt.setLenient(false);

            // testam tipul de foramt

            try {
                Date javaDate = sdfrmt.parse(strDate);
                System.out.println(strDate + " is valid date format");
            }
            /* Date format is invalid */
            //tipul de format este invalid aruncam exceptie
            catch (ParseException e) {
                System.out.println(strDate + " is Invalid Date format");
            }
            /* Return true if date format is valid */
        }
        return strDate;
    }

    public Clasa getClase() {
        return clase;
    }

    public void setClase(Clasa clase) {
        this.clase = clase;
    }

    public Materie getMaterie() {
        return materie;
    }

    public void setMaterie(Materie materie) {
        this.materie = materie;
    }


    //metoda pentru a incarca tema in functie de disciplina , numele temei si tema
    public boolean incarcaTema(Discipline discipline, String numetema, String tema) {
        //verifica daca parola este nula
     if (this.getPassword() == null) {
           throw new  EroareParola();
       } else {

            if (!contineDisciplina(discipline)) {
               System.out.println("Elevul nu urmeaza aceasta clasa . Nu poate fi adaugat ");
                return false;
           } else {
              try {
                  File file = new File("C:\\Users\\beatr\\OneDrive\\Desktop\\Fisere\\tema\\" + this.getFullName() + "homework" + discipline);
                   file.mkdir();
                   File file1 = new File("C:\\Users\\beatr\\OneDrive\\Desktop\\Fisere\\tema\\" + numetema+ ".txt");
                   file1.createNewFile();
                   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1.getAbsoluteFile()));
                   bufferedWriter.write(numetema);
                    bufferedWriter.close();
               }catch (IOException e)
              {
                 e.printStackTrace();
               }
               for (Materie materie:materie1)
                {
                    if(materie.getNumeleMateriei().equals(discipline))
                    {materie.getHomework().add(numetema);
                  }
                }
               return true;
            }
        }
    }

//    //metoda pentru a verifica daca contine disciplina
    public boolean contineDisciplina(Discipline discipline)
   {
       for(Materie materie:materie1)
       {
            if(materie.getNumeleMateriei().equals(discipline))
            {
                return true;
            }
        }
        return false;
    }
   // metoda pentru a adauga materia
    public boolean adaugaMaterie(List<Materie> materie)
    {
        if(getPassword()== null)
       {
            throw  new EroareParola();
        }
       else
        {
            return this.materie1.add((Materie)materie);
        }
 }

}
