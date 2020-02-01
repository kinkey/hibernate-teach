import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materii {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idMaterie;

    String numeMaterie;

    @Override
    public String toString() {
        return "Materii{" +
                "idMaterie=" + idMaterie +
                ", numeMaterie='" + numeMaterie + '\'' +
                '}';
    }
}
