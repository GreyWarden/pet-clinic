package com.greywarden.petclinic.services.map;

import com.greywarden.petclinic.model.Vet;
import com.greywarden.petclinic.services.VetRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public final class VetMapRepository
        extends AbstractMapRepository<Vet, Long>
        implements VetRepository
{
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
