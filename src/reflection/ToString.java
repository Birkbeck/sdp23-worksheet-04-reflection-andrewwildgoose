package reflection;

import java.util.ArrayList;
import java.util.Arrays;


public class ToString {
    public static String toString(Object obj) throws ClassNotFoundException {
        // TODO: implement the functionality for Question 4
        String output = "";
        Class objClass = obj.getClass();
        String objName = "Class info for: " + objClass.getName();
        output = objName + "/n";
        if (objClass.isInterface()){
            output += "This is an Interface";
        }else {
            output += "This is a Class";
        }





        return output;
    }
}
