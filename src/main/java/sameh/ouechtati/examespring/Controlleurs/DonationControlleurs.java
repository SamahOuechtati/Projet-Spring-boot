package sameh.ouechtati.examespring.Controlleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sameh.ouechtati.examespring.Entity.Donation;
import sameh.ouechtati.examespring.Entity.DonationType;
import sameh.ouechtati.examespring.Services.IDonationService;

import java.util.Set;

@RestController
@RequestMapping("/donation")
public class DonationControlleurs {

    @Autowired
    IDonationService don;

    @PostMapping("/addDonation")
    public Donation addDonation(@RequestBody Donation donation ){
        return don.addDonation(donation);
    }

    @GetMapping("getDonationByType/{type}")
    public Set<Donation> getDonationByType(@PathVariable DonationType type) {
        return don.getDonationByType(type);
    }

    }
