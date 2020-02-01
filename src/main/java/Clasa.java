import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clasa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idClasa;

    String numeClasa;

    @Override
    public String toString() {
        return "Clasa{" +
                "idClasa=" + idClasa +
                ", numeClasa='" + numeClasa + '\'' +
                '}';
    }
}
