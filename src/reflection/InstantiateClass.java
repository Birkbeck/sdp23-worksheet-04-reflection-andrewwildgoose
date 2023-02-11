package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class InstantiateClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if (args.length < 1)
            System.out.println("Usage: "); // TODO: describe how to use the utility

        // TODO: implement the functionality for Question 2
        // Get class name from args
        String classNameString = args[0];
        // Get string of constructor args
        String constructorArgs = Arrays.stream(args)
                .skip(1)
                .collect(Collectors.joining());

        System.out.println("Class instantiated: " + args[0]);

        // Create class object
        Class<?> classToInstantiate = Class.forName(classNameString);

        // Create relevant constructor object
        Constructor<?> constructor =  classToInstantiate.getConstructor(constructorArgs.getClass());

        Object inst1 = constructor.newInstance(constructorArgs);

        System.out.println(inst1);




    }
}
