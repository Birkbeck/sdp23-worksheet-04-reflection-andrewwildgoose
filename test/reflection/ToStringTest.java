package reflection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ToStringTest {

    // TODO: write tests for ToString.toString

    @Test
    public void testToString1() throws ClassNotFoundException {
        String correctAnswer = "Class info for: java.lang.String";
        String testStr = "Hello";
        String s = ToString.toString(testStr);
        ArrayList answerStream = new ArrayList();
        answerStream.add(s);
        assertLinesMatch(answerStream.stream(), correctAnswer.lines());
    }
}
