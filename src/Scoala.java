import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Scoala {
    String numeleScolii;
    public List<Sali> sali = new LinkedList<>();
    public List<Discipline> discipline= new LinkedList<>();
    public List<User> listaUseri= new LinkedList<>();
    public List<User> getListaUseri() {
        return listaUseri;
    }
    public void addUserToList(User user) {
        listaUseri.add(user);
    }
    public Scoala(String numeleScolii) {
        this.numeleScolii = numeleScolii;
    }


}
