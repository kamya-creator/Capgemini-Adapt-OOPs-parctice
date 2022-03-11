// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
abstract class Instrument
{
    abstract void play();
}
class Guitar extends Instrument
{
    @Override
    void play()
    {
        System.out.println("Guitar");
    }
}
class Flute extends Instrument
{
    @Override
    void play()
    {
        System.out.println("Flute");
    }
}
class Piano extends Instrument
{
    @Override
    void play()
    {
        System.out.println("Pinao");
    }
}
class HelloWorld {
    public static void main(String[] args) {
       System.out.println("Hello, World!"); 
       Scanner scn = new Scanner(System.in);
       int a = scn.nextInt();
       Instrument[] is = new Instrument[10];
       
       if(a== 1)
       {
           for(int i =0;i<10;i++)
           {
               is[i] = new Guitar();
           }
           for(int i =0;i<10;i++)
           {
               is[i].play();
           }
       }
       
        else if(a== 2)
       {
           for(int i =0;i<10;i++)
           {
               is[i] = new Piano();
           }
           for(int i =0;i<10;i++)
           {
               is[i].play();
           }
       }
       
        else if(a== 2)
       {
           for(int i =0;i<10;i++)
           {
               is[i] = new Flute();
           }
           for(int i =0;i<10;i++)
           {
               is[i].play();
           }
       }
    }
}
