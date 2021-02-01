package com._annotation;

import java.lang.annotation.Documented;

/**
 * To add metadata with annotation
 */

@AnnotationClass
public class HelloWorld_1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * @deprecated
     * explanation of why it was deprecated
     */
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("deprecated");
    }
}

@Documented
@interface AnnotationClass {
    String author() default "John Doe";

    String date() default "3/17/2002";

    int currentVersion() default 6;

    String lastModified() default "4/12/2004";

    String by() default "John Doe";

    String[] reviewer() default {"Alice", "Bill", "Cindy"};
}
