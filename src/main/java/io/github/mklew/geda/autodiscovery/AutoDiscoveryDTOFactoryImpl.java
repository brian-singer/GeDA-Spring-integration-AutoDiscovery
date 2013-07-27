package io.github.mklew.geda.autodiscovery;

import com.inspiresoftware.lib.dto.geda.impl.DTOFactoryImpl;
import io.github.mklew.geda.autodiscovery.internal.DtoEntitySplitterImpl;
import io.github.mklew.geda.autodiscovery.internal.RegisterAsAnnotationScannerImpl;

import javax.annotation.PostConstruct;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public class AutoDiscoveryDTOFactoryImpl extends DTOFactoryImpl
{
    private String basePackage;

    public AutoDiscoveryDTOFactoryImpl(String basePackage)
    {
        this.basePackage = basePackage;
    }

    @PostConstruct
    void registerDtosAndEntities()
    {
        DtoEntitySplitter splitter = new DtoEntitySplitterImpl();
        RegisterAsAnnotationScanner scanner = new RegisterAsAnnotationScannerImpl(basePackage);
        DtoEntityRegistrar registrar = new DtoEntityRegistrar();

        registrar.setDtoFactory(this);
        registrar.setRegisterAsAnnotationScanner(scanner);
        registrar.setSplitter(splitter);
        registrar.registerDtoAndEntites();
    }
}
