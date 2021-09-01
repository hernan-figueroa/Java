import java.util.Scanner;

public class PalindromeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome: ");
		original= s.next();
		int length=original.length();
		
		for (int i = length-1; i >=0 ; i--) {
			reverse= reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("Entered string/number is a palindrome.");
		}else {
			System.out.println("Entered string/number isn't a palindrome.");
		}
	}

}
