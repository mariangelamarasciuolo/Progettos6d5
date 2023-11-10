package mariangelamarasciuoloyt.gmail.com.Progettos6d5.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "dispositivi")
public class Dispositivo {
    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String stato;
    private String tipo;
    private Utente utente;
}
