package com.greywarden.petclinic.repositories;

import com.greywarden.petclinic.models.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
