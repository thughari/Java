package java8.annotations;

import java.lang.reflect.Method;

@MyAnnotation(value = "Custom Value", version = 2)
public class MyAnnotationMain {
    @MyAnnotation(value = "On method")
    static public void annotatedMethod(){
        System.out.println("annotated method here");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method my = MyAnnotationMain.class.getMethod("annotatedMethod");
        MyAnnotation annotatedVals = MyAnnotationMain.class.getAnnotation(MyAnnotation.class);
        System.out.println(annotatedVals.version());
        System.out.println(annotatedVals.value());
        System.out.println(my.getAnnotation(MyAnnotation.class));
//        my.getAnnotations();
    }
}
