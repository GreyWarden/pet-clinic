package com.greydevelopments.petclinic.person.vet.specialty.infrastructure.repositories;

import com.greydevelopments.petclinic.person.vet.specialty.domain.models.Specialty;
import com.greydevelopments.petclinic.person.vet.specialty.domain.repositories.SpecialtyRepository;
import com.greydevelopments.petclinic.shared.infrastructure.repositories.map.AbstractMapRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public final class SpecialtyMapRepository
        extends AbstractMapRepository<Specialty, Long>
        implements SpecialtyRepository
{
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }
}
