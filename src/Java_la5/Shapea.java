/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_la5;

/**
 *
 * @author MCALAB01002
 */
import java.util.*;
public abstract class Shapea {
    int r,h,b;
    abstract void read();
    abstract void volume();
    class Cylinder extends Shapea
   {
       void read()
       {
           Scanner s=new Scanner(System.in);
           int r=s.nextInt();
           int h=s.nextInt();
          }
       void volume()
       {
           double p=3.14;
           double volume = p * r * r * h;
         System.out.println("volume");
         
       }
       
   }  
   class Cube extends Shapea
   {
       void read()
       {
           Scanner s=new Scanner(System.in);
           
           int b=s.nextInt();
           
       }
   
     void volume()
     {
      double volume1=b*b*b;
      System.out.println("volume");
     }
   }
   class Absra
   {
       public static void main(string args[])
       {
           Shapea h= new Cylinder();
                   h.read();
                   h.volume();
                   Shapea h1= new Cube();
                   h1.read();
                   h1.volume();
                   
                           
           
           
           
       }
   }
           
}
