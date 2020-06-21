/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1q3;
import java.util.Scanner;
/**
 *
 * @author bryan
 */
public class P1q3 {

     public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);

      System.out.print("Enter 8 digit credit card number: ");
      int cardNumber;
      cardNumber = in.nextInt();

      int sum1 = 0;
      int temp1 = cardNumber;

      for (int i = 1; i < 8; i += 2){
         sum1 += temp1 % 10;
         temp1 /= 100;   // move left two digits, base ten
      }

      int sum2 = 0;
      int temp2 = cardNumber / 10;  

      for (int i = 1; i < 8; i += 2) {
         int digit = (temp2 % 10) * 2;   
         sum2 += digit % 10;   
         digit /= 10;
         sum2 += digit % 100;   
         temp2 /= 100;  
      }
 
      int finalSum = sum1 + sum2;

      if (finalSum % 10 == 0)
         System.out.println("The credit card number is valid.");
      else  {
         System.out.println("The credit card number is not valid.");
         System.out.println("The last digit should be " + ((cardNumber - finalSum + 10) % 10));
      }
   }
    
}
