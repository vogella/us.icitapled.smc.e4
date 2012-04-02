package org.eclipse.e4.knowitall.special.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;


@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD, ElementType.PARAMETER})
public @interface Special {

}
