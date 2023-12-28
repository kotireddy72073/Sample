package Nested_inner_class;


    class Outer {
        class inner {
            public void show() {
                System.out.println("it is nested class method");
            }
        }
    }

class demo1
{
    public static void main(String[] args)
    {
        Outer.inner in = new Outer().new inner();
        in.show();
    }
}
