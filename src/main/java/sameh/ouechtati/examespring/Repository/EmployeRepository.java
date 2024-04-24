package sameh.ouechtati.examespring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sameh.ouechtati.examespring.Entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
