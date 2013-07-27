package io.github.mklew.geda.autodiscovery;

import java.util.Collection;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
public class RegisterAsAnnotationScanner
{
    private String basePackage;

    public RegisterAsAnnotationScanner(String basePackage)
    {
        this.basePackage = basePackage;
    }


    public void scan()
    {


    }

    public Collection<Class<?>> getClassesAnnotatedWithRegisterAs()
    {
         return null;

    }
}
