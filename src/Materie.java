import java.util.ArrayList;
import java.util.List;

public class Materie {

    private  Discipline numeleMateriei;

    public Materie(Discipline numeleMateriei) {
        this.numeleMateriei = numeleMateriei;
    }

    private Sali sali;
    private List<Note> notele= new ArrayList<>();
    private List<String> homework= new ArrayList<>();

    public Discipline getNumeleMateriei() {
        return numeleMateriei;
    }

    public void setNumeleMateriei(Discipline numeleMateriei) {
        this.numeleMateriei = numeleMateriei;
    }

    public List<String> getHomework() {
        return homework;
    }

    public void setHomework(List<String> homework) {
        this.homework = homework;
    }
}
