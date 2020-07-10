package com.greywarden.petclinic.bootstrap;

import com.greywarden.petclinic.models.Owner;
import com.greywarden.petclinic.models.Vet;
import com.greywarden.petclinic.repositories.OwnerRepository;
import com.greywarden.petclinic.repositories.VetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public final class DataLoader implements CommandLineRunner {

    private final OwnerRepository ownerService;
    private final VetRepository vetService;

    public DataLoader(OwnerRepository ownerService, VetRepository vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner laura = new Owner();
        laura.setFirstName("Laura");
        laura.setLastName("Coratge");
        ownerService.save(laura);

        Owner raul = new Owner();
        raul.setFirstName("Raúl");
        raul.setLastName("Pavón");
        ownerService.save(raul);

        System.out.println("Loaded owners...");

        Vet firstVet = new Vet();
        firstVet.setFirstName("Vet");
        firstVet.setLastName("Erinario");
        vetService.save(firstVet);

        Vet secondVet = new Vet();
        secondVet.setFirstName("Vet");
        secondVet.setLastName("Adine");
        vetService.save(secondVet);

        System.out.println("Loaded vets...");
    }
}
