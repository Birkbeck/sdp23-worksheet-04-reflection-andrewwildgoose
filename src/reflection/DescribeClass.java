package reflection;

import java.util.Arrays;

public class DescribeClass {
    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length != 1)
            System.out.println("Usage: "); // TODO: describe how to use the utility

        // TODO: implement the functionality for Question1

        String classNameString = args[0];

        System.out.println("Class info for: " + args[0]);
        Class<?> classForEmitting = Class.forName(classNameString);

        System.out.println("Interface = " + classForEmitting.isInterface());

        System.out.println(("Declared Fields: " + Arrays.toString(classForEmitting.getDeclaredFields())));

        System.out.println(("Declared Methods: " + Arrays.toString(classForEmitting.getDeclaredMethods())));

        System.out.println(("Declared Constructor: " + Arrays.toString(classForEmitting.getDeclaredConstructors())));





    }
}
