package Arraylist2;

import java.util.*;

class Car implements Comparable<Car> {
    int ModalNo;
    String name;
    int stock;

    Car(int modalNo,String name,int stock)
    {
        this.ModalNo=modalNo;
        this.name=name;
        this.stock=stock;
    }
    public int compareTo(Car car)
    {
       if (stock==car.stock)
           return 1;
       else
           return -1;
    }
}
class GFG
{
    public static void main(String[] args)
    {
        ArrayList<Car>c=new ArrayList<Car>();
        c.add(new Car(2018,"Kia",20));
        c.add(new Car(2020,"MG",13));
        c.add(new Car(2013,"Creta",10));
        c.add(new Car(2015,"BMW",50));
        c.add(new Car(2017,"Audi",45));
        Collections.sort(c);
        for (Car car:c)
        {
            System.out.println(car.ModalNo + "" + car.name + "+car.stock");
        }
    }
}
