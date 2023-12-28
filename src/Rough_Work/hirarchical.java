package Rough_Work;

public class hirarchical {
    public static void main(String args[])
    {

    }

}
class college
{
 int cid;
 String cname;
 college(int cid,String cname )
 {
    this.cid=cid;
    this.cname=cname;
 }
 void college_info()
 {
     System.out.println("college info");
     System.out.println("college id="+cid);
     System.out.println("college name="+cname);
 }
}
class bsc_class extends college
{
   String bsc_classroom;
   int sub;
   bsc_class(int cid,String cname, String bsc_classroom, int sub)
   {
       super(cid,cname);
       this.bsc_classroom=bsc_classroom;
       this.sub=sub;
   }
   void bsc_info()
    {
        System.out.println("bsc info");
        System.out.println("bsc classroom="+bsc_classroom);
        System.out.println("sub="+sub);
    }
}
class engineering extends college
{
    String engineering_classroom;
    int sub;
    engineering(int cid,String cname,String engineering_classroom, int sub)
    {
        super(cid, cname);
        this.engineering_classroom=engineering_classroom;
        this.sub=sub;
    }
    void eng_info()
    {
        System.out.println("engineering info");
        System.out.println("engineering classroom="+engineering_classroom);
        System.out.println("engineering sub="+sub);
    }
}