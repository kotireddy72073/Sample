package Rough_Work;

public class exp2 {
    public static void main(String args[])
    {
        cube obj=new cube();
    }
}
class shape
{
    shape()
    {
        System.out.println("this is shape constructor");
    }
}
class rectangle extends shape
{
    rectangle()
    {
        System.out.println("this is rectangle constructor ");
    }
}
class cube extends rectangle
{
    cube()
    {
        System.out.println("this is cube constructor");
    }
}