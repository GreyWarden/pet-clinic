package com.greydevelopments.petclinic.pet.pet.domain.repositories;

import com.greydevelopments.petclinic.pet.pet.domain.models.Pet;
import com.greydevelopments.petclinic.shared.domain.repositories.crud.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
