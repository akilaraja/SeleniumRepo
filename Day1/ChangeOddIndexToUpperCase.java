package week2.Day1;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
	String testString = "changeme";
			char[] arr = testString.toLowerCase().toCharArray();

    boolean makeUppercase = true;
    for (int i=0; i<arr.length; i++) {
        if(makeUppercase && Character.isLetter(arr[i])) {
            arr[i] = Character.toUpperCase(arr[i]);
            makeUppercase = false;
        } else if (!makeUppercase && Character.isLetter(arr[i])) {
            makeUppercase = true;
        }
    }
    String convertedString = String.valueOf(arr);
    System.out.println(convertedString);
}		
}
