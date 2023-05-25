package week2.Day1;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String args[])
	  {
	    System.out.println("Input String");
	    String input="We learn java basics as part of java sessions in java week1";
	    System.out.println(input);
	    countWords(input);
	    // a(1);
	  }
	 
	  // static void a(Int id)
	  static void countWords(String st)
	  {
	    // split text to array of words
	    String[] words = st.split("\\s");
	 
	    // clean duplicates
	    for (int i = 0; i < words.length; i++)
	    {
	      for (int j = 0; j < words.length; j++)
	      {
	        if (words[i].equals(words[j]))
	        {
	          if (i != j)
	            words[i] = "";
	 
	        }
	      }
	    }
	 
	    // show the output
	 
	    System.out.println("Removing Duplicate words:\n");
	    for (int i = 0; i < words.length; i++)
	    {
	 
	      if (words[i] != "")
	      {
	        System.out.print(words[i]+" ");
	 
	      }
	    }
	  }
	}