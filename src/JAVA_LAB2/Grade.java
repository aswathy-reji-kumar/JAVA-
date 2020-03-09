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
public class Grade {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the mark");
        int m=sc.nextInt();
        int x;
         x=(m/10);
       switch(x)
       {
           case 10:
           case 9: 
           case 8: System.out.println("dis");
                   break;
           case 7:
           case 6: System.out.println("first cls");
                  break;
           case 5: System.out.println("second cls");
                   break;
           case 4: System.out.println("pass");
                   break;
           default: System.out.println("fail");
                    break;
           
           
           
           
       }
               
               
    }
    
}
