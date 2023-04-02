package Week3CodingHW;
import java.util.HashSet;
import java.util.Set;

public class Week3codingassignment {

	public static void main(String[] args) {

//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 45 };

//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int subage = ages[ages.length - 1] - ages[0];

		System.out.println(subage);

//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		System.out.println(subage);

//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		System.out.println(sum / ages.length);

//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int numName = 0;
		for (int i = 0; i < names.length; i++)
			;
		{
			numName += names.length;
		}
		int avgLength = numName / names.length;
		System.out.println("Average nummber of letter per name:" + avgLength);

//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String concatenatedNames = " ";
		for (int i = 0; i < names.length; i++) {
			concatenatedNames += names[i] + " ";
		}
		System.out.println(concatenatedNames);

//3.	How do you access the last element of any array?
		System.out.println(names[names.length - 1]);

//4.	How do you access the first element of any array?
		System.out.println(names[0]);

//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++);int i = 0;
		{
			nameLengths[i] = names[i].length();
		}

//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumOfNames = 0;
		for(int i1 = 0; i1< nameLengths.length; i1++);{
		sum += nameLengths[i];
		}
		System.out.println(sumOfNames);
		
//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println(repeatWord("Hello", 3));
		
//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		String firstName = "Jake";
		String lastName = "Kim";
		String fullName = usefullName(firstName, lastName);
		
		System.out.println(usefullName(firstName, lastName));
		
//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		int[] sums = {50,70,90,250,300,60};
		System.out.println(isSumGreater(sums));
		
//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		int avgNum = 0;
		double[] decimals = {22.5, 36.10, 50.55, 46.77, 89.50};
		int returnAvg = avgNum / decimals.length;
		System.out.println(AverageDecimals(decimals));
		
//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double[] array1 = {10.50, 20.20, 30.50, 45.80, 90.90};
		double[] array2 = {4.50, 5.60, 4.20, 100.50, 50.50};
		System.out.println(arrayAverage(array1 , array2));
		
//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 9.00;
		
		//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		Set<String> set = new HashSet<String>();
		set.add("Observe");
		set.add("James");
		set.add("Oppinion");
		set.add("Jobs");
		set.add("Opportunity");
		
		Set<String> startsWithO = startingLetter(set, 'O');
		for(String word : startsWithO) {
			System.out.println(word);
		}
	
	}

//method 7
public static String repeatWord (String word, int n) {
	String result = "";
	for(int i = 0; i < n; i++) {
		result += word;
	}
	return result;
}
// method 8
public static String usefullName (String firstName, String lastName) {
	return firstName + " " + lastName;
}
//method 9
public static boolean isSumGreater (int[] sums) {
	int sums2 = 0;
	for(int i = 0; i < sums.length; i++) {
		sums2 += sums[i]; 
	}if (sums2 > 100) {
		return true;
	}else {
		return false;
	}
}
//method 10
public static double AverageDecimals (double[] decimals) {
	int avgNum = 0;
	int returnAvg = avgNum / decimals.length; 
	for(int i = 0; i < decimals.length; i++) {
		avgNum += decimals[i];
	}
	return returnAvg;
}
//method 11
public static boolean arrayAverage (double[] array1,  double[] array2) {
	double arrayAvg1 = 0;
	double arrayAvg2 = 0;
	for(int i = 0; i < array1.length; i++) {
		arrayAvg1 += array1[i];
	}
	for(int i = 0; i < array2.length; i++) {
		arrayAvg2 = array2[i];
	}
	double average1 = arrayAvg1 / array1.length;
	double average2 = arrayAvg2 / array2.length;
	return average1 > average2;
}


//method 12
public static boolean willBuyDrinks (boolean isHotOutside, double moneyInPocket) {
	if(isHotOutside && moneyInPocket >= 9.10) {
		return true;
	}else {
		return false;
	}
}
//method 13
public static Set<String> startingLetter(Set<String> set, char c){
	Set<String> results = new HashSet<String>();
	
	for(String string : set) {
		if(string.charAt(0) == c) {
			results.add(string);
		}
	}
	return results;
}
	
}

