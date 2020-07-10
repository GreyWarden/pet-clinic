package com.greydevelopments.petclinic.person.owner.infrastructure.repositories.map;

import com.greydevelopments.petclinic.person.owner.domain.models.Owner;
import com.greydevelopments.petclinic.person.owner.domain.repositories.OwnerRepository;
import com.greydevelopments.petclinic.pet.pet.domain.repositories.PetRepository;
import com.greydevelopments.petclinic.pet.pettype.domain.repositories.PetTypeRepository;
import com.greydevelopments.petclinic.shared.infrastructure.repositories.map.AbstractMapRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public final class OwnerMapRepository
        extends AbstractMapRepository<Owner, Long>
        implements OwnerRepository
{
    private final PetTypeRepository petTypeRepository;
    private final PetRepository petRepository;

    public OwnerMapRepository(PetTypeRepository petTypeRepository, PetRepository petRepository) {
        this.petTypeRepository = petTypeRepository;
        this.petRepository = petRepository;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        if (object == null) {
            return null;
        }

        if (object.getPets() != null) {
            object.getPets().forEach(pet -> {
                if(pet.getPetType() == null) {
                    throw new RuntimeException("Pet must have a Pet Type");
                }
                if (pet.getPetType().getId() == null) {
                    pet.getPetType().setId(
                            petTypeRepository.save(pet.getPetType()).getId()
                    );
                }
                if(pet.getId() == null) {
                    pet.setId(petRepository.save(pet).getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
