//Collections

import java.util.*;
public class ActivityTwo {

    public static void main(String args[]) {
        System.out.println("Activity Two : Collections ");
        //declaring arraylists
        List<Integer> List1= new ArrayList<Integer>();
        List<Integer> List2= new ArrayList<Integer>();
        //Arraylsit add operation
        List1.add(0,10);
        List1.add(1,35);
        List1.add(2,26);
        List1.add(3,80);
        List1.add(4,174);
        List1.add(5,3);

        List2.add(0,52);
        List2.add(1,356);
        List2.add(2,267);
        List2.add(3,800);
        List2.add(4,14);
        List2.add(5,39);

        System.out.println(List1);

        //collections sort

        Collections.sort(List1);
        System.out.println(List1);

        //collections copy

        Collections.copy(List2, List1);
        System.out.println(List2);

        //binary search

        int check;
        check=Collections.binarySearch(List2, 174);
        System.out.println(check);

        //collections.shuffle

        Collections.shuffle(List2);
        System.out.println(List2);

        //collections.reverse

        Collections.reverse(List2);
        System.out.println(List2);


    }

}
