package com.greydevelopments.petclinic.bootstrap.infrastructure.load;

import com.greydevelopments.petclinic.person.owner.domain.models.Owner;
import com.greydevelopments.petclinic.person.owner.domain.repositories.OwnerRepository;
import com.greydevelopments.petclinic.pet.pettype.domain.models.PetType;
import com.greydevelopments.petclinic.pet.pettype.domain.repositories.PetTypeRepository;
import com.greydevelopments.petclinic.person.vet.vet.domain.models.Vet;
import com.greydevelopments.petclinic.person.vet.vet.domain.repositories.VetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public final class DataLoader implements CommandLineRunner {

    private final OwnerRepository ownerRepository;
    private final VetRepository vetRepository;
    private final PetTypeRepository petTypeRepository;

    public DataLoader(
            OwnerRepository ownerRepository,
            VetRepository vetRepository,
            PetTypeRepository petTypeRepository
    ) {
        this.ownerRepository = ownerRepository;
        this.vetRepository = vetRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dogType = petTypeRepository.save(new PetType("Dog"));
        PetType catType = petTypeRepository.save(new PetType("Cat"));
        System.out.println("Loaded pet types...");

        Owner laura = ownerRepository.save(
            new Owner(
                "Laura",
                "Coratge",
                "Calle falsa, 123",
                "Murcia",
                "622509280"
            )
        );

        Owner raul = ownerRepository.save(
            new Owner(
                "Raúl",
                "Pavón",
                "Calle falsa, 123",
                "Murcia",
                "637079361"
            )
        );

        System.out.println("Loaded owners...");

        Vet firstVet = vetRepository.save(new Vet("Vet", "Erinario"));

        Vet secondVet = vetRepository.save(new Vet("Vet", "Adine"));

        System.out.println("Loaded vets...");
    }
}
