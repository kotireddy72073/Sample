package Hashset;

// java program to demonstrate
// internal working of HashSet
import java.util.HashSet;

public class example {
    public static void main(String[] args)
    {
        // creating a Hashset
        HashSet hs=new HashSet();
        // adding elements to hashSet
        // ud=sing add() method
        boolean b1=hs.add("geeks");
        boolean b2=hs.add("Geeks for Geeks");
        // adding duplicate elements
        boolean b3=hs.add("Geeks");
        //printing b1,b2,b3
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        System.out.println("b3 = "+b3);
        //printing all elements of hashset
        System.out.println(hs);
    }
}
