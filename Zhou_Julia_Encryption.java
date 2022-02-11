//description 

import java.util.*;

public class Zhou_Julia_Encryption {
   
   public static void main(String[] args){
   // first and last characters of EACH WORD are exchanged 
   
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      char charFirst, charLast;
      int count = 0;
   
      // separate the words by space (store in array)
      String[] words = line.split(" ");
   
      // create a for loop, for each word in array, perform the functions
      for (String word: words){
         //in case when 1 characters are entered
         if(word.length() > 1){
            charFirst = word.charAt(0);
            charLast = word.charAt(word.length()-1);
         
            //instead of replacing a string (strings are immutable), build a new one dumbass 
            String newWord =   charLast + word.substring(1,word.length()-1) + charFirst;
            words[count] = newWord;
         }
      
         System.out.println(words[count]);
         count++;
      }
   
   
   
      System.out.println(line);
   
   
   }


}