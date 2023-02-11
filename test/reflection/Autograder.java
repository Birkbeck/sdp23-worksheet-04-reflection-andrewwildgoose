package reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Autograder {

    static final String CLASS_NAME = "java.lang.Integer"; // TODO: insert the class name to be tested

    @Test
    public void testMoreThanFourFields() throws ClassNotFoundException {
        // TODO: add testing code

        Boolean answer;

        Class<?> classForTesting = Class.forName(CLASS_NAME);

        int noOfFields = classForTesting.getDeclaredFields().length;

        answer = noOfFields > 4;

        assertEquals(false, answer);

    }

    @Test
    public void testNonPrivateFields() throws ClassNotFoundException {
        // TODO: add testing code
        Boolean answer = false;

        Class<?> classForTesting = Class.forName(CLASS_NAME);

        Field[] fields = classForTesting.getDeclaredFields();

        for (Field field : fields) {
            int modifiers = field.getModifiers();

            if(Modifier.isPrivate(modifiers)) {
                answer = true;
                break;
            }
        }
        assertEquals(false, answer);

    }

    @Test
    public void testNoArrayListFields() throws ClassNotFoundException {
        Boolean answer = false;

        Class<?> classForTesting = Class.forName(CLASS_NAME);

        Field[] fields = classForTesting.getDeclaredFields();

        for (Field field : fields) {

            if(field.getType().toString().equals("ArrayList")) {
                answer = true;
                break;
            }
        }
        assertEquals(false, answer);
    }

    // TODO: add a test for each of the remaining items of Question 3
}
