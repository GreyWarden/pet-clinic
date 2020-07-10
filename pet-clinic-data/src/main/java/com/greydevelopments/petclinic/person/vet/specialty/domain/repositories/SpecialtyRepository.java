package com.greydevelopments.petclinic.person.vet.specialty.domain.repositories;

import com.greydevelopments.petclinic.person.vet.specialty.domain.models.Specialty;
import com.greydevelopments.petclinic.shared.domain.repositories.crud.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
