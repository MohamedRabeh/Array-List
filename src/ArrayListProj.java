import java.util.ArrayList;
import java.util.*;

public class ArrayListProj {
    public static void main(String args[]) {
        System.out.println("Activity one : ArrayList");

        ArrayList<Integer> List1 = new ArrayList<Integer>();
        ArrayList<Integer> List2 = new ArrayList<Integer>();
        //ArrayList add operation
        List1.add(0, 10);
        List1.add(1, 35);
        List1.add(2, 26);
        List1.add(3, 80);
        List1.add(4, 174);
        List1.add(5, 3);
        List2.add(0, 3);
        List2.add(1, 174);
        System.out.println(List1);
        //arraylist contains operation

        boolean check1 = List1.contains(80);
        if (check1) {
            System.out.println("The list1 contains 80");
        } else {
            System.out.println("The list1 does not contains 80");
        }
        boolean check2 = List1.contains(66);
        if (check2) {
            System.out.println("The list1 contains 66");
        } else {
            System.out.println("The list1 does not contains 66");
        }
        //arraylist set operations

        List1.set(1,200);
        List1.set(3,73);
        System.out.println(List1);

        //arraylist remove operation

        List1.remove(1);
        System.out.println(List1);

        //array list retain all operation

        List1.retainAll(List2);
        System.out.println(List1);
    }
}

