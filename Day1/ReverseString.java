package week2.Day1;

public class ReverseString {
	public static void main(String[] args) {
		String data= "Amazon";
		char[] charArray =data.toCharArray();
		for (int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
			
		}
	}

}
