/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MCALAB01002
 */
import java.util.*;
public class While 
{
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
        System.out.println("the number is divisible by two and number is divisible by five");
        int i=sc.nextInt();
           while(i<=100)
           {
               if(i%2==0)
               {
                   System.out.println("i is divisible by two="+i);
               }
               if(i%5==0)
               {
                   System.out.println("i is divisible by five="+i);
                   i++;
               }
               }
           }

                
                
    }
    

