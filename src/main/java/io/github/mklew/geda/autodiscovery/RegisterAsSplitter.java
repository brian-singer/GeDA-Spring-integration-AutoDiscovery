package io.github.mklew.geda.autodiscovery;

import java.util.Set;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public interface RegisterAsSplitter
{
    DEA split(Set<Class<?>> toRegister);
}
