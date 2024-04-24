package sameh.ouechtati.examespring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sameh.ouechtati.examespring.Entity.Campany;

public interface CampanyRepository extends JpaRepository<Campany,Long> {

    public Campany findByCampanyName(String campanyName);
}
