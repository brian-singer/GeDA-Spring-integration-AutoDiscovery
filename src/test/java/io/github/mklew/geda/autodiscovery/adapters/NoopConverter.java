package io.github.mklew.geda.autodiscovery.adapters;

import com.inspiresoftware.lib.dto.geda.adapter.BeanFactory;
import com.inspiresoftware.lib.dto.geda.adapter.ValueConverter;
import io.github.mklew.geda.autodiscovery.annotations.RegisterAs;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
@RegisterAs("noopConverterKey")
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
