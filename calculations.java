package org.calc;
public class Add
{
    private int x,y;
    public Add(int a,int b)
{
    x=a;
    y=b;
}
public int add()
{
    return(x+y);
}
}


package org.calc;
public class Sub
{
    private int x,y;
    public Sub(int a,int b)
{
    x=a;
    y=b;
}
public int sub()
{
    return(x-y);
}
}



package org.calc;
public class Multiply
{
    private int x,y;
    public Multiply(int a,int b)
{
    x=a;
    y=b;
}
public int mul()
{
    return(x*y);
}
}



package org.calc;
public class Divide
{
    private int x,y;
    public Divide(int a,int b)
{
    x=a;
    y=b;
}
public int div()
{
    return(x/y);
}
}



import org.calc.*;
import java.util.*;
public class calculations
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number, a:");
        int a=sc.nextInt();
        System.out.println("Enter a number, b:");
        int b=sc.nextInt();

        Add add=new Add(a,b);
        System.out.println("Addition:a+b="+add.add());

        Sub s=new Sub(a,b);
        System.out.println("Subtraction:a-b="+s.sub());

        Multiply m=new Multiply(a,b);
        System.out.println("Multiply:a*b="+m.mul());

        Divide d=new Divide(a,b);
        System.out.println("Addition:a/b="+d.div());
    }
}
