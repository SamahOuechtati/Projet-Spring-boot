package sameh.ouechtati.examespring.Services;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDonation {


    @After("execution(* sameh.ouechtati.examespring.Services.DonationService.addDonation(..))")
    public void afterAddDonation() {
        System.out.println("Merci pour ce don");
    }
}
