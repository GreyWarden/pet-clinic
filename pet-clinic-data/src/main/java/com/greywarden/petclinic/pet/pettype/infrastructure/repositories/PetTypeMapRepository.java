package com.greywarden.petclinic.pet.pettype.infrastructure.repositories;

import com.greywarden.petclinic.pet.pettype.domain.models.PetType;
import com.greywarden.petclinic.pet.pettype.domain.repositories.PetTypeRepository;
import com.greywarden.petclinic.shared.infrastructure.repositories.map.AbstractMapRepository;

import java.util.Set;

public final class PetTypeMapRepository
        extends AbstractMapRepository<PetType, Long>
        implements
        PetTypeRepository
{
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
