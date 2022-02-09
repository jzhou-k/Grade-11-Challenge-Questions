/*
* Julia Zhou
* Feb 09
* This program will ask for two grocery items and their price, 
  then print them out in a formatted way
*/

import java.util.*;


public class Zhou_Julia_GroceryItem {

   public static void main (String[] args){
      
      Scanner sc  = new Scanner(System.in);
      
      final int INPUT_NUM = 2; //how many entries user is supposed to enter 
      String[] groceryItem = new String[INPUT_NUM]; 
      double[] groceryPrice = new double[INPUT_NUM];
      
      System.out.println("Enter 2 grocery items and their price");
      //for loop to take in entries of grocery items and their price  
      for (int i = 0; i<INPUT_NUM; i++){
         System.out.print("Item name: ");
         groceryItem[i] = sc.nextLine();
         System.out.print("Item price: ");
         groceryPrice[i] = sc.nextDouble();
         sc.nextLine();
      
      }
      
      //printing and formatting to 19 character cuz kevin is being extra  
      System.out.println("--------------------------");
    
      //this for loop prints out all the entries 
      for (int i = 0; i<INPUT_NUM; i++){
         
         String formattedItem = String.format("%-20s", groceryItem[i]);
         System.out.printf(formattedItem + "%5s\n", "$"+ Double.toString(groceryPrice[i]));
                  
      }
      
      System.out.println("--------------------------");
      
      
   
   
   }


}