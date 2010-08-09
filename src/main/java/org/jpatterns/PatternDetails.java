package org.jpatterns;

import java.lang.annotation.*;

/**
 * @author Heinz Kabutz
 * @since 2010-08-09
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {
    ElementType.TYPE,
    ElementType.CONSTRUCTOR,
    ElementType.FIELD,
    ElementType.LOCAL_VARIABLE,
    ElementType.METHOD,
    ElementType.PARAMETER
    })
@Documented
@Inherited
public @interface PatternDetails {
  Class[] participants() default {};
  String comment() default "";
}