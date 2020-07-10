package com.greywarden.petclinic.pet.pet.infrastructure.repositories.map;

import com.greywarden.petclinic.pet.pet.domain.models.Pet;
import com.greywarden.petclinic.shared.domain.repositories.crud.CrudRepository;
import com.greywarden.petclinic.shared.infrastructure.repositories.map.AbstractMapRepository;

import java.util.Set;

public final class PetMapRepository
        extends AbstractMapRepository<Pet, Long>
        implements CrudRepository<Pet, Long>
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
