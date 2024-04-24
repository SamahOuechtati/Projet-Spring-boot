package sameh.ouechtati.examespring.Services;

import sameh.ouechtati.examespring.Entity.Donation;
import sameh.ouechtati.examespring.Entity.DonationType;

import java.util.Set;

public interface IDonationService {

    public Donation addDonation (Donation donation);
    public Set<Donation> getDonationByType(DonationType type);
}
