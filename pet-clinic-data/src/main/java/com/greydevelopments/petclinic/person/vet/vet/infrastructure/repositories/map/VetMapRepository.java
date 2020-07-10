package com.greydevelopments.petclinic.person.vet.vet.infrastructure.repositories.map;

import com.greydevelopments.petclinic.person.vet.specialty.domain.models.Specialty;
import com.greydevelopments.petclinic.person.vet.specialty.domain.repositories.SpecialtyRepository;
import com.greydevelopments.petclinic.person.vet.vet.domain.models.Vet;
import com.greydevelopments.petclinic.person.vet.vet.domain.repositories.VetRepository;
import com.greydevelopments.petclinic.shared.infrastructure.repositories.map.AbstractMapRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public final class VetMapRepository
        extends AbstractMapRepository<Vet, Long>
        implements VetRepository
{
    SpecialtyRepository specialtyRepository;

    public VetMapRepository(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

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
        Set<Specialty> specialties = object.getSpecialties();
        if(specialties.size() > 0) {
            specialties.forEach(specialty -> {
                if(specialty.getId() != null) {
                    return;
                }
                specialty.setId(specialtyRepository.save(specialty).getId());
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
