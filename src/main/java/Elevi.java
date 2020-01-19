import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Elevi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idElev;

    String numeElev;

    Integer idClasa;

    @Override
    public String toString() {
        return "Elevi{" +
                "idElev=" + idElev +
                ", numeElev='" + numeElev + '\'' +
                ", idClasa=" + idClasa +
                '}';
    }
}
