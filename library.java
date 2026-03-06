// Library
import java.util.*;

 class Main
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    String s , s1;
    int days;
    double amt;
    System.out.println("enter name of the book ");
    s = sc.nextLine();
    System.out.println("enter author's name ");
    s1 = sc.nextLine();
    System.out.println("enter number of days ");
    days = sc.nextInt();
    System.out.println("enter total sale amount of the book");
    amt = sc.nextDouble();
    Compute ob = new Compute(s , s1 , amt , days);
    ob.fine();
    ob.display();
}
}
class Library
{
    String name  , author ;
    double p;
    Library(String n , String a , double p1)
    {
        name = n;
        author = a;
        p = p1;
    }
    void show()
    {
        System.out.println("Name of the book = " + name);
        System.out.println(" name of the author  = " + author);
        System.out.println(" price = " + p);
    }
}
class Compute extends Library
{
    int d;
    double f;
    Compute(String n1 , String n2 , double p2 , int d1 )
    {
        super(n1 , n2 , p2);
        d = d1;
        f = 0.0;
    }
    void fine()
    {
        if( d<=7)
        f = 0.0;
        else
        {
            if(d>=1 && d<=5)
            f = 2.0 * d;
            else if(d>=6 && d<=10)
            f = 3.0 *d;
            else if(d>10)
            f = 5.0 * d;
        }
        }
    void display()
{
    show();
    double totamt = (2.0/100.0 * p)*d + f;
    System.out.println(" total amount to pay = " + totamt);
}
}
 























