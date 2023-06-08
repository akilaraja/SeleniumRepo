package week3.day1;

import java.util.HashSet;

public class PrintUniqueCharacter {


	 public static void main(String []args){

	    String input = "akila";
	    String output = uniqueString(input);

	    System.out.println(output);
	 }

	 public static String uniqueString(String s){
	     HashSet<Character> uniques = new HashSet<>();
	     uniques.add(s.charAt(0));
	     String out = "";
	     out += s.charAt(0);

	     for(int i =1; i < s.length(); i++){
	         if(!uniques.contains(s.charAt(i))){
	             uniques.add(s.charAt(i));
	             out += s.charAt(i);
	         }
	     }
	     return out;
	 }
	}