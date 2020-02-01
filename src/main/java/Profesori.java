import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profesori {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idProfesor;

    String numeProfesor;

    @Override
    public String   toString() {
        return "Profesori{" +
                "idProfesor=" + idProfesor +
                ", numeProfesor='" + numeProfesor + '\'' +
                '}';
    }
}
