package com.greydevelopments.petclinic.pet.pettype.domain.repositories;

import com.greydevelopments.petclinic.pet.pettype.domain.models.PetType;
import com.greydevelopments.petclinic.shared.domain.repositories.crud.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
