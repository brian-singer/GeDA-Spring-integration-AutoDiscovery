package io.github.mklew.geda.autodiscovery.dto.impl;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */

import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;
import io.github.mklew.geda.autodiscovery.dto.PersonDto;

@Dto
public class PersonDtoImpl implements PersonDto
{
    @DtoField
    private String firstName;

    @DtoField
    private String lastName;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
