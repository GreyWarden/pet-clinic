package com.greydevelopments.petclinic.vet.vet.infrastructure.repositories.map;

import com.greydevelopments.petclinic.vet.vet.domain.models.Vet;
import com.greydevelopments.petclinic.vet.vet.domain.repositories.VetRepository;
import com.greydevelopments.petclinic.shared.infrastructure.repositories.map.AbstractMapRepository;
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
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
