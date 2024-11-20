package java8.typeannotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target(ElementType.FIELD)
@interface NonNull{
    String message() default "Value cannot be null";
    int severity() default 1;
}
public class TypeAnnotations {
    @NonNull(message = "Custom message", severity = 2)
    private static final String name = "Hari";
    public static void main(String[] args) throws NoSuchFieldException {
        System.out.println(name);
        Field field = TypeAnnotations.class.getDeclaredField("name");
        Annotation annotation = field.getAnnotation(NonNull.class);
//        Annotation annotation = TypeAnnotations.class.getDeclaredField(name).getAnnotation(NonNull.class);
        System.out.println(annotation);
    }
}
