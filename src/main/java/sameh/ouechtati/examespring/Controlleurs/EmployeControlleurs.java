package sameh.ouechtati.examespring.Controlleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sameh.ouechtati.examespring.Entity.Employe;
import sameh.ouechtati.examespring.Services.IEmployeService;

@RestController
@RequestMapping("/employe")
public class EmployeControlleurs {

    @Autowired
    IEmployeService emp;

    @PostMapping("/addEmploye/{campanyName}")
    public Employe ajouterEmployeToCampany(@RequestBody Employe employe,@PathVariable String campanyName){
        return emp.addEmployeAndAssignToCompany(employe,campanyName);
    }
}
