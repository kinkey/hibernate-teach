import javax.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idNota;

    Integer valoareNota;


    Integer idPredare;

    @ManyToOne
    @JoinColumn(name = "idElev")
    Elevi elevulCareAObtinuAceastaNota;

    @Override
    public String toString() {
        return "\nNote{" +
                "idNota=" + idNota +
                ", valoareNota=" + valoareNota +
                ", idElev=" + elevulCareAObtinuAceastaNota.idElev +
                ", idPredare=" + idPredare +
                ", numeElev=" + elevulCareAObtinuAceastaNota.numeElev +
                '}';
    }
}
