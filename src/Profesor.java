import java.util.Date;

enum TipProfesor{
     SCOALA_PRIMARA("Primara"),
     SCOALA_GIMNAZIALA("Gimnaziala"),
     LICEU("Liceu");

    private String tipProfesor;
     TipProfesor(String tipProfesor){
         this.tipProfesor=tipProfesor;
     }
}
public class Profesor<tipProfesor> extends User{
    public Profesor(String fullName,String email) {
        super(fullName,email);
    }
    public TipProfesor tipProfesor;
    public int nrOrePredate;
    public double salariu;
    public String dataAng;
    public Discipline disciplne;
    public Clasa predaClasa;
    public int nrTelefon;

    public Profesor(String fullName, String email, TipProfesor tipProfesor, int nrOrePredate, double salariu, String dataAng,Discipline disciplne,Clasa predaClasa,int nrTelefon) {
        super(fullName, email);
        this.tipProfesor = tipProfesor;
        this.nrOrePredate = nrOrePredate;
        this.salariu = salariu;
        this.dataAng = dataAng;
        this.disciplne=disciplne;
        this.predaClasa=predaClasa;
        this.nrTelefon=nrTelefon;
    }

    public TipProfesor getTipProfesor() {
        return tipProfesor;
    }

    public void setTipProfesor(TipProfesor tipProfesor) {
        this.tipProfesor = tipProfesor;
    }

    public int getNrOrePredate() {
        return nrOrePredate;
    }

    public void setNrOrePredate(int nrOrePredate) {
        this.nrOrePredate = nrOrePredate;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public String getDataAng() {
        return dataAng;
    }

    public void setDataAng(String dataAng) {
        this.dataAng = dataAng;
    }

    public Discipline getDisciplne() {
        return disciplne;
    }

    public void setDisciplne(Discipline disciplne) {
        this.disciplne = disciplne;
    }

    public Clasa getPredaClasa() {
        return predaClasa;
    }

    public void setPredaClasa(Clasa predaClasa) {
        this.predaClasa = predaClasa;
    }
}