package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Stream;

public class DescribeClass {

    DescribeClass(){};

    // emits the interface of the class in Java syntax
    // (interface or class, modifiers, constructors,
    // methods, fields; no method bodies)

    public void describer(String... input)
            throws ClassNotFoundException {
        String className = input[0];
        Class<?> classForDescribing = Class.forName(className);

        System.out.println("Class describer");
        System.out.println("Given class name: " + className);
        System.out.println();

        boolean isInterface = classForDescribing.isInterface();
        String intOrClass = isInterface ? "Interface" : "Class";

        System.out.println("Class/Interface: " + intOrClass);
        System.out.println();

        System.out.println("Modifiers");
        int modifiers = classForDescribing.getModifiers();
        // Check if class is public
        boolean isPublic = Modifier.isPublic(modifiers);
        System.out.println("    Public: " + isPublic);
        // Check if class is abstract
        boolean isAbstract = Modifier.isAbstract(modifiers);
        System.out.println("    Abstract: " + isAbstract);
        // Check if class is final
        boolean isFinal = Modifier.isFinal(modifiers);
        System.out.println("    Final: " + isFinal);
        // Check if class is static
        boolean isStatic = Modifier.isStatic(modifiers);
        System.out.println("    Static: " + isStatic);
        System.out.println();

        System.out.println("Constructors");
        Constructor<?>[] constructors = classForDescribing.getConstructors();
        Stream<Constructor> constructorStream = Arrays.stream(constructors);
        constructorStream.map(constructor -> "    Constructor: " + constructor.toString())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Methods");
        Method[] methods = classForDescribing.getMethods();
        Stream<Method> methodStream = Arrays.stream(methods);
        methodStream.map(method -> "    Method: " + method.toGenericString())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Fields");
        Field[] fields = classForDescribing.getFields();
        Stream<Field> fieldStream = Arrays.stream(fields);
        fieldStream.map(field -> "    Field Name: " + field.getName()
                        + ", Field Type: " + field.getType().getSimpleName())
                .forEach(System.out::println);
        System.out.println();

        System.out.println();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length != 1)
            System.out.println("Usage: "); // TODO: describe how to use the utility

        // TODO: implement the functionality for Question 1

        DescribeClass descriptionMachine = new DescribeClass();

        descriptionMachine.describer(args);
    }
}
