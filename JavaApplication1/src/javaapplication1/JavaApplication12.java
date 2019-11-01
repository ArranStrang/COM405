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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Hello, world!");
    String name = "Arran";
    int age = 18;
    System.out.println("My name is " + name + "and I am " + age + " years old");
    System.out.println (" _______\n" +
                        "| o  o  |\n" +
                        "| ----- | < Hello! " + name + "\n" +
                        " ------- \n");
    
    
    System.out.println("You are " + age + " years old");
    
  
    
    boolean isBirthday = true;
    if (isBirthday) {
        age = age + 1;
        System.out.println("Yay! It's your birthday! You are now " + age );
    }
    if (age >= 18) {
        System.out.println("That means you are old enough to drink ");
    }
    if (age >= 20 && age < 40) {
        System.out.println("You are in the 20s and 30s club");
    }
    
    
    
    int speed = 25;
    int speedLimit = 25;
    int speedO = speed - speedLimit;
    if (speed > speedLimit) {
        System.out.println("You’re speed is "+ speed + ", the speed\n" +
        "limit is "+ speedLimit + ". You’re Speeding! Ticket for you");
    }
    else{
        System.out.println("Please continue to drive safely");
    }
    
    if (speedO > 10) {
        System.out.println("You’re speed is "+ speed + "mph, the speed\n" +
        "limit is "+ speedLimit + "mph. You exceeded the speed limit by " + speedO + 
        "mph. You’re Speeding! Ticket for you");
    }
    if (speedO < 10 && speedO < 0) {
        System.out.println("You’re speed is "+ speed + "mph, the speed\n" +
        "limit is "+ speedLimit + "mph. Ticket for you");
    }
    else {
         System.out.println("Please continue to drive safely");
    }
    
    System.out.println("Welcome to the bus fee calculator");
    if (age < 3) {
        System.out.println("You can travel for free as you are younger than 3");
    }
    if (age >= 65) {
        System.out.println("You can travel for free as you are 65 or older");
    }
    if (age <= 19 && age > 3) {
        System.out.println("Your bus ticket will cost £2.00 as you are a student aged 19 or younger");
    }
    else {
        System.out.println("Your bus ticket will cost £4.00"); 
    }
 
   System.out.println("Welcome to the delivery charge calculator");
   
   
   Scanner input = new Scanner(System.in);  
   System.out.println("Enter how far in miles the carrier will have to travel to deliver the package ");
   int miles = input.nextInt(); 
   int cost = 0;
   
   if (miles < 10) {
       System.out.println("Your delivery is free"); 
   }
   if (miles > 10 && miles < 20) {
       cost = cost + 10;
       System.out.println("Your delivery charge is £" + cost); 
   }
   if (miles > 20 && miles < 30) {
       cost = cost + 15;
       System.out.println("Your delivery charge is £" + cost); 
   }
    if (miles >= 30) {
       cost = cost + 20;
       System.out.println("Your delivery charge is £" + cost); 
   }
    
    
    
   
    System.out.println("Welcome to the second delivery charge calculator");
   
   Scanner input2 = new Scanner(System.in);  
   System.out.println("Enter how far in miles the carrier will have to travel to deliver the package ");
   int miles2 = input2.nextInt();  
   double cost2 = 0.00;
   
   if (miles2 < 10) {
       System.out.println("Your delivery is free"); 
   }
   if (miles2 > 10 && miles2 < 20) {
       cost2 = cost2 + 10;
       System.out.println("Your delivery charge is £" + cost2); 
   }
   if (miles2 > 20 && miles2 < 30) {
       cost2 = cost2 + 15;
       System.out.println("Your delivery charge is £" + cost2); 
   }
    if (miles2 >= 30) {
       cost2 = cost2 + 15;
       double diff = miles2 - 30;
       diff = diff / 2;
       cost2 = cost2 + diff;
       System.out.println("Your delivery charge is £" + cost2); 
   }
   
   System.out.println("Welcome to the third delivery charge calculator");
   
   Scanner input3 = new Scanner(System.in);  
   System.out.println("Enter how far in miles the carrier will have to travel to deliver the package ");
   int miles3 = input3.nextInt();  
   
   Scanner input4 = new Scanner(System.in);  
   System.out.println("Enter the value of the goods ");
   int value = input4.nextInt();  
   
   
   double cost3 = 0.00;
   if (miles3 < 10 && value > 100) {
       System.out.println("Your delivery is free"); 
   }
   if (miles3 < 10 && value > 100 ) {
       cost3 = cost3 + 5;
       System.out.println("Your delivery is £" + cost3 ); 
   }
   if (miles3 > 10 && miles3 < 20) {
       cost2 = cost3 + 10;
       System.out.println("Your delivery charge is £" + cost3); 
   }
   if (miles3 > 20 && miles3 < 30) {
       cost3 = cost3 + 15;
       System.out.println("Your delivery charge is £" + cost3); 
   }
    if (miles3 >= 30) {
       cost3 = cost3 + 15;
       double diff2 = miles3 - 30;
       diff2 = diff2 / 2;
       cost3 = cost3 + diff2;
       System.out.println("Your delivery charge is £" + cost3); 
   }
    
    
    
    
    
   }   
    

 