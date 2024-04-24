package sameh.ouechtati.examespring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sameh.ouechtati.examespring.Entity.Donation;
import sameh.ouechtati.examespring.Entity.DonationType;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation,Long> {

    List<Donation> findByTypeOrderByDateAsc(DonationType type);

}
