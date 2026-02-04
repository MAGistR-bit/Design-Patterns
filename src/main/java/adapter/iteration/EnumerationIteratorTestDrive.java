package adapter.iteration;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        Enumeration<String> enumeration = new Vector<>(Arrays.asList(args)).elements();
        Iterator<?> iterator = new EnumerationIterator(enumeration);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
