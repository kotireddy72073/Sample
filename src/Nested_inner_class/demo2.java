package Nested_inner_class;

class outer{
    class inner{
        public void show(){
            System.out.println("it is nested class method");
        }

    }
}

public class demo2 {
    public static void main(String[] args) {
        outer.inner in = new outer().new inner();
        in.show();

    }
}
