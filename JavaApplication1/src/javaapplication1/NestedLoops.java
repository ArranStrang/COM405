/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*; 

/**
 *
 * @author 4straa54
 */
public class NestedLoops {
public static void printStars(int n) 
    { 
        int i, j; 
  
        // outer loop to handle number of rows 
        //  n in this case 
        for(i=0; i<n; i++) 
        { 
  
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop     
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
  
            // ending line after each row 
            System.out.println(); 
        } 
   }
    public static void main(String args[]) 
    { 
        int n = 8; 
        printStars(n); 
    } 
} 