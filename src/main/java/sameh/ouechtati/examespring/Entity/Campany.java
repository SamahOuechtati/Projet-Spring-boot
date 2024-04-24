package sameh.ouechtati.examespring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "campany")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Campany {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column( name = "campanyID")
    Long campanyID;
    String campanyName;
    String adress;
}
