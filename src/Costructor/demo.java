package Costructor;

public class demo {
    public static void main(String [] args)
    {
        employee_demo obj=new employee_demo();
        double sal=obj.sal_cal();
        System.out.println("sal="+sal);

    }
}

class employee_demo
{
    double emp_sal;
    int rate_card;
    employee_demo()
    {
        emp_sal=30000.56;
        rate_card=4;
        System.out.println("this is my employee constuctor");
    }
    double sal_cal()
    {
        if(rate_card>4)
            emp_sal=emp_sal+(emp_sal*.3);
        else if (rate_card>3)
            emp_sal=emp_sal+(emp_sal*.2);
        else if (rate_card>2)
            emp_sal=emp_sal+(emp_sal*.1);
        else
            System.out.println("not incremented your sal");

        return emp_sal;
    }

}
