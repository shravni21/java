package Annotations_and_Java_doc;

import java.lang.annotation.*;

@Documented

@Target(value = ElementType.LOCAL_VARIABLE)
@interface Myanno {
    // they should not throw error, should not have any arguments
    // meta data
    String name();

    String project();

    String date() default "today";

    String version() default "1";
}

public class User_defined_annotation {
    // @Myanno(name = "Shravni")
    int data;

    public static void main(String[] args) {
        @Myanno(name = "Shravni", date = "21-12-2001", project = "CodeCollaborator", version = "2.1")
        int x;
    }
}
