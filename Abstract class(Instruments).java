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



Second Method
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
       
       is[0] = new Piano();
       is[1] = new Guitar();
       is[2] = new Flute();
       is[3] = new Piano();
       is[4] = new Guitar();
       is[5] = new Flute();
       is[6] = new Piano();
       is[7] = new Guitar();
       is[8] = new Flute();
       is[9] = new Flute();
       
       for(int i =0;i<is.length;i++)
       {
           if(is[i] instanceof  Piano)
           {
               System.out.println("Yes it's Piano");
               is[i].play();
           }           
           if(is[i] instanceof Guitar)
           {
               System.out.println("Yes it's Guitar");
               is[i].play();
           }           
           if(is[i] instanceof Flute)
           {
               System.out.println("Yes it's Flute");
               is[i].play();
           }
       }
    }
}
