package io.github.mklew.geda.autodiscovery;

import io.github.mklew.geda.autodiscovery.annotations.RegisterAs;
import org.reflections.Reflections;

import java.util.Collection;
import java.util.Set;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public class RegisterAsAnnotationScanner
{
    private String basePackage;

    private Set<Class<?>> withRegisterAs;

    public RegisterAsAnnotationScanner(String basePackage)
    {
        this.basePackage = basePackage;
    }


    public void scan()
    {
        final Reflections reflections = new Reflections(basePackage);
        withRegisterAs = reflections.getTypesAnnotatedWith(RegisterAs.class);

    }

    public Set<Class<?>> getClassesAnnotatedWithRegisterAs()
    {
        return withRegisterAs;
    }
}
