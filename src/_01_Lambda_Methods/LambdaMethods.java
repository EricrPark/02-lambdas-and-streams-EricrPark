package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
		//i looked at it
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed int String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for(int i = s.length()-1; i >= 0; i--) {
				System.out.print("" + s.charAt(i));
			}
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			System.out.println("");
			String r = s.toUpperCase();
			String str = "";
			for (int i = 0; i < s.length(); i++) {
				if(i % 2 == 0) {
					str += s.charAt(i);
				}
				else {
					str += r.charAt(i);
				}
			}
			System.out.println(str);
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i));
				System.out.print(".");
			}
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			System.out.println("");
			for (int i = 0; i < s.length(); i++) {
				if(i != 1 && i != 3 && i != 4) {
					System.out.print(s.charAt(i));
				}
			}
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
