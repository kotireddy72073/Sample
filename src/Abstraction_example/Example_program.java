package Abstraction_example;

public class Example_program {
    public static void main(String args[])
    {
        program p=new program(5);
        p.show();
        int a=p.squre_root();
        System.out.println("the squre of X val="+a);
        p.display();
        p.print();

    }
}
abstract class sample
{
    void show()
    {
        System.out.println("this is show methosd of abstract class");
    }
    abstract void print();
    abstract void display();
}
class program extends sample
{
    int X;
    program(int X)
    {
        this.X=X;
    }
    int squre_root()
    {
        return X*X;
    }
    @Override
    void print(){
        X++;
        System.out.println("the implementation of print method");
        System.out.println("incremented method:"+X);
    }
    @Override
    void display(){
        X--;
        System.out.println("the implemantation of display method");
        System.out.println("decrementd value:"+X);
    }


}


