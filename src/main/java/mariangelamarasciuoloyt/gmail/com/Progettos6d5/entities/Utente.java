package mariangelamarasciuoloyt.gmail.com.Progettos6d5.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "utenti")
public class Utente {
    //@OneToMany(mappedBy = "utente")
    //@JsonIgnore
    //List<Dispositivo> dispositivoList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String name;
    private String surname;
    private String email;
    private String avatar;
}
