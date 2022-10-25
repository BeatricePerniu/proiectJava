import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;


public class Parinte extends User {
    public Parinte(String fullName,String email) {
        super(fullName,email);
    }
    public String nrTel;
    public String adresa;
    public int varsta;
    //lista elevi pentru care e parinte
    SimpleDateFormat formatFrom = new SimpleDateFormat("yyyy-MM-dd");
    public String ocupatia;



    public Parinte(String fullName, String email, String nrTel, String adresa, int varsta, SimpleDateFormat formatFrom, String ocupatia) {
        super(fullName, email);
        this.nrTel = nrTel;
        this.adresa = adresa;
        this.varsta = varsta;
        this.formatFrom = formatFrom;
        this.ocupatia = ocupatia;

    }
    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public SimpleDateFormat getFormatFrom() {
        return formatFrom;
    }

    public void setFormatFrom(SimpleDateFormat formatFrom) {
        this.formatFrom = formatFrom;
    }

    public String getOcupatia() {
        return ocupatia;
    }

    public void setOcupatia(String ocupatia) {
        this.ocupatia = ocupatia;
    }
}
