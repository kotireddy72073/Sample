package Interface;

interface emp
{
   void palidrome_method();
   void even_number_addition();
}
public class Interface_example {
    public static void main(String[] args) {
    }
}





class  sample implements emp{


            @Override
            public void palidrome_method()
        {
                int n=121,r,sum=0,i;
                i=n;
                while (n>0){
                    r=n%10;
                    sum=(sum*10)+r;
                    n=n/10;
                }
                if (i==sum){
                    System.out.println("palindrome Number");
                }
                else {
                    System.out.println("Not a palindrome Number");
                }
        }
        @Override
         public void even_number_addition()
        {
         int n=12345,r,sum=0,i;

         while (n>0){
             r=n%10;
             if (r%2==0){
                 sum=sum+r;
             }
             n=n/10;
         }
         System.out.println("sum");
            }
}
class  demo{

    public static void main(String[] args){
        sample ob=new sample();
        ob.even_number_addition();
        ob.palidrome_method();
    }
}
