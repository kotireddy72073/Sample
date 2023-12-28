package Collections;

 import java.util.*;

public class GFG {

    //Main driver method
    public static void main(String[] args)
    {
        //Define an arraylist classes
        ArrayList<String>list=new ArrayList<String>();

        list.add("India");
        list.add("Pakistan");
        list.add("Srilanka");
        list.add("Australia");
        list.add("USA");
        list.add("Japan");

        //printing the unsopprted Arraylist
        System.out.println("Before sorting:"+list);
        //Sorting ArrayList in ascending order
        Collections.sort(list);
        //Printing the sorted Array list
        System.out.println("After sorting:"+list);

           }

}
