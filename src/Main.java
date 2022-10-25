import java.text.SimpleDateFormat;

public class Main {


    public static void main(String[] args) {
          Contabil contabilul = new Contabil("Filip Ioan","ds@gmail.com");
         Admin admin=new Admin("filip","ds@gmail.com");
       //   Scoala scoala= new Scoala("SCOALA DE ARTE SI MESERI");

        // adaug sala la scoala
        //  scoala.sali.add(Sali.SALA_1);
        Admin admin1 = new Admin("Admin","filip@gmail.com");
      //  Contabil contabil= new Contabil("Contabil","abc@gmail.com");
      //  admin.genereazaFisierListaMembri();
       // Scoala scoala1 = new Scoala("SCOALA DE ARTE SI MESERI2");

        // am adaugat userul admin in lista de useri
        //  admin.generateFile();
       //   admin.genereazaParolaPentruUser(contabil);
       //   scoala.listaUseri.add(admin);
//         scoala.listaUseri.add(contabil);
////         admin.stergeFisier();
//          //admin o generat lista de useri din scoala
//  admin.genereazaFisierListaMembri(scoala);

        //  admin.generateFile();
       // admin.stergeFisier(contabil);
        //   admin.genereazaParolaPentruUser(contabil);

        Elev elev=new Elev("Marian","marian@gmail.com");
        Parinte parinte=new Parinte("mar","mar@gmail.com");
        Parinte parinte1=new Parinte("mari","mari@gmail.com","078493","calea vitan",23,new SimpleDateFormat("2001-01-21"),"prof");
        System.out.println(parinte1);
        Materie romana=new Materie(Discipline.BIOLOGIE);
        Elev elev1=new Elev("Marian","marian@gmail.com",'f',13,"21-01-2003","calea v",Clasa.CLASA_0,true,romana);
        System.out.println(elev1);
        //Scoala scoala=new Scoala();
        //admin.genereazaFisierListaMembri();
        elev1.incarcaTema(Discipline.BIOLOGIE,"mam","tema");

            }
}