package Rough_Work;


import java.util.Scanner;

public class Bank_application {
}
class BankDetails{
    private String Account_Number;
    private String Account_Holder_Name;
    private String Account_Type;
    private long Balance;
    Scanner sc = new Scanner(System.in);
    public void open_Account()
    {
        System.out.println("Enter Account Number");
        Account_Number = sc.next();
        System.out.println("Enter Account Type");
        Account_Type = sc.next();
        System.out.println("Enter Account Holder Name");
        Account_Holder_Name = sc.next();

    }
}
