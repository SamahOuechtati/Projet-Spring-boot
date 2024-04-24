package sameh.ouechtati.examespring.Services;


import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sameh.ouechtati.examespring.Entity.Campany;
import sameh.ouechtati.examespring.Repository.CampanyRepository;

@Service
@AllArgsConstructor
@Transactional
public class CampanyService implements ICompanyService{

    CampanyRepository campanys;
    @Override
    public Campany addCompany(Campany company) {
        return campanys.save(company);


    }
}
