/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej3;

import java.util.Scanner;

/**
 *
 * @author V1C70R MU3N735
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in); 
        
      
       System.out.println("Ingrese Valor X");
       int x=entrada.nextInt();
       System.out.println("Ingrese Valor Y");
       int y=entrada.nextInt();
        if (x<=0 ||y<=0 || x>255||y>255 )
        {
            System.out.println("La función es: -1");
        }
        else
        {
             int[] f1=new int[y];
             f1[0]=x;
             int n1;
            
            for (int i = 1;i<f1.length; i++) 
            {
               n1=x/(i+1);
               f1[i]=n1;           
            }
            for (int i = 0; i < f1.length; i++) 
            { 
              if(i==(y-1))
                {
                    System.out.println("La función es: "+f1[i]);
                   
                }  
            }
        }
    }
    }
    

