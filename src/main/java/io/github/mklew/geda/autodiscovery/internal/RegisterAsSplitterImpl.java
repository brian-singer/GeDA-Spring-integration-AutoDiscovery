package io.github.mklew.geda.autodiscovery.internal;

import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import io.github.mklew.geda.autodiscovery.RegisterAsSplitter;
import io.github.mklew.geda.autodiscovery.DtosAndEntites;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public class RegisterAsSplitterImpl implements RegisterAsSplitter
{
    @Override public DtosAndEntites split(Set<Class<?>> toRegister)
    {
        Set<Class<?>> dtos = new HashSet<>();
        Set<Class<?>> entities = new HashSet<>();

        for(Class<?> clazz : toRegister)
        {
            if(clazz.isAnnotationPresent(Dto.class))
                dtos.add(clazz);
            else
                entities.add(clazz);
        }

        return new DtosAndEntitesImpl(dtos, entities);
    }
}
