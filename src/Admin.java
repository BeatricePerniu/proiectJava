import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class Admin extends User {

    public Admin(String fullName, String email) {
        super(fullName, email);
        this.setPassword(Diverse.generatePassword());
        this.generateFile();


    }

    //Metoda pentru a genera fisieru si a introduce parola in el
    public void generateFile() {
        try {
            File file = new File("C:\\Users\\beatr\\OneDrive\\Desktop\\Fisere\\" + getFullName() + ".txt");

            if (!file.exists()) {

                file.createNewFile();
            }
            FileWriter pw = new FileWriter(file);
            BufferedWriter bf = new BufferedWriter(pw);
            bf.write("Parola este " + this.getPassword());
            bf.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //Metoda pentru a genera parola de user  primeste String-ul de username  si obiectul scoala
    public void genereazaParolaPentruUser(String username, Scoala scoala) {
        boolean useFound = false;
        for (User currentUser : scoala.getListaUseri()) {
            if (currentUser.getUsername().equals(username)) {
                useFound = true;
                if (currentUser.getPassword() == null) {
                    String password = Diverse.generatePassword();
                    currentUser.setPassword(password);

                    try {
                        File file = new File("C:\\Users\\beatr\\OneDrive\\Desktop\\Fisere\\" + currentUser.getFullName() + ".txt");
                        if (!file.exists()) {

                            file.createNewFile();
                        }
                        FileWriter pw = new FileWriter(file);
                        BufferedWriter bf = new BufferedWriter(pw);
                        bf.write("Parola este " + this.getPassword());
                        bf.close();
                        System.out.println("Done");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                } else {
                    System.out.println("Userul are o parola nu putem reseta parola ");
                }

            }
            if (!useFound) {
                System.out.println("Nu am gasit user ");
            }
        }
    }

    // metoda pentru a genera fisier lista membri
    public void genereazaFisierListaMembri(Scoala scoala) {
        try {
            File file = new File("C:\\Users\\beatr\\OneDrive\\Desktop\\Fisere\\ListaMembriiScoala.txt");
            file.createNewFile();
            FileWriter pw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bf = new BufferedWriter(pw);
            StringBuilder text = new StringBuilder();

//            for (User user : scoala.listaUseri) {
//                //imi ia toti useri si ii adauga in stringbuilder-ul text
//
//                text += user.getFullName();
//                counter++;
//
//                bf.write(" Nr " + counter);
//
////
//            }

            for (int i =1; i <scoala.listaUseri.size()+1; i++) {

                text.append("Nr. " + i + " " +scoala.listaUseri.get(i-1).getFullName() + "\n" );

            }
            bf.write(text.toString());
//
            // am adaugat lista de useri in fisier

            bf.close();
            System.out.println("S-a creeat fisierul cu lista de membrii ");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    // metoda pentru  sterge user
    public boolean deleteUser(String username, Scoala scoala) {

        for (User userulCurent : scoala.getListaUseri()) {
            /// iteram prin lista de useri de  la scoala
            if (userulCurent.getUsername().equals(username)) {
                scoala.getListaUseri().remove(userulCurent);
                File file = new File("C:\\Users\\beatr\\OneDrive\\Desktop\\Fisere\\" + getFullName() + ".txt"
                        + userulCurent.getFullName() + ".txt");
                return file.delete();
            }
        }
        System.out.println("This user was not found in the usersList from this school");
        return false;
    }
    // metoda pentru a sterge fisier
    public void stergeFisier(User user) {
        File file = new File("C:\\Users\\beatr\\OneDrive\\Desktop\\Fisere\\" + user.getFullName() + ".txt");
        file.delete();
    }


}
