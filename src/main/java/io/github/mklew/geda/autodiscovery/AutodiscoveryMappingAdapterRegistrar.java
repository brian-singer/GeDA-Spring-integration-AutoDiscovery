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
    private final String[] basePackages;

    public AutodiscoveryMappingAdapterRegistrar(String... basePackages)
    {
        super(Collections.<String, Object>emptyMap());
        this.basePackages = basePackages;
    }

    @Override
    protected Map<String, Object> getAdapters()
    {
        // TODO implement this
        return super.getAdapters();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
