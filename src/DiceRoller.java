import java.util.Scanner;
import java.util.Random;

public class DiceRoller {

	public static int generateRandomDieRoll(int i) {
		int max = i;
		int min = 1;
		int range = max - min + 1;
		
		Random random = new Random();
		return random.nextInt(i);
		
		
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		String yn;
		System.out.println("Welcome to the Grand Circus Casino!");
		
		while (true) {
		
		System.out.println();
		System.out.print("How many sides should each die have? ");
		
		int i1 = scnr.nextInt();
		
		System.out.println();
		System.out.println("Roll 1:");
		
		System.out.println(generateRandomDieRoll(i1));
		System.out.println(generateRandomDieRoll(i1));
		
		while(true) {
			
			System.out.println();	
			System.out.print("Continue? (Y/N): ");
			yn = scnr.next();
			
				if (yn.equalsIgnoreCase("Y") || yn.equalsIgnoreCase("N")) {
					break;
				} else {
					System.out.println();
					System.out.println("Enter Y or N this time.");
				}
			}
			
			if (yn.equalsIgnoreCase("N")) {
				System.out.println();
				System.out.println("Bye!");
				scnr.close();
				break;
	}
	}
}
}
