package com.greywarden.petclinic.repositories.map;

import com.greywarden.petclinic.models.Pet;
import com.greywarden.petclinic.repositories.CrudRepository;

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
