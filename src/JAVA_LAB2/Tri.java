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
public class Tri {
    public static void main(String args[])
    {
        int i,j,n;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the limit");
        n=s.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
                
            }
            System.out.println("");
            
        }
        
                
        
                
    }
    
    
}
