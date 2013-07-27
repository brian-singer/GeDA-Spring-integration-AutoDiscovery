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
public class AutoDiscoveryTest extends AbstractTestNGSpringContextTests
{
    @Autowired
    DTOSupport dtoSupport;

    @Test
    public void should_assemble_dto_using_auto_discovered_key()
    {
        new TestCases().should_assemble_dto_using_auto_discovered_key(dtoSupport);
    }

    @Test
    public void should_assemble_entity_using_dto()
    {
        new TestCases().should_assemble_entity_using_dto(dtoSupport);
    }

}
