package reflection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FormattedStringBuilder {

    public static String formattedStringBuilder(ArrayList<String> stringArr){

        Stream<String> lines = stringArr.stream();
        return lines.collect(
                Collectors.joining("\n\n", "------\n", "\n------")
        );
    }
}
