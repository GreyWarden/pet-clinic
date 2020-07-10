package com.greywarden.petclinic.vet.vet.domain.repositories;

import com.greywarden.petclinic.vet.vet.domain.models.Vet;
import com.greywarden.petclinic.shared.domain.repositories.crud.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
