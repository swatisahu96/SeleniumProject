package Collections.Set.HSvsLHSvsTS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        // HashSet - internally uses hashing to store elements
        // unique elements in Set only
        //HashSet- No order is maintained hence accessing and deletion is fast
        //Allow null elements
        Set<Integer> HS = new HashSet<>();
        HS.add(123456);
        HS.add(12345);
        HS.add(1234);
        HS.add(123);
        HS.add(12);
        HS.add(1);
        //HS.add(null);
        System.out.println(HS);

        //Linked Hashset uses- Hashing + LinkedList
        //Items are Ordered
        // Allows null

        Set<Integer> LHS = new LinkedHashSet<>();
        LHS.add(123456);
        LHS.add(12345);
        LHS.add(1234);
        LHS.add(123);
        LHS.add(12);
        LHS.add(1);
        //HS.add(null);
        System.out.println(LHS);


        //Tressset uses Hashing and Tree
        //Treeset allows Sorting in ascending order
        // Do not allow null because not easy to compare
        Set<Integer> TS = new TreeSet<>();
        TS.add(123456);
        TS.add(12345);
        TS.add(1234);
        TS.add(123);
        TS.add(12);
        TS.add(1);
        //HS.add(null);
        System.out.println(TS);

    }



}
