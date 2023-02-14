package Annotation;

import java.lang.reflect.Field;

public class Application {
    public static void main(String[] args) {
        getAnonn(Person.class);
    }

    public static void getAnonn(Class<?> customClass){
        Field[] fields = customClass.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];

            if (field.getAnnotation(Fielder.class) instanceof Fielder){
                System.out.print(field.getName());
                System.out.println("-"+field.getAnnotation(Fielder.class).params());

            }
        }
    }
}
