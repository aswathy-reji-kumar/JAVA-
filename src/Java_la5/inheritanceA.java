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
interface A {
    
        int x=10;
        void add();
    
        
    
   interface B
            {
               int x=20;
               void multiplay();
            }




   class Mult implements A,B
   {
      public void add()
       {
           int z;
           z = A.x + B.x;
           System.out.println(z);
           
                   
       }
      public void multiplay()
       {
        
           int z1=A.x * B.x;
           System.out.println(z1);
       }
   }
   public static void main(String args[])
   {
     Mult m =new Mult();
     m.add();
     m.multiplay();

}  
    
}
