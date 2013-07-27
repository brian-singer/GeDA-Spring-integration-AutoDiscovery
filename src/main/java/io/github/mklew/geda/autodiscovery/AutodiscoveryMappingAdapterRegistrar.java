package io.github.mklew.geda.autodiscovery;

import com.inspiresoftware.lib.dto.geda.impl.MappingAdapterRegistrar;

import java.util.Collections;
import java.util.Map;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public class AutodiscoveryMappingAdapterRegistrar extends MappingAdapterRegistrar
{
    public AutodiscoveryMappingAdapterRegistrar()
    {
        super(Collections.<String, Object>emptyMap());
    }

    @Override
    protected Map<String, Object> getAdapters()
    {
        return super.getAdapters();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
