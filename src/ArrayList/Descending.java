package ArrayList;

import java.util.*;

public class Descending
{
    public static void main(String[] args)
    {
        //Define an arraylist classes
        ArrayList<Integer> list=new ArrayList<Integer>();

        list.add(450);
        list.add(250);
        list.add(350);
        list.add(1820);
        list.add(3890);
        list.add(7812);

        //printing the unsopprted Arraylist
        System.out.println("Before sorting:"+list);
        //Sorting ArrayList in ascending order
        Collections.sort(list,Collections.reverseOrder());
        //Printing the sorted Array list
        System.out.println("After sorting:"+list);

    }
}
