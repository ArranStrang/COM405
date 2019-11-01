/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author 4straa54
 */
public class Week2 {

    
    public static void main(String[] args) { 
      int i = 1;
      while (i <= 10) {
        System.out.println(i);
        i++;
}

      int j = 2;
      while (j <= 20) {
        System.out.println(j);
        j+=2;
}
      int h = 5;
      while( h <= 15 ) {
      System.out.println(h);
      h++; 
    }
      int count = 10;
      while( count >= 0 ) {
        System.out.println(count);
        count--; 
}
      int state = 1;
      
      
      
      
      while(state == 1){
      Scanner input1 = new Scanner(System.in);
      System.out.println( "Please enter the letter which corresponds with your choice:\n" +
			"a – Calculate the area of a rectangle \n" +
			"b – Display a multiplication table \n" +
			"c – Add two numbers\n" +
                        "x - Exit program\n");
      String value = input1.nextLine();
      
      if ("a".equals(value)) {
        Scanner input2 = new Scanner(System.in);
        System.out.println( "Please enter the width: ");
        int width = input2.nextInt();
        
        Scanner input3 = new Scanner(System.in);
        System.out.println( "Please enter the height: ");
        int height = input3.nextInt();
        
        int area = height * width;
        System.out.println( "The area of the retangle is: " + area);   
      }
      
      
      
      
      else if ("b".equals(value)) {
          int a;
          int b;
          int sum;
          for (a = 1; a <= 12; ++a) {
            for (b = 1; b <= 12; ++b) {
                sum = a * b;
                System.out.print(sum);
            if(sum < 10){
                System.out.print("    ");
        }else if(sum >= 100){
            System.out.print("  ");
        }else if(sum >= 10){
            System.out.print("   ");
            }

        }
        System.out.println();
    }
}
      
      
     else if ("c".equals(value)) {
        Scanner input3 = new Scanner(System.in);
        System.out.println( "Please enter the first number: ");
        int no1 = input3.nextInt();
        
        Scanner input4 = new Scanner(System.in);
        System.out.println( "Please enter the second number: ");
        int no2 = input4.nextInt();
        
        int answer = no1 + no2;
        System.out.println( "The area of the answer is: " + answer);
    
    }
     else if ("x".equals(value)) {
          state = 0;
          
      }
}  
   } 
}





   

         
      



