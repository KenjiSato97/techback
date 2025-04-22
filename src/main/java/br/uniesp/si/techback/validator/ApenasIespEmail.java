package br.uniesp.si.techback.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = IespEmailValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApenasIespEmail {

    String message() default "o e-mail não é valido pois não contem '@iesp.com.br'";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
