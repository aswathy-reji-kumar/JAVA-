/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_la5;

/**
 *
 * @author MCALAB01002
 */import java.util.*;
abstract class Aaa {
    abstract void welcome();
    void cmtoo()
    {
        System.out.println("this is concrete method");
        
    }
    
    
}
 class Bbb extends Aaa
{
    void welcome()
    {
        System.out.println("Baa is implementation of welcome");
        
    }
}
class Absta
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        
        Aaa b=new Bbb();
        b.welcome();
        b.cmtoo();
    } 
                
        
    
}