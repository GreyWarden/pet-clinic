package com.greywarden.petclinic.pet.pettype.domain.repositories;

import com.greywarden.petclinic.pet.pettype.domain.models.PetType;
import com.greywarden.petclinic.shared.domain.repositories.crud.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
