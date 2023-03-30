package week3CodingAssignment;
//
public class CodingAssignment {
//
	public static void main(String[] args) {
//		
//	  1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
         int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 45};

        
//        a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
         int difference = ages[ages.length-1]-ages[0];
         
         System.out.println(difference);
	
         
//        b. Add a new age to your array and repeat the step above to ensure it
//           is dynamic (works for arrays of different lengths).
         
         System.out.println(difference);
//        c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
         int sum = 0;
         
         for (int i = 0; i < ages.length; i++) {
        	 sum += ages[i];
         }
         System.out.println(sum / ages.length);
//    2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
         
         String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//        a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
         int sum1 = 0;
         
         for (int i = 0; i < names.length; i++) {
        	  sum1 += names[i].length();
          }
         int avgLength = sum1 / names.length;
         System.out.println("The average letters per name: " + avgLength);
//        b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
         
         String concatenatedNames = "";
         for (int i = 0; i < names.length; i++) {
        	 concatenatedNames += names[i] + " ";
         }
         System.out.println(concatenatedNames);
//    3. How do you access the last element of any array
         
         System.out.println(names[names.length-1]);
         
//    4. How do you access the first element of any array?
         
         System.out.println(names[0]);
//    5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
         
         int[] nameLengths = new int[names.length];
         
         for (int i = 0; i < names.length; i++) {
        	 nameLengths[i] = names[i].length();
         }
//    6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
         int sumNames = 0; //initializing sumNames
         for (int i = 0; i < nameLengths.length; i++) {
        	 sumNames += nameLengths[i];
         }
         System.out.println(sumNames);
	
//    7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
	System.out.println(repeatWordN("Hello", 3));  
	
//    8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	String firstName = "Tammy";
	String lastName = "Thomas";
	String fullName = createFullName(firstName, lastName);
	
	System.out.println(createFullName(firstName, lastName));
	
	
//    9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	
	int[] nums = {2, 5, 6, 500, 1, 9, 5};
	System.out.println(isSumGreater(nums));
	
//    10. Write a method that takes an array of double and returns the average of all the elements in the array.
	int sum3 = 0;
    double[] decimals= {34.6, 23.67, 34.87, 12.2};
    int avg = sum3 / decimals.length;
	System.out.println(calculateAvgDecimals(decimals));
	
//    11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	
	double[] array1 = {23.65, 4.7, 6.98, 2.34};
	double[] array2 = {1.43, 34.6, 23.7, 5.43};
	
	System.out.println(compareAverages(array1, array2));
	
//    12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	boolean isHotOutside = true;
	double moneyInPocket = 11.00;
	
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
//    13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
//	
//		a. I want to buy lunch when I'm at the store if I have enough money in my pocket. Following is the method I would use to make that calculation.	
	boolean atStore = true;
	double moneyInPocket2 = 5.00;
	
	System.out.println(willBuyLunch(atStore, moneyInPocket2));
}//end of main method
public static String repeatWordN (String word, int n) { //method signature
	 
    String result = ""; //empty with "" means it can be inputted into.
    for (int i = 0; i < n; i++) { // for each time it iterates, 
   	 result += word;			// result = result + word
   	
    }

 return result;
    
}

public static String createFullName (String firstName, String lastName) {
	return firstName + " " + lastName; 			
}


public static boolean isSumGreater (int[] nums) {
	int sum2 = 0;
	for (int i = 0; i < nums.length; i++) {
		sum2 += nums[i];
	}if (sum2 > 100) {
			return true;
		}else {
			return false;
		}
	
}
public static double calculateAvgDecimals (double[] decimals) {
	 int sum3 = 0;
     int avg = sum3 / decimals.length;
     for (int i = 0; i < decimals.length; i++) {
    	 sum3 += decimals[i];
     }
	return avg;
     
}
public static boolean compareAverages (double[] array1, double[] array2) {
	double sum4 = 0;
	double sum5 = 0;
	
	for (int i = 0; i < array1.length; i++) {
       	 sum4 += array1[i];
	}
    for (int i = 0; i < array2.length; i++) {
    	 sum5 += array2[i];
    }
    double avg1 = sum4 / array1.length;
    double avg2 = sum5 / array2.length;
    return avg1 > avg2;
}
public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	
	
	if (isHotOutside && moneyInPocket  >= 10.50) {
		return true;
	}else {
		return false;
	}
}

public static boolean willBuyLunch (boolean atStore, double moneyInPocket2) {
	if (atStore && moneyInPocket2 >= 4.50) {
		return true;
	}else {
		return false;
	}
}


}//end of class method
