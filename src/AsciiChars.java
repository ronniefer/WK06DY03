import java.util.Random;
import java.util.Scanner;

public class AsciiChars {
	
	static String continueSurvey;
	static String petName;
	static int petAge;
	static int luckyNumber;
	static boolean faveQB = false;
	static int jerseyNumber;
	static int modelYear;
	static String actorFirstName;
	// static int randomNumber;
	static String goAgain;
	
    public static void printNumbers()
    {
    	for (int i = 48; i <= 57 ; ++i) {
    		System.out.print((char)i + " ");
    	}
    	System.out.print("\n");
    }

    public static void printUpperCaseLetters()
    {
    	for (int i = 65; i <= 90 ; ++i) {
    		System.out.print((char)i + " ");   		
    	}
    	System.out.print("\n");
    }

    public static void printLowerCaseLetters()
    {
    	for (int i = 97; i <= 122 ; ++i) {
    		System.out.print((char)i + " ");  		
    	}
    	System.out.print("\n");
    }
    
    public static void generateLotteryNumbers()
    {
    	Random rand = new Random();
    	
    	int maxRegularBall = 65;
    	int maxMagicBall = 75;
    	int randomNum1 = rand.nextInt(10) + 1;
    	// int randomNum2 = rand.nextInt(10) + 1;
    	int magicBall;
    	int regularBall1;
    	int regularBall2;
    	int regularBall3;
    	int regularBall4;
    	int regularBall5;
    	
    	System.out.println(randomNum1);
    	
    	if (faveQB) {
    		magicBall = jerseyNumber * randomNum1;
    	} else {
    		magicBall = luckyNumber * randomNum1;
    	}
    	
    	if (magicBall > maxMagicBall) {
    		magicBall = magicBall - maxMagicBall;
    	}
    	
    	regularBall1 = petName.charAt(2); //Third letter
    	regularBall2 = modelYear + luckyNumber;
    	regularBall3 = actorFirstName.charAt(0);
    	regularBall4 = 42;
    	regularBall5 = petAge + modelYear;
    	
    	if (regularBall1 > maxRegularBall) regularBall1 = regularBall1 - maxRegularBall;
    	if (regularBall2 > maxRegularBall) regularBall2 = regularBall2 - maxRegularBall;
    	if (regularBall3 > maxRegularBall) regularBall3 = regularBall3 - maxRegularBall;
    	if (regularBall4 > maxRegularBall) regularBall4 = regularBall4 - maxRegularBall;
    	if (regularBall5 > maxRegularBall) regularBall5 = regularBall5 - maxRegularBall;
    	
    	System.out.printf("Lottery Numbers: %s %s %s %s %s", 
    			regularBall1, regularBall2, regularBall3, regularBall4, regularBall5);
    	System.out.printf(" Magic Ball: %s \n", magicBall);
    }
    
    public static void askQuestions()
    {
    	Scanner userInput = new Scanner(System.in);
    	System.out.print("Please enter your name: ");
    	String userName = userInput.next();
    	System.out.printf("Hello %s!\n", userName);

    	System.out.print("Would you like to continue with the interactive portion? ");
    	continueSurvey = userInput.next();
    	if (!continueSurvey.equalsIgnoreCase("yes") && !continueSurvey.equalsIgnoreCase("y")) {
    		System.out.println("Please return later to complete the survey.");
    		System.exit(0);
    	} else {
    		do {	
        		System.out.print("What is the name of your favorite pet? ");   				
        		petName = userInput.next();
        		System.out.print("What is the age of your favorite pet? ");   				
        		petAge = userInput.nextInt();
        		System.out.print("What is your lucky number? ");   				
        		luckyNumber = userInput.nextInt();
        		System.out.print("Do you have a favorite quarterback? ");   				
        		String answer = userInput.next();
        		
        		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
        			faveQB = true;
            		System.out.print("What is his jersey number? ");   				
            		jerseyNumber = userInput.nextInt();
        		}
        		
        		System.out.print("What is the two-digit model year of your car? ");   				
        		modelYear = userInput.nextInt();
        		System.out.print("What is the first name of your favorite actor/actress? ");   				
        		actorFirstName = userInput.next();
        		// System.out.print("Enter a random number between 1 and 50: ");   				
        		// randomNumber = userInput.nextInt();
        		
        		AsciiChars.generateLotteryNumbers();
        		
        		System.out.print("Would you like to go again? ");   				
        		goAgain = userInput.next();
        		
        		
        	} while (goAgain.equalsIgnoreCase("yes") || goAgain.equalsIgnoreCase("y"));

    	}

    	
    }

    public static void main(String[] args){

    	   	
    	System.out.println("Valid input values: ");
    	
    	AsciiChars.printNumbers();
    	AsciiChars.printUpperCaseLetters();
    	AsciiChars.printLowerCaseLetters();
    	AsciiChars.askQuestions();
    	
    	
		
    }
    
}
