import java.util.Scanner;

public class Week1CapstonePigLatin {

	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		
		String userWord = "";
		String wordPigLatin = "";
		String userDecision = "";
		
		do {  
			//do while loop to ask user to continue
			
			System.out.println("Welcome to Latin for Pigs! Please enter a word, and I will translate your word into Pig Latin.");
			userWord = scnr.nextLine();
			userWord = userWord.toLowerCase();
			int i = 0;
			char letterToCheck = userWord.charAt(i);
			
				//if vowel is recognized first, Pig Latin = original string + "way"
				if ( letterToCheck == 'a' || letterToCheck == 'e' || letterToCheck == 'i' || letterToCheck == 'o' || letterToCheck == 'u' ) {
					
					wordPigLatin = userWord.substring(0,1).toUpperCase() + userWord.substring(1) + "way";  
				}
						//else if consonant is recognized
				else {
					int j = userWord.length();
					
					for (i = 0; i <= j; i++) {	
						//keep checking until a vowel is recognized
						letterToCheck = userWord.charAt(i);
						
						if ( letterToCheck == 'a' || letterToCheck == 'e' || letterToCheck == 'i' || letterToCheck == 'o' || letterToCheck == 'u' ) {
							break;
						}
						else 
							userWord += letterToCheck;	//add the consonants to the end of the same string
					} wordPigLatin = userWord.substring(i,i+1).toUpperCase() + userWord.substring(i+1) + "ay";
				}
						
			System.out.println("Your word in Pig Latin is " + wordPigLatin + ". Say it with me...");
			
			System.out.println("Would you like to try another word? (y/n)");
			userDecision = scnr.nextLine();
			
			} while ( userDecision.startsWith("y") );
			
			System.out.println("OK. Eesay ouyay aterlay.");
			scnr.close();
			
	}
}
