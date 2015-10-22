import java.util.*;

public class Ismorphic {

   public HashMap<Character, Character> builder(String s, String t){
      HashMap<Character, Character> myMap = new HashMap<Character, Character>();
      for(int i = 0; i < s.length(); i ++){
         char letter1 = s.charAt(i);
         char letter2 = t.charAt(i);
         if(!myMap.containsKey(letter1)){
            myMap.put(letter1, letter2);
         }
      }      
      return myMap;
   }
   
   public String convert(String firstString, HashMap<Character, Character> map){
      StringBuilder result = new StringBuilder();
      for(char c : firstString.toCharArray()){
         result.append(map.get(c));
      }
      return result.toString();
   }
   
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first string");
        String firstString = scanner.nextLine();
        System.out.println("Please enter the second string");
        String secondString = scanner.nextLine();
        if(firstString.length() != secondString.length()){
           System.out.println("Two strings are not the same length");
           System.exit(0);
        }
        Ismorphic solver = new Ismorphic();
        HashMap<Character, Character> map = solver.builder(firstString, secondString);
        String result = solver.convert(firstString, map);
        System.out.println(result);
        if(result.equals(secondString)){
           System.out.println("Yes they are Ismorphic");
        } 
        else{
           System.out.println("No, they are not Ismorphic");
        }
        
        
   }

}
