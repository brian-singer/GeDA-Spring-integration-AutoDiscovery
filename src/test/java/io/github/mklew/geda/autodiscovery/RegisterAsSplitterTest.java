package io.github.mklew.geda.autodiscovery;

import io.github.mklew.geda.autodiscovery.domain.impl.PersonImpl;
import io.github.mklew.geda.autodiscovery.dto.impl.PersonDtoImpl;
import io.github.mklew.geda.autodiscovery.internal.RegisterAsSplitterImpl;
import org.fest.assertions.Assertions;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public class RegisterAsSplitterTest
{
  
    RegisterAsSplitter registerAsSplitter;
    
    @Test
    public void should_split_classes_for_entites_and_dtos(){
         // given
        Set<Class<?>> toRegister = new HashSet<>();
        toRegister.add(PersonImpl.class);
        toRegister.add(PersonDtoImpl.class);

        registerAsSplitter = new RegisterAsSplitterImpl();

        // when
        DtosAndEntites dtosAndEntites = registerAsSplitter.split(toRegister);

        // then
        Assertions.assertThat(dtosAndEntites.getDtos()).contains(PersonDtoImpl.class);
        Assertions.assertThat(dtosAndEntites.getEntities()).contains(PersonImpl.class);
    }
}
