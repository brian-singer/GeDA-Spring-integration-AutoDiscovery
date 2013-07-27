package io.github.mklew.geda.autodiscovery.internal;

import io.github.mklew.geda.autodiscovery.RegisterAsAnnotationScanner;
import io.github.mklew.geda.autodiscovery.annotations.RegisterAs;
import org.reflections.Reflections;

import java.util.Set;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public class RegisterAsAnnotationScannerImpl implements RegisterAsAnnotationScanner
{
    private final String[] basePackages;
    private Set<Class<?>> withRegisterAs;

    public RegisterAsAnnotationScannerImpl(String... basePackages)
    {
        this.basePackages = basePackages;
    }


    @Override public void scan()
    {
        final Reflections reflections = new Reflections(basePackages);
        withRegisterAs = reflections.getTypesAnnotatedWith(RegisterAs.class);
    }

    @Override public Set<Class<?>> getClassesAnnotatedWithRegisterAs()
    {
        return withRegisterAs;
    }
}
