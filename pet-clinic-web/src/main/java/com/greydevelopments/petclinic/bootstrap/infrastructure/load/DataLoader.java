package com.greydevelopments.petclinic.bootstrap.infrastructure.load;

import com.greydevelopments.petclinic.person.owner.domain.models.Owner;
import com.greydevelopments.petclinic.person.owner.domain.repositories.OwnerRepository;
import com.greydevelopments.petclinic.person.vet.vet.domain.models.Vet;
import com.greydevelopments.petclinic.person.vet.vet.domain.repositories.VetRepository;
import com.greydevelopments.petclinic.pet.pet.domain.models.Pet;
import com.greydevelopments.petclinic.pet.pet.domain.repositories.PetRepository;
import com.greydevelopments.petclinic.pet.pettype.domain.models.PetType;
import com.greydevelopments.petclinic.pet.pettype.domain.repositories.PetTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;

@Component
public final class DataLoader implements CommandLineRunner {

    private final OwnerRepository ownerRepository;
    private final VetRepository vetRepository;
    private final PetTypeRepository petTypeRepository;
    private final PetRepository petRepository;

    public DataLoader(
            OwnerRepository ownerRepository,
            VetRepository vetRepository,
            PetTypeRepository petTypeRepository,
            PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.vetRepository = vetRepository;
        this.petTypeRepository = petTypeRepository;
        this.petRepository = petRepository;
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

        Pet nami = petRepository.save(
                new Pet("Nami", LocalDate.now(), catType, laura)
        );

        Pet lila = new Pet("Lila", LocalDate.now(), dogType, raul);
        HashSet<Pet> raulPets = new HashSet<>();
        raulPets.add(lila);
        raul.setPets(raulPets);

        System.out.println("Loaded owners...");
        System.out.println("Loaded pets...");
        Vet firstVet = vetRepository.save(new Vet("Vet", "Erinario"));

        Vet secondVet = vetRepository.save(new Vet("Vet", "Adine"));

        System.out.println("Loaded vets...");
    }
}
