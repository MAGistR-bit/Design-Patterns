package adapter.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        Iterator<String> iterator = new ArrayList<>(Arrays.asList(args)).iterator();
        Enumeration<?> enumeration = new IteratorEnumeration(iterator);

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
