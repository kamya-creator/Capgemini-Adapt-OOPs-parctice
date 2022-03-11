// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
abstract class Compartment
{
    abstract void notice();
}
class First extends Compartment
{
    @Override
    void notice()
    {
        System.out.println("First");
    }
}
class Ladies extends Compartment
{
    @Override
    void notice()
    {
        System.out.println("Ladies");
    }
}
class Lag extends Compartment
{
    @Override
    void notice()
    {
        System.out.println("Lag");
    }
}
class HelloWorld {
    public static void main(String[] args) {
       System.out.println("Hello, World!"); 
       Scanner scn = new Scanner(System.in);
       //int a = scn.nextInt();
       Compartment[] c = new Compartment[10];
       
       double i = Math.random()*5;
       int x = (int)i;
       System.out.println(x);
       switch(x)
       {
           case 1 : c[0] = new First();
                    c[0].notice();
                    break;
           case 2 : c[1] = new Ladies();
                    c[1].notice();
                    break;
           case 3 : c[2] = new Lag();
                    c[2].notice();
                    break;
                    
            default : System.out.println("Invalid Choice");
                break;
       }
    }
}
