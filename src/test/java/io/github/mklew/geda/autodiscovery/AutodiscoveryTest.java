package io.github.mklew.geda.autodiscovery;

import com.inspiresoftware.lib.dto.geda.DTOSupport;
import io.github.mklew.geda.autodiscovery.domain.Person;
import io.github.mklew.geda.autodiscovery.domain.impl.PersonImpl;
import io.github.mklew.geda.autodiscovery.dto.PersonDto;
import io.github.mklew.geda.autodiscovery.dto.impl.PersonDtoImpl;
import org.fest.assertions.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
@ContextConfiguration("/spring-config.xml")
public class AutodiscoveryTest  extends AbstractTestNGSpringContextTests
{
    @Autowired
    DTOSupport dtoSupport;

    @Test
    public void should_assemble_dto_using_auto_discovered_key()
    {
        // given
        Person person = new PersonImpl();
        person.setFirstName("John");
        person.setLastName("Doe");

        // when
        final Object oDto = dtoSupport.assembleDtoByKey("personDtoKey", person, null);
        PersonDto personDto = (PersonDto) oDto;

        // then
        Assertions.assertThat(personDto.getFirstName()).isEqualTo(person.getFirstName());
        Assertions.assertThat(personDto.getLastName()).isEqualTo(person.getLastName());
    }

    @Test
    public void should_assemble_entity_using_dto()
    {
        // given
        PersonDto personDto = new PersonDtoImpl();
        personDto.setFirstName("John");
        personDto.setLastName("Doe");

        // when
        final Object oPerson = dtoSupport.assembleEntityByKey(personDto, "personEntityKey", null);
        Person person = (Person) oPerson;
        personDto.setLastName("Doe modified");
        // then
        Assertions.assertThat(person.getFirstName()).isEqualTo("John");
        Assertions.assertThat(person.getLastName()).isEqualTo("Doe");

    }

}
