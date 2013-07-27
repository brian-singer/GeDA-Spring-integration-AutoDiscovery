package io.github.mklew.geda.autodiscovery.domain.impl;

import io.github.mklew.geda.autodiscovery.annotations.RegisterAs;
import io.github.mklew.geda.autodiscovery.annotations.RepresentAs;
import io.github.mklew.geda.autodiscovery.domain.Person;
import io.github.mklew.geda.autodiscovery.dto.PersonDto;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
@RegisterAs("personEntityKey")
@RepresentAs(PersonDto.class)
public class PersonImpl implements Person
{
    private String firstName;

    private String lastName;

    @Override
    public String getFirstName()
    {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    @Override
    public String getLastName()
    {
        return lastName;
    }

    @Override
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
