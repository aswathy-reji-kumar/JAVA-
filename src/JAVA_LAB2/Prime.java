/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_LAB2;

/**
 *
 * @author MCALAB01002
 */
import java.util.*;
public class Prime {
    public static void main(String args[])
    {
        int i;
        int n;
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
         i=s.nextInt();
         do
         {
             if(n%i==0)
                 count ++;
        
         }while(i<=n);
    
     if(count==2)
     {
         System.out.println("number is prime");
     }
     else
     System.out.println("not prime");
     
     }
     
    
    
}
