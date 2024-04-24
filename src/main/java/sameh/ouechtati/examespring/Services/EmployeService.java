package sameh.ouechtati.examespring.Services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sameh.ouechtati.examespring.Entity.Campany;
import sameh.ouechtati.examespring.Entity.Employe;
import sameh.ouechtati.examespring.Repository.CampanyRepository;
import sameh.ouechtati.examespring.Repository.EmployeRepository;

@Service
@AllArgsConstructor
@Transactional
public class EmployeService implements IEmployeService{

    EmployeRepository emp;
    CampanyRepository camp;
    @Override
    public Employe addEmployeAndAssignToCompany(Employe employe, String campanyName) {

        Campany campany = camp.findByCampanyName(campanyName);


        employe.setCampany(campany);

        Employe savedEmploye = emp.save(employe);

        return savedEmploye;

    }

    @Override
    public void getEmployeByDonation() {

    }
}
