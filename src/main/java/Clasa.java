import javax.persistence.*;
import java.util.List;

@Entity
public class Clasa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idClasa;

    String numeClasa;

    @OneToMany(mappedBy = "clasaDeCareApartineElevul")
    List<Elevi> elevi;

    @Override
    public String toString() {
        return "Clasa{" +
                "idClasa=" + idClasa +
                ", numeClasa='" + numeClasa + '\'' +
                '}';
    }
}
