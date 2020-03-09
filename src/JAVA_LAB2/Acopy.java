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
public class Acopy {
    static char a [] ={'H','E','L','L','O'};
    static char b [] ={'W','E','L','C','O','M','E'};
    public static void main(String args[])
    {
        System.out.println("before arraycopy a-->");
        System.out.println(a);
        System.out.println("before arraycopy b-->");
        System.out.println(b);
        System.arraycopy(a, 0, b, 0,a.length);
        System.out.println("after arraycopy a-->");
        System.out.println(a);
        System.out.println("after arraycopy b-->");
        System.out.println(b);
        
    }
    
}
