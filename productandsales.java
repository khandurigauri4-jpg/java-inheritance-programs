// product and sales
import java.util.*;

 class Main
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    String s;
    int prodcode , days;
    double amt;
    System.out.println("enter name of the product ");
    s = sc.nextLine();
    System.out.println("enter product code ");
    prodcode = sc.nextInt();
    System.out.println("enter number of days ");
    days = sc.nextInt();
    System.out.println("enter total sale amount of the product");
    amt = sc.nextDouble();
    Sales ob = new Sales(s , prodcode , amt , days);
    ob.compute();
    ob.show();
}
}
class Product
{
    String name ;
    int code;
    double amount;
    Product(String n , int c , double p)
    {
        name = n;
        code = c;
        amount = p;
    }
    void show()
    {
        System.out.println("Name of the product = " + name);
        System.out.println("product code = " + code);
        System.out.println("total sale amount of the product = " + amount);
    }
}
class Sales extends Product
{
    int Days;
    double tax , totamt;
    Sales(String n1 , int c1 , double a , int D )
    {
        super(n1 , c1 , a);
        Days = D;
        totamt = 0.0;
    }
    void compute()
    {
        tax = (12.4/100.0) * amount;
        double f;
        if(Days > 30)
        f = (2.5 / 100.0) * amount;
        else
        f = 0.0;
        totamt = amount + tax + f;
    }
    void show()
{
    super.show();
    System.out.println(" total amount to pay = " + totamt);
}
}
 























