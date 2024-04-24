package sameh.ouechtati.examespring.Services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import sameh.ouechtati.examespring.Entity.Donation;
import sameh.ouechtati.examespring.Entity.DonationType;
import sameh.ouechtati.examespring.Repository.DonationRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class DonationService implements IDonationService{

    DonationRepository don;

    @Override
    public Donation addDonation(Donation donation) {

        if (donation.getType() == DonationType.MONOTARY) {
            if (donation.getAmount() <= 0) {
                throw new IllegalArgumentException("Amount must be greater than 0 for MONETARY donations.");
            }
        } else {
            donation.setAmount(0);
        }

        Donation savedDonation = don.save(donation);

        return savedDonation;
    }

    @Override
    public Set<Donation> getDonationByType(DonationType type) {
        List<Donation> donationList = don.findByTypeOrderByDateAsc(type);

        return donationList.stream().collect(Collectors.toSet());
    }


}
