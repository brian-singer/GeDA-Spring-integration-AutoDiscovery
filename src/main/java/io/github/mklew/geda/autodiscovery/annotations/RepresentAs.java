package io.github.mklew.geda.autodiscovery.annotations;

import java.lang.annotation.*;

/**
 * @author Marek Lewandowski
 * @since 7/27/13
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepresentAs
{
    Class<?> value();
}
