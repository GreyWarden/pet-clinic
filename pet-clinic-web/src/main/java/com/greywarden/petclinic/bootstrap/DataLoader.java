package com.greywarden.petclinic.bootstrap;

import com.greywarden.petclinic.model.Owner;
import com.greywarden.petclinic.model.Vet;
import com.greywarden.petclinic.services.OwnerRepository;
import com.greywarden.petclinic.services.VetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public final class DataLoader implements CommandLineRunner {

    private final OwnerRepository ownerRepository;
    private final VetRepository vetRepository;

    public DataLoader(OwnerRepository ownerRepository, VetRepository vetRepository) {
        this.ownerRepository = ownerRepository;
        this.vetRepository = vetRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner laura = new Owner();
        laura.setId(1L);
        laura.setFirstName("Laura");
        laura.setLastName("Coratge");
        ownerRepository.save(laura);

        Owner raul = new Owner();
        raul.setId(2L);
        raul.setFirstName("Raúl");
        raul.setLastName("Pavón");
        ownerRepository.save(raul);

        System.out.println("Loaded owners...");

        Vet firstVet = new Vet();
        firstVet.setId(3L);
        firstVet.setFirstName("Vet");
        firstVet.setLastName("Erinario");
        vetRepository.save(firstVet);

        Vet secondVet = new Vet();
        secondVet.setId(4L);
        secondVet.setFirstName("Vet");
        secondVet.setLastName("Adine");
        vetRepository.save(secondVet);

        System.out.println("Loaded vets...");
    }
}
