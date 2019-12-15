package com.kindless.moment.graphql.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface GraphqlType {

    @AliasFor("value")
    String name() default "";

    @AliasFor("name")
    String value() default "";

}