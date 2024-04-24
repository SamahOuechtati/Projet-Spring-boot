package sameh.ouechtati.examespring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "donation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Donation {

    @ManyToOne
    Employe employe;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "donID")
    Long donID;
    float amount;
    Date date;

    @Enumerated(EnumType.STRING)
    DonationType type;
}
