package com.greywarden.petclinic.person.owner.domain.repositories;

import com.greywarden.petclinic.person.owner.domain.models.Owner;
import com.greywarden.petclinic.shared.domain.repositories.crud.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
