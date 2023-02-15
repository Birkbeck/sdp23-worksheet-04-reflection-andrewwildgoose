package reflection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ToStringTest {

    // TODO: write tests for ToString.toString

    @Test
    public void testToString1() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        String correctAnswer = "Class info for: java.lang.String";
        String testStr = "Hello";
        String s = ToString.toString(testStr);
        ArrayList<String> answerStream = new ArrayList<>();
        answerStream.add(s);
        assertLinesMatch(correctAnswer.lines(), answerStream.stream());
    }

    @Test
    public void testFormattedStringBuilder() {
        String correctAnswer = "------\nClass info for: java.lang.String\n\nInterface or CLASS: This object is a Class\n------";
        ArrayList<String> lines = new ArrayList<>();
        lines.add("Class info for: java.lang.String");
        lines.add("Interface or CLASS: This object is a Class");
        FormattedStringBuilder builder = new FormattedStringBuilder();
        String answer = builder.formattedStringBuilder(lines);
        assertEquals(correctAnswer, answer);
    }
}
