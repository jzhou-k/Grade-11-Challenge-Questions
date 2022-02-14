/**
*Name: Julia 
*Date: Feb 8
*Description
*/

//final IS CONSTANT 

import java.util.Scanner;

public class ChangingPrices {
   final static double TAX = 0.13;

   public static void main(String [] args) {
      
      //provincial tax of ontario
      final double DON_AMNT = 2.00;
   
      Scanner in = new Scanner(System.in);
      double price= 20;
      String donate;
      
      //camelcase
      System.out.println("How much does a pair of pants cost?");
      price = in.nextDouble();
      
      in.nextLine();
      
      System.out.println("Ok! Would you like to donate to the Salvation Army?");
      donate = in.nextLine();
      
      price += addTax(price);
      
      if (donate.equals("yes")) {
         price += DON_AMNT;
      } else {
         price = price;
      }
      
      System.out.println("You are paying $" + price + ".");
   }
   
   /** commenting for methods
   * description
   * calculates ontario taxes
   * what is in (parameters)
   * @param price the price before taxes
   * what is out (returns)
   * @return the total price after taxes
   */
   public static double addTax(double price) {
      return price * TAX;
   }
}

