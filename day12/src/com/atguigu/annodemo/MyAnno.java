package com.atguigu.annodemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnno {
    public String value() default "one";
    public String[] zhi() default {"Two","Three","Four"};
    public String one() default  "five";
}
