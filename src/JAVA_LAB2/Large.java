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

public class Large {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("largest="+ a);
            
        }
        if(b>a)
        {
            System.out.println("largest="+ b);
            
        }
        
                
                
    }
    
}
