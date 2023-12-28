package Rough_Work;

import java.util.Date;

public class Eample {
    public static void main(String[] args) {
        Date date=new Date();
        product pro=new product(123,"Oil",150,date);

    }
}
class product{
    int product_id;
    String product_name;
    double product_price;
    Date product_expDate;{
        System.out.println("Thank you for chossing the product");
    }
    product(int product_id, String product_name, double product_price, Date product_expDate)
    {
        this.product_id=product_id;
        this.product_name=product_name;
        this.product_price=product_price;
        this.product_expDate=product_expDate;
        System.out.println("");
    }
    {
        System.out.println("");
    }
    void print()
    {
        System.out.println("product_id="+product_id);
        System.out.println("product_name="+product_name);
        System.out.println("product_price="+product_price);
        System.out.println("product_expDate="+product_expDate);
    }
}
