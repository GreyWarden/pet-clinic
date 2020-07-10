package com.greydevelopments.petclinic.bootstrap.infrastructure.load;

import com.greydevelopments.petclinic.person.owner.domain.models.Owner;
import com.greydevelopments.petclinic.person.owner.domain.repositories.OwnerRepository;
import com.greydevelopments.petclinic.pet.pettype.domain.models.PetType;
import com.greydevelopments.petclinic.pet.pettype.domain.repositories.PetTypeRepository;
import com.greydevelopments.petclinic.vet.vet.domain.models.Vet;
import com.greydevelopments.petclinic.vet.vet.domain.repositories.VetRepository;
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

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType dogType = petTypeRepository.save(dog);
        PetType cat = new PetType();
        cat.setName("Cat");
        PetType catType = petTypeRepository.save(cat);
        System.out.println("Loaded pet types...");

        Owner laura = new Owner();
        laura.setFirstName("Laura");
        laura.setLastName("Coratge");
        ownerRepository.save(laura);

        Owner raul = new Owner();
        raul.setFirstName("Raúl");
        raul.setLastName("Pavón");
        ownerRepository.save(raul);

        System.out.println("Loaded owners...");

        Vet firstVet = new Vet();
        firstVet.setFirstName("Vet");
        firstVet.setLastName("Erinario");
        vetRepository.save(firstVet);

        Vet secondVet = new Vet();
        secondVet.setFirstName("Vet");
        secondVet.setLastName("Adine");
        vetRepository.save(secondVet);

        System.out.println("Loaded vets...");
    }
}
