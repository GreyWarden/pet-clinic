package com.greywarden.petclinic.services.map;

import com.greywarden.petclinic.model.Owner;
import com.greywarden.petclinic.services.CrudService;

import java.util.Set;

public final class OwnerMapRepository
        extends AbstractMapRepository<Owner, Long>
        implements CrudService<Owner, Long>
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
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
