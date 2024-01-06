
public class week4project2 {
	public static void main(String[] args) {
	//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //Int Array named ages
//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). 
//Print the result to the console.  
  	// Get size, finds the size of the array -1 so that the value matches the final element in the array, by the first element in the array.
    int results = ages[ages.length - 1] - ages[0]; //Length of array - 1 the sum is the last element of the array - first array
    System.out.println("Result: " + results); //print results
  //b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
    int[] ages2 = {10, 47, 11, 22, 9, 6, 14, 23, 71}; 
    int results2 = ages2[ages2.length - 1] - ages2[0];
    System.out.println("Result: " + results2);
  //c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
  	int sum = 0; // Sum starts at 0
  	for(int age : ages) { //For Loop for going through every element in the array.
  	sum += age; //Every element is added to sum, sum starts at 0 + every element in the array.
  	}
  double average = (double) sum / ages.length; // Average is found taking the sum of all ages divided by the amount of ages. 
  //Declare sum a double before dividing to get a more exact answer.
  System.out.println("The Average Age is: " + average); //Printing the Average Age
//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.  	
  String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //String Array for each name.
  //a. Use a loop to iterate through the array and calculate the average number of letters per name.
  //Print the result to the console.
  int letterCount = 0; 
  for(int i = 0; i < names.length; i++) { //Advanced For Loop to go through every element of the array.
  	letterCount += names.length; //letterSum starts at 0, adds 1 for every element it cycles through.
  }
  double averageLetters = (double) letterCount / names.length; //Changes LetterCount from int to Double
  //Takes the total amount of letters and divides them by the amount of elements in the array.
  System.out.println(letterCount);
  System.out.println(names.length);
  System.out.println("Average letters in each name: " + averageLetters);
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
 //and print the result to the console.
  StringBuilder concatenatedNames = new StringBuilder();
  for (String name : names) { //Advance for loop to loop through every name.
      concatenatedNames.append(name).append(" "); //concatenation of the names append as it cycles through every name.
  }
  System.out.println("Names: " + concatenatedNames.toString());
  //3. How do you access the last element of any array?
  int finalAge = ages[ages.length - 1]; //Makes a variable to hold the final element of the array, the array length -1
  System.out.println("Final Age: " + finalAge); //Prints the final element
  //4. How do you access the first element of any array?
  int firstAge = ages[0];
  System.out.println("First Age: " + firstAge);
 //5. Create a new array of int called nameLengths. 
  //Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
  
  int[] nameLengths = new int [names.length]; //Int Array set to NameLengths set to name.lengths.
  for (int i = 0; i < names.length; i++) { //For loop iterates through each name length of every element in the names array.
	  nameLengths[i] = names [i].length();
  }
 //6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
 //Print the result to the console.
  int nameLengthSum = 0; // Variable to hold the sum of the name lengths
  for (int nameLength : nameLengths) { //Advanced For loop to cycle the elements of the array.
	  nameLengthSum += nameLength; //Every namelength from the array added to the sum.
  }
  System.out.println("Sum of all Name Lengths: "+ nameLengthSum); 
 
 //7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
  //(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
  String repeatedWords = repeatedWords("Words", 3);
  System.out.println(repeatedWords);

 //8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
  String fullName = firstLastName("Hal", "Jordan"); //Declare Full Name string, then insert the first and last name.
  
  System.out.println(fullName);
  
  
 //9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
  int[] arrayToCheck = {30, 40, 35};
  boolean sumGreaterThan100 = isSumGreaterThan100(arrayToCheck);
  System.out.println("Sum greater than 100: " + sumGreaterThan100);
  
 //10. Write a method that takes an array of double and returns the average of all the elements in the array.
  double[] doubleArray = {10.5, 20.5, 30.5};
  double averageDouble = calculateAverage(doubleArray);
  System.out.println("Average of Double Array: " + averageDouble);

 //11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
  double[] firstArray = {20.0, 30.0, 40.0};
  double[] secondArray = {10.0, 15.0, 20.0};
  boolean avgFirstGreaterThanSecond = isAvgFirstGreaterThanSecond(firstArray, secondArray);
  System.out.println("Average of First Array > Average of Second Array: " + avgFirstGreaterThanSecond);

 //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
  boolean willBuyDrink = willBuyDrink(true, 15.0);
  System.out.println("Will Buy Drink: " + willBuyDrink);
 //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
  int[] caughtFish = {5, 3, 8, 6, 9}; //Int Array for catching fish
  int compWinner = findMaxValue(caughtFish); //Declare Array and method, 
  System.out.println("Fishing Competition Winner caught: " + compWinner + " " + "fish.");

  
	}


//Step 7
public static String repeatedWords(String word, int n) { //String Method, String & int
    StringBuilder result = new StringBuilder(); //String builder because method is a string that can work with a variety of words.
    for (int i = 0; i < n; i++) { //n = the int for the method, it will loop based on the number inserted for the method.
        result.append(word); //Appends the word based on how many times the method loops.
    }
    return result.toString(); //After the loop is completed. converts result into a normal string.
	}
//Step 8
public static String firstLastName(String firstName, String lastName) { //String Method for 2 Strings.
	return firstName + " " + lastName; //Returns a String, First & last name with a space between.
}
//Step 9
public static boolean isSumGreaterThan100(int[] array) { //boolean method for int array
    int sum = 0; 
    for (int value : array) { //Advanced for loop to add up the sum of the array.
        sum += value;
    }
    return sum > 100; //Sum of the array is checked vs 100, to output if it's above 100.
}
//Step 10
public static double calculateAverage(double[] array) { //Method returns a double, uses an array
    double sum = 0; //Sum starts at 0
    for (double value : array) { //Advanced for loop, goes through each value
        sum += value; //Starting at 0 for Sum + Value as it goes through the array.
    }
    return sum / array.length; //Total Sum of all Arrays divided by the amount of arrays
}
//Step 11
public static boolean isAvgFirstGreaterThanSecond(double[] firstArray, double[] secondArray) { //Method returns a boolean.
	// 2 Double arrays
    return calculateAverage(firstArray) > calculateAverage(secondArray); //Return 1st > 2nd true or false.
}
//Step 12
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // Return Boolean, 
	//Boolean value and double value.
    return isHotOutside && moneyInPocket > 10.50; //Return isHotOutside = True AND moneyInPocket = True, 
    //if both true, Client will buy drink
}
//Step 13
public static int findMaxValue(int[] array) { //Finding the maximum value found in array
    if (array == null || array.length == 0) { //If Array has a "nothing" value, or a "0" value.
    } else { 
      System.out.println("Array cannot be empty"); 	//Prints this if Null or 0 value in array.
    }
    int max = array[0]; // Assume the first element is the maximum
    for (int i = 1; i < array.length; i++) { //For loop cycles through each element of the array.
        if (array[i] > max) { //Checks current array value in the cycle vs current max value.
        	//starts at 1st element in the array.
            max = array[i]; // Update max if a larger element is found
        }
    }
    return max;
}
}