package sameh.ouechtati.examespring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "redcrescent")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RedCrescent {

    @OneToMany
    private Set<Donation> donation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "redID")
    Long redID;
    String area;

}
