package reflection;

import java.util.Arrays;


public class ToString {
    public static String toString(Object obj) throws ClassNotFoundException {
        // TODO: implement the functionality for Question 4

        String classNameString = obj.toString();

        System.out.println("Class info for: " + classNameString);

        Class<?> classObj = Class.forName(classNameString);

        public static String classOrInterface(Boolean inter){
            if inter
        }

        System.out.println("Class or Interface = " + classObj.isInterface());


        System.out.println(("Declared Fields: " + Arrays.toString(classObj.getDeclaredFields())));

        System.out.println(("Declared Methods: " + Arrays.toString(classObj.getDeclaredMethods())));

        System.out.println(("Declared Constructor: " + Arrays.toString(classObj.getDeclaredConstructors())));

        return null;
    }
}
