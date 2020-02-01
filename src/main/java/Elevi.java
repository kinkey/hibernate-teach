import javax.persistence.*;
import java.util.List;

@Entity
public class Elevi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idElev;

    String numeElev;

    @ManyToOne
    @JoinColumn(name = "idClasa")
    Clasa clasaDeCareApartineElevul;

    @OneToMany(mappedBy = "elevulCareAObtinuAceastaNota")
    List<Note> note;

    @Override
    public String toString() {
        return "\nElevi{" +
                "idElev=" + idElev +
                ", numeElev='" + numeElev + '\'' +
                ", clasaDeCareApartineElevul=" + clasaDeCareApartineElevul +
                '}';
    }
}
