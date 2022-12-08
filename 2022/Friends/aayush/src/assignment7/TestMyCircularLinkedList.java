package assignment7;
// TestMyCircularLinkedList.java
// Test code for the MyCircularLinkedList class.
// Checks whether or not the iterator's remove method
// throws an UnsupportedOperationException.
// If not, then it tests that method as well.

import java.util.NoSuchElementException;
import java.util.Iterator;

public class TestMyCircularLinkedList {
    /** Main method */
    public static void main(String[] args) {
        // Create a list for strings
        MyCircularLinkedList<String> list = new MyCircularLinkedList<>();

        // Add elements to the list
        list.add("America"); // Add it to the list
        System.out.println("(1) " + list);
        testEqual(list.toString(), "[America]");

        list.add(0, "Canada"); // Add it to the beginning of the list
        System.out.println("(2) " + list);
        testEqual(list.toString(), "[Canada, America]");

        list.add("Russia"); // Add it to the end of the list
        System.out.println("(3) " + list);
        testEqual(list.toString(), "[Canada, America, Russia]");

        list.addLast("France"); // Add it to the end of the list
        System.out.println("(4) " + list);
        testEqual(list.toString(), "[Canada, America, Russia, France]");

        list.add(2, "Germany"); // Add it to the list at index 2
        System.out.println("(5) " + list);
        testEqual(list.toString(), "[Canada, America, Germany, Russia, France]");

        list.add(5, "Norway"); // Add it to the list at index 5
        System.out.println("(6) " + list);
        testEqual(list.toString(), "[Canada, America, Germany, Russia, France, Norway]");

        list.add(0, "Poland"); // Same as list.addFirst("Poland")
        System.out.println("(7) " + list);
        testEqual(list.toString(), "[Poland, Canada, America, Germany, Russia, France, Norway]");

        // Remove elements from the list
        list.remove(0); // Same as list.remove("Australia") in this case
        System.out.println("(8) " + list);
        testEqual(list.toString(), "[Canada, America, Germany, Russia, France, Norway]");

        list.remove(2); // Remove the element at index 2
        System.out.println("(9) " + list);
        testEqual(list.toString(), "[Canada, America, Russia, France, Norway]");

        list.remove(list.size() - 1); // Remove the last element
        System.out.print("(10) " + list + "\n(11) ");
        testEqual(list.toString(), "[Canada, America, Russia, France]");

        for (String s: list)
            System.out.print(s.toUpperCase() + " ");
        System.out.println();

        testEqual(list.size(), 4);
        list.clear();
        System.out.println("After clearing the list, the list size is " + list.size());
        testEqual(list.size(), 0);

        testTrue(!list.contains("America"));
        try {
            list.get(0);
            throw new RuntimeException("get(int) failed to throw exception on empty list");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        try {
            list.getFirst();
            throw new RuntimeException("getFirst() failed to throw exception on empty list");
        }
        catch (NoSuchElementException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        try {
            list.getLast();
            throw new RuntimeException("getLast() failed to throw exception on empty list");
        }
        catch (NoSuchElementException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        try {
            list.removeFirst();
            throw new RuntimeException("removeFirst() failed to throw exception on empty list");
        }
        catch (NoSuchElementException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        try {
            list.removeLast();
            throw new RuntimeException("removeLast() failed to throw exception on empty list");
        }
        catch (NoSuchElementException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        testEqual(list.indexOf("America"), -1);
        testEqual(list.lastIndexOf("America"), -1);
        testEqual(list.toString(), "[]");
        list.addFirst("Russia");
        list.addFirst("Canada");
        list.addLast("France");
        list.add(3, "Norway");
        testEqual(list.toString(), "[Canada, Russia, France, Norway]");
        try {
            list.add(5, "Belgium");
            throw new RuntimeException("add(int, E) failed to throw IndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        try {
            list.add(-1, "Belgium");
            throw new RuntimeException("add(int, E) failed to throw IndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        try {
            list.set(4, "America");
            throw new RuntimeException("set(int, E) failed to throw IndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        testEqual(list.toString(), "[Canada, Russia, France, Norway]");
        list.set(1, "America");
        list.add(3, "America");
        testEqual(list.toString(), "[Canada, America, France, America, Norway]");
        testEqual(list.indexOf("America"), 1);
        testEqual(list.lastIndexOf("America"), 3);
        testEqual(list.indexOf("Russia"), -1);
        testEqual(list.lastIndexOf("Belgium"), -1);
        String[] nations = new String[] { "Canada", "America", "France", "America", "Norway" };
        for (int i = 0; i < nations.length; i++)
            testEqual(list.get(i), nations[i]);
        testEqual(list.size(), 5);
        try {
            list.get(5);
            throw new RuntimeException("get(int) failed to throw IndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        try {
            list.get(-1);
            throw new RuntimeException("get(int) failed to throw IndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        Iterator<String> iter = list.iterator();
        for (int i = 0; i < nations.length; i++)
            testEqual(iter.next(), nations[i]);

        System.out.println("Required tests completed");

        iter = list.iterator();
        try {
            iter.remove();
        }
        catch (UnsupportedOperationException ex) {
            System.out.println("Not attempting bonus exercise");
            System.exit(0);
        }
        catch (Exception ex) {
            // They are attempting the bonus exercise.  Do nothing yet.
        }

        // The following tests will be run on your class if you attempt the bonus exercise.
        iter = list.iterator();
        try {
            iter.remove();
            throw new RuntimeException("remove() failed to throw IllegalStateException");
        }
        catch (IllegalStateException ex) {
            System.out.printf("Test %d successful\n", ++testNumber);
        }
        for (int i = 0; i < nations.length; i++) {
            String nation;
            testEqual(nation = iter.next(), nations[i]);
            if (nation.length() == 6) {
                iter.remove();
                try {
                    iter.remove();
                    throw new RuntimeException("remove() failed to throw IllegalStateException");
                }
                catch (IllegalStateException ex) {
                    System.out.printf("Test %d successful\n", ++testNumber);
                }
            }
        }
        testEqual(list.size(), 2);
        testEqual(list.toString(), "[America, America]");
        System.out.println("Bonus exercise tests completed");
    }

    private static int testNumber;

    private static void testEqual(String s1, String s2) {
        testNumber++;
        if (s1.equals(s2))
            System.out.printf("Test %d successful\n", testNumber);
        else {
            System.out.printf("Error: %s not equal to %s \n", s1, s2);
            throw new RuntimeException("Test " + testNumber + " failed");
        }
    }

    private static void testEqual(int i1, int i2) {
        testNumber++;
        if (i1 == i2)
            System.out.printf("Test %d successful\n", testNumber);
        else {
            System.out.printf("Error: %d not equal to %d \n", i1, i2);
            throw new RuntimeException("Test " + testNumber + " failed");
        }
    }

    private static void testTrue(boolean b) {
        testNumber++;
        if (b)
            System.out.printf("Test %d successful\n", testNumber);
        else
            throw new RuntimeException("Test " + testNumber + " failed");
    }
}
