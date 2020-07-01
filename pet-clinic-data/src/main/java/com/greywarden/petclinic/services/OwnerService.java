package com.greywarden.petclinic.services;

import com.greywarden.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
