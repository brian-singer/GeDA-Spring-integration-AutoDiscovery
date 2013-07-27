package io.github.mklew.geda.autodiscovery.internal;

import io.github.mklew.geda.autodiscovery.DEA;

import java.util.Set;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public class DEAImpl implements DEA
{
    private Set<Class<?>> dtos;

    private Set<Class<?>> entities;

    public DEAImpl(Set<Class<?>> dtos, Set<Class<?>> entities)
    {
        this.dtos = dtos;
        this.entities = entities;
    }

    @Override public Set<Class<?>> getDtos()
    {
        return dtos;
    }

    @Override public Set<Class<?>> getEntities()
    {
        return entities;
    }
}
