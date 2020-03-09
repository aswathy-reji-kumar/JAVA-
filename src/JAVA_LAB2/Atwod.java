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
public class Atwod {
    public static void main(String args[])
    {
        int twod[][]=new int[3][3];
        int i,j,k=0;
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                twod[i][j]=k;
                k++;
                
            }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
                System.out.println(twod[i][j]+"");
            System.out.println();
        }
    }
    
}
