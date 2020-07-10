package com.greydevelopments.petclinic.pet.pet.infrastructure.repositories.map;

import com.greydevelopments.petclinic.pet.pet.domain.models.Pet;
import com.greydevelopments.petclinic.pet.pet.domain.repositories.PetRepository;
import com.greydevelopments.petclinic.shared.infrastructure.repositories.map.AbstractMapRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public final class PetMapRepository
        extends AbstractMapRepository<Pet, Long>
        implements PetRepository
{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
