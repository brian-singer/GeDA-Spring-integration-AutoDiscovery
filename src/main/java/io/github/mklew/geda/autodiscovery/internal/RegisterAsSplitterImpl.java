package io.github.mklew.geda.autodiscovery.internal;

import com.inspiresoftware.lib.dto.geda.adapter.Adapter;
import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import io.github.mklew.geda.autodiscovery.DEA;
import io.github.mklew.geda.autodiscovery.RegisterAsSplitter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public class RegisterAsSplitterImpl implements RegisterAsSplitter
{
    @Override public DEA split(Set<Class<?>> toRegister)
    {
        Set<Class<?>> dtos = new HashSet<>();
        Set<Class<?>> entities = new HashSet<>();
        Set<Class<?>> adapters = new HashSet<>();

        for(Class<?> clazz : toRegister)
        {
            if(clazz.isAnnotationPresent(Dto.class))
                dtos.add(clazz);
            else if(Adapter.class.isAssignableFrom(clazz))
                adapters.add(clazz);
            else
                entities.add(clazz);
        }

        return new DEAImpl(dtos, entities, adapters);
    }
}
