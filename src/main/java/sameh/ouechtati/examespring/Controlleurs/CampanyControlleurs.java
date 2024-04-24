package sameh.ouechtati.examespring.Controlleurs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sameh.ouechtati.examespring.Entity.Campany;
import sameh.ouechtati.examespring.Services.ICompanyService;

@RestController
@RequestMapping("/campany")
public class CampanyControlleurs {


    @Autowired
    ICompanyService camp;

    @PostMapping("/addCampany")
    public Campany ajouterCampany(@RequestBody Campany campany){
        return  camp.addCompany(campany);
    }
}
