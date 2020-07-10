package com.greywarden.petclinic.person.owner.infrastructure.repositories.map;

import com.greywarden.petclinic.shared.infrastructure.repositories.map.AbstractMapRepository;
import com.greywarden.petclinic.person.owner.domain.models.Owner;
import com.greywarden.petclinic.person.owner.domain.repositories.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public final class OwnerMapRepository
        extends AbstractMapRepository<Owner, Long>
        implements OwnerRepository
{
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
