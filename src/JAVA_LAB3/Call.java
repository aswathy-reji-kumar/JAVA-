/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_LAB3;

/**
 *
 * @author MCALAB01002
 */
import java.util.*;
public class Call {
    void add (int a,int b)
    {
        int sum;
        sum=a+b;
        System.out.println("sum is ="+sum);
    }
   public static void main(String args[])
   {
       int a,b;
       Scanner s=new Scanner(System.in);
       System.out.println("enter any two number");
       a=s.nextInt();
       b=s.nextInt();
       Call C= new Call();
       C.add(a,b);
   }
}
