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
public class Passbyvalue {
  
    int x,y;
    void interchange(int x,int y)
    {
        int t=x;
        x=y;
        y=t;
        System.out.println("after swapping value of x="+x);
        System.out.println("after swapping value of y="+y);
    }
    public static void main(String args[])
    {int x,y;
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of x");
    x=sc.nextInt();
     System.out.println("enter the value of y");
    y=sc.nextInt();
    Passbyvalue D=new Passbyvalue();
    D.interchange(x,y);
    }

   
}


    

