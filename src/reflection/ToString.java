package reflection;


import java.lang.reflect.Field;
import java.util.ArrayList;

public class ToString {
    public static String toString(Object obj) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        // TODO: implement the functionality for Question 4
        // Initialise strings to collect info for each section
        ArrayList<String> stringCollector = new ArrayList<>();
        String className;
        String intOrClass;
        StringBuilder fieldsInfo = new StringBuilder("Field info:");

        // obtain basic class info
        Class<?> objClass = obj.getClass();
        className = "This Object is of type: " + objClass.getName();

        String intOrClassPrefix = "Interface or CLASS: ";
        if (objClass.isInterface()){
            intOrClass = intOrClassPrefix + "this object is an Interface";
        }else {
            intOrClass = intOrClassPrefix + "this object is a Class";
        }
        // obtain field info
        Field[] fields = objClass.getDeclaredFields();
        for (Field classField : fields){
            try {
                Field field = objClass.getDeclaredField(classField.toString());
                field.trySetAccessible();
                String value = field.get(obj).toString();
                fieldsInfo.append(field).append(": ").append(value);
            } catch (NoSuchFieldException e){
                System.out.println("field not found: " + classField.getName());
            }

        }

        // collect info strings and format them
        stringCollector.add(className);
        stringCollector.add(intOrClass);
        stringCollector.add(fieldsInfo.toString());

        FormattedStringBuilder builder = new FormattedStringBuilder();

        return builder.formattedStringBuilder(stringCollector);
    }

    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        String testStr = "Hello";
        String s = ToString.toString(testStr);
        System.out.println(s);
    }
}
