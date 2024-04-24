package sameh.ouechtati.examespring.Services;

import sameh.ouechtati.examespring.Entity.Employe;

public interface IEmployeService {

    public Employe addEmployeAndAssignToCompany(Employe employe,String campanyName);

    public void getEmployeByDonation();
}
