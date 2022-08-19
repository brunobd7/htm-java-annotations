package br.com.dantas.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* CLASS LEVEL ANNOTATION SAMPLE

* 1 -> First step we use keyword @interface to declare this
* are an annotations class.
*
* 2 -> Declare Scope and Target of custom annotations .
*   - first annotations has runtime visibility, and we can apply it to types (classes)
*   -
*
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {

}
