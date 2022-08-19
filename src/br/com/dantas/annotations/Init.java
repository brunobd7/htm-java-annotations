package br.com.dantas.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/* Method Level Annotation Example
*
* Imagine that before serializing an object to a JSON string, we want to execute some method
* to initialize an object. For that reason, we're going to create an annotation to mark this method.
*
* */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Init {
}
