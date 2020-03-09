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
public class Primenum {
    public static void main(String args[])
    {
        int n,i=1,p=0;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        while(i<n)
        {
            if(n%i==0)
            {
                p++;
                
            }
             i++;
        
    }
        if(p==2)
     {
         System.out.println("not prime");
         
     }
       else
     {
        System.out.println(" prime number"); 
     }
    }
}
    

