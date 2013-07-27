package io.github.mklew.geda.autodiscovery.domain;

import com.inspiresoftware.lib.dto.geda.adapter.BeanFactory;
import com.inspiresoftware.lib.dto.geda.adapter.ValueConverter;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public class NoopConverter implements ValueConverter
{
    @Override
    public Object convertToDto(Object object, BeanFactory beanFactory)
    {
        return null;
    }

    @Override
    public Object convertToEntity(Object object, Object oldEntity, BeanFactory beanFactory)
    {
        return null;
    }
}
