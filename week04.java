package codingProjects;

import java.util.Arrays;

public class week04 {

	public static void main(String[] args) {

		String newString = repeatWord("hello", 5);
		System.out.println("The answer to question 7 is " + newString + ".");
		
		String firstName = "Joanne";
		String lastName = "Ter Louw";
		String twoNames = (twoNames(firstName, lastName));
		System.out.println("The answer to question 8 is " + twoNames + ".");
		
		int[] numbers = new int[] {1,2,3,4,5};
		boolean addition = addition(numbers);
		System.out.println("The answer to question 9 is " + addition + ".");
		
		double[] numbers2 = new double[] {1,2,3,4};
		double average2 = (average2(numbers2));
		System.out.println("The answer to question 10 is " + average2 + ".");
		
		double[] nums1 = new double[] {5.1,2.4,6.8};
		double[] nums2 = new double[] {6.2,4.7,3.8,5.6};
		boolean average3 = (average3(nums1, nums2));
		System.out.println("The answer to question 11 is " + average3 + ",");
		
		boolean isHotOutside = true;
		double moneyInPocket = 10.5;
		boolean willBuyDrink = (willBuyDrink(isHotOutside, moneyInPocket));
		System.out.println("The answer to question 12 is " + willBuyDrink + ",");
		
		double wokeUp = 4.00;
		double beenAwake = 3.00;
		double bedTime = bedTime(wokeUp, beenAwake);
		System.out.println("Question 13: Lily must go to bed at " + bedTime);
		
		//1. Initialize array
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//1A. Subtract value of first element from last element. Print to console.
		
		int first = ages[0];
		int last = ages[ages.length - 1];
		System.out.println("Last element minus first element : " + (last - first));
		
		//1B. Create new array with 9 elements. 
		
		int[] ages2 = Arrays.copyOf(ages,  ages.length + 1);
		ages2[ages.length] = 15;
		
		for(int i = 0; i < ages.length; i++) {
			ages2[i] = ages[i];
		}
			for(int j = 0; j < ages2.length; j++) {
				System.out.print(ages2[j] + " ");	
		}
		System.out.println(" ");
		int first2 = ages2[0];
		int last2 = ages2[ages2.length -1];
		//System.out.println("Last element minus first element : " + (last2 - first2));
			
		//1C. Average Age
		int sum = 0;
		int length = ages2.length;
		
		for(int k = 0; k < ages2.length; k++) {
			sum += ages2[k];
		}
		double average = sum / length;
		System.out.println("Average of ages2 : " + average);
		
	
		//2. Create array of string. Use loop to calculate average number of letters per name
	
		String[] names = {"Sam","Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//2A. Use loop to calculate average number of letters per name
		double namesAverage = 0.0;
		
		for(int i = 0; i < names.length; i++) {
			namesAverage += names[i].length();
		}
			System.out.println("Average length of the names : " + (namesAverage / names.length));
		
		//2B. Concatenate names together, separated by spaces, print to console.
		
		String concat = "";
			for(int j = 0; j < names.length; j++) {
			concat += (names[j] + " ");
		}
			System.out.println(concat);
		//3. Access last element of array.
			String firstElement = names[0];
			
		//4. Access first element of array.
			String lastElement = names[names.length-1];
	
		//System.out.println(lastElement);
			
		//5. New array called nameLengths. iterate over names array and add name length to the nameLengths array.
			int[] nameLengths = new int[names.length];
			
			for(int k = 0; k < names.length; k++) {
				nameLengths[k] = names[k].length();
			}
		//	System.out.println(Arrays.toString(nameLengths));
			
		//6. loop over nameLengths array and calculate sum of all elements in array. Print to console.
			int total1 = 0;
			for(int m = 0; m < nameLengths.length; m++) {
				total1 = total1 + nameLengths[m];
			}
			System.out.println("The sum of all elements in array nameLengths : " + total1);
	}

		/*7. Write a method that takes a String, word, and an int, n, as arguments and returns the 
			word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect 
			the method to return “HelloHelloHello”). */
		
			static String repeatWord(String word, int n) {

				String newString = "";
				for (int i = 0; i < n; i++){
					newString += word;
				}
					return newString;
		
		}	

		
		/*8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full
		 *  name should be the first and the last name as a String separated by a space). */
			
		static String twoNames(String firstName, String lastName) {
			
			return firstName + " " + lastName;
		}
		
		/*9. Write a method that takes an array of int and returns true if the sum of all the ints in the array 
		 * is greater than 100.	 */
		
		
		public static boolean addition(int[] numbers) {
			int i = 0;
			int sum = 0;
			int total = 100;
			while ( i < numbers.length) {
				sum += numbers[i];
				i=i+1;
			}
			if(sum >= total) {
				return true;
			}else {
				return false;
			}
		}
		
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.

		public static double average2(double[] numbers2) {
			double sum = 0;
			for(int i = 0; i < numbers2.length; i++) {
				sum = sum += numbers2[i];
			}
			return (sum / numbers2.length);
		}

		//11.Write a method that takes two arrays of double and returns true if the average of the elements in the 
			//first array is greater than the average of the elements in the second array.
		
		public static boolean average3(double[] nums1, double[] nums2) {
	
			double sum1 = 0;
			double sum2 = 0;
			double ave1 = 0;
			double ave2 = 0;
			
			for(int i = 0; i < nums1.length; i++) {
				sum1 = sum1 += nums1[i];
				ave1 = sum1 / nums1.length;
		}
			for(int j = 0; j < nums2.length; j++) {
				sum2 = sum2 += nums2[j];
				ave2 = sum2 / nums2.length;
			}
			if(ave1 > ave2) {
				return true;
			}else {
				return false;
			}
		}
		

		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
			//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			
			if( isHotOutside = true && moneyInPocket >= 10.50){
				return true;
			}else {
				return false;
			}
		}

		//13. Create a method of your own that solves a problem. In comments, write what the method does and why 
				//you created it.
		/*What time does Lily need to go to bed, based on what time she woke from nap. Sometimes I have to calculate
		how long Lily has been awake from her nap to determine when she should go to bed. */
		
		public static double bedTime(double wokeUp, double beenAwake) {

			if(wokeUp <= 2.00 || beenAwake >= 5.00) {
				return 7.00;
			}else {
				if(wokeUp <= 3.00 && beenAwake >= 4.00) {
					return 8.00;
				}else {
					if(wokeUp <= 4.00 && beenAwake <= 4.00) {
						return 9.00;
					}else {
						return 10.00;
					}
				}
			}
		}

}

