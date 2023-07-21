package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {MinPartsValidator.class})
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinParts {
    String message() default "Minimum needs to be less than maximum. \n" +
            "Current inventory need to be more than minimum. \n" +
            "Maximum needs to be more than current inventory";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
