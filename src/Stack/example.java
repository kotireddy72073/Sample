package Stack;

import java.util.*;

public class example {
    public static void main(String[] args){
        Vector<String> Stac = new Vector<String>(4);
        Stac.add("Tiger");
        Stac.add("Lion");
        Stac.add("Dog");
        Stac.add("Elephant");
        System.out.println("Size is:"+Stac.size());
        System.out.println("Defalt cpacity is:" + Stac.capacity());
        System.out.println("Vector element is:"+Stac);
        Stac.add("Rat");
        Stac.add("Cat");
        Stac.add("Deer");
        System.out.println("Size after additional:"+Stac.size());
        System.out.println("Capacity after addition is:"+Stac.capacity());
        System.out.println("Elements are:"+Stac);
        if (Stac.contains("Tiger"))
        {
            System.out.println("Tiger is present at the index"+Stac.indexOf("Tiger"));
        }
        else
        {
            System.out.println("Tiger is not present in the list");
        }
        System.out.println("The first animal of the vector is="+Stac.firstElement());
        System.out.println("The last animal of the vector is="+Stac.lastElement());
    }
}

