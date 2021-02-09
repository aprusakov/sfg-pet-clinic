package com.spring.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet
{
    private PetType petType;
    private Owner owner;
    private LocalDate birthday;

    public PetType getPetType()
    {
        return petType;
    }

    public void setPetType(final PetType petType)
    {
        this.petType = petType;
    }

    public Owner getOwner()
    {
        return owner;
    }

    public void setOwner(final Owner owner)
    {
        this.owner = owner;
    }

    public LocalDate getBirthday()
    {
        return birthday;
    }

    public void setBirthday(final LocalDate birthday)
    {
        this.birthday = birthday;
    }
}
