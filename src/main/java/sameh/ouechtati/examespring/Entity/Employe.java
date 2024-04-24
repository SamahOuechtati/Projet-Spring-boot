package sameh.ouechtati.examespring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "employe")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employe {

   @ManyToOne
   Campany campany;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "employeID")
    Long employeID;
    String lastName;
    String firstName;
    String position;
}
