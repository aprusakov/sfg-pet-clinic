package com.spring.sfgpetclinic.services;

import com.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends BaseService<Owner>
{
    Owner findByLastName(String lastName);
}
