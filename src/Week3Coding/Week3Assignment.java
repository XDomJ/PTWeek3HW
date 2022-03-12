package Week3Coding;

import java.util.concurrent.ThreadLocalRandom;
public class Week3Assignment {
	
	public static String wordSalad(String word, int n) {
		String combo = "";
		for (int j = 0; j < n; j++) {
			combo += word;
		}
		return combo;
	}
	public static String firstAndLast(String first, String last) {
		String fullName = first + " " + last;
		return fullName;
	}
	
	public static Boolean overHundred(int[] arr) {
		int total = 0;
		for (int j = 0; j < arr.length; j++) {
			total += arr[j]; 
		}
		if (total > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double averageOf (double[] dbl) {
		double average = 0, subTotal = 0;
		for (int j = 0; j < dbl.length; j++) {
			subTotal += dbl[j];
		}
		average = subTotal / dbl.length;
		return average;
	}
	
	public static Boolean bigAverage (double[] dbl, double[] tbl) {
		double aver1 = 0, aver2 = 0, sub1 = 0, sub2 = 0;
		for (int j = 0; j < dbl.length; j++) {
			sub1 += dbl[j];
		}
		for (int j = 0; j < tbl.length; j++) {
			sub2 += tbl[j];
		}
		aver1 = sub1 / dbl.length;
		aver2 = sub2 / tbl.length;
		if (aver1 > aver2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean willBuyDrink (Boolean isHot, double moneyInPocket) {
		if (isHot == true && moneyInPocket > 10.5) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean hitDC (int dc, int mod) {
		int roll = ThreadLocalRandom.current().nextInt(1, 20+1);
		System.out.println("You rolled a " + roll);
		if (roll + mod >= dc) {
			System.out.println("You succeeded!");
			return true;
		} else {
			System.out.println("You failed.");
			return false;
		}// this Method creates a random number between 1 and 20, prints it,
		// and then checks to see if the number plus it's modifier
	}	// are higher than or equal to it's difficulty check. 
		// Then it prints your result and returns true or false.
	
		public static void main (String[]args) {
					
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			int result = 0, subResult = 0, average = 0; 
			
			result = ages[(ages.length - 1)] - ages[0];
			System.out.println(result);
			
			for (int j = 0; j < ages.length; j++) {
				subResult += ages[j];
			}
			average = subResult / ages.length;
			System.out.println("The average age is " + average); 
			
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			int subResultName = 0, averageName = 0;
			
			for (int j = 0; j < names.length; j++) {
				subResultName += names[j].length();
			}
			averageName = subResultName / names.length;
			System.out.println("The average number of letters is " + averageName);
			
			String boomTown = "";
			for (int j = 0; j < names.length; j++) {
				boomTown += (names[j] + " ");
			}
			System.out.println(boomTown);
			
			int[] nameLengths = new int[names.length];
			
			for (int j = 0; j < nameLengths.length; j++) {
				nameLengths[j] = names[j].length();
			}
			int nameSums = 0;
			for (int j = 0; j < nameLengths.length; j++) {
				nameSums += nameLengths[j];
			}
			System.out.println("The sum of the length of the names is: " + nameSums);
		}
		
	
	
	
}