import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Q1. Write a program that prints the numbers from 1 to 100 such that:
        If the number is a multiple of 3, you need to print "Fizz" instead of that number. */

        // Header
        System.out.println("-------------------Q1-------------------");

        // 1. Loop from 1-100, check for the three conditions, and print the result
        for (int i = 1; i <= 100 ; i++) {
            if ( i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");// If the number is a multiple of both 3 & 5
            else if ( i % 3 == 0) System.out.println("Fizz");// // If the number is a multiple of 3
            else if(i % 5 == 0) System.out.println("Buzz" );// If the number is a multiple of 5
            else System.out.println(i);//Any other number
        }

        //----------------------------------------------------------------------
        // Q2. Write a Java program to reverse a string.

        // Header
        System.out.println("-------------------Q2-------------------");

        // 1. Create a Scanner object to take the user input (it will be used for all questions)
        Scanner user_input = new Scanner(System.in);

        // 2. Prompt the user to enter a string
        System.out.print("Please enter a string: ");
        String acutalString = user_input.nextLine();

        // 3. An empty string to store the reversed string
        String reversedString = "";

        // 4. Reverse the promoted string
        for(int i = 0 ; i < acutalString.length() ; i++){
            char letter = acutalString.charAt(i);//Returns the char at that index
            reversedString = letter + reversedString;//Store the char in the reversed string var
        }

        // 5. Print the reversed string
        System.out.println("Reversed string: " + reversedString);

        //----------------------------------------------------------------------
        // Q3. Write a program to find the factorial value of any number entered through the keyboard.

        // Header
        System.out.println("-------------------Q3-------------------");

        // Loop to ask the user to enter a number until he/she enter -1 to exit
        do {
            // 2. Prompt the user to enter a number or -1 to exit
            System.out.print("Please enter any positive number or -1 to exit: ");
            int number = user_input.nextInt();

            // 3. Var to store the factorial of a number
            int factorial = 1;

            // 4. Check the condition to exit the program
            if(number == -1){
                System.out.println("You exited the program..");
                break;
            }
            // 5. Skip negative numbers as factorials don't apply to them (except for -1 to exit)
            else if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                continue;
            }

            // 6. Loop to calculate factorial
            for (int i = number; i > 0; i--) {
                factorial = factorial * i;
            }

            // 7. Print the result
            System.out.println("Factorial of " + number + " is: " + factorial);// If the user entered -1 the program will end

        }while(true);

        //----------------------------------------------------------------------
        /* Q4. Two numbers are entered through the keyboard. Write a program to find
        the value of one number raised to the power of another. (Do not use Java built-in method) */

        // Header
        System.out.println("-------------------Q4-------------------");

        int base;
        int exponent;
        int result = 1;

        // 2. Prompt the user to enter the base
        System.out.print("Please enter the base: ");
        base = user_input.nextInt();

        // 3. Prompt the user to enter the exponent
        System.out.print("Please enter the exponent: ");
        exponent = user_input.nextInt();

        // 4. Calculate the base raised to the power of exponent
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        // 5. Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        //----------------------------------------------------------------------
        /* Q5. Write a program that reads a set of integers,
        and then prints the sum of the even and odd integers. */

        // Header
        System.out.println("-------------------Q5-------------------");

        int num;
        int oddSum = 0 ;
        int evenSum = 0;

        // Loop to ask the user to enter a number until he/she enter 0 to exit
        do{
            // 2. Prompt the user to enter a number
            System.out.print("Please enter any number or 0 to exit: ");
            num = user_input.nextInt();

            // 3. Check if the entered number is even or odd or 0 to exit
            if(num == 0){
                System.out.println("\nYou exited the program..");
                break;
            }
            else if (num % 2 == 0) {
                evenSum = evenSum + num;
                continue;
            }
            oddSum = oddSum + num;

        }while (true);// If the user entered 0 the program will end

        // 4. Print the result
        System.out.println("\nEven numbers sum: " + evenSum + "\nOdd numbers sum: " + oddSum);

        //----------------------------------------------------------------------
        /* Q6. Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number. */

        // Header
        System.out.println("-------------------Q6-------------------");

        int positiveInt = 0;

        // Loop to ask the user to enter a number until he/she enter 0 to exit
        do {
            // 2. Prompt the user to enter a positive integer
            System.out.print("Please enter a positive integer or 0 to exit: ");
            positiveInt = user_input.nextInt();

            user_input.nextLine();

            // 3. If the user enters 0, exit the program
            if (positiveInt == 0) {
                System.out.println("You exited the program..");
                break;
            }

            // 4. Numbers less than or equal to 1 are not prime, skip processing them
            else if (positiveInt <= 1) {
                System.out.println(positiveInt + " is not a prime number.");
                continue;
                }

            // 5. Check if the number is prime
            boolean isPrime = true;

            // 6. Check for divisors from 2 to positiveInt / 2
            for (int i = 2; i <= positiveInt / 2; i++) {
                if (positiveInt % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // 7. Print whether the number is prime or not
            if (isPrime) System.out.println(positiveInt + " is a prime number.");
            else System.out.println(positiveInt + " is not a prime number.");

        }while (true);//Exit the program if the user entered 0

        //----------------------------------------------------------------------
        /* Q7. Use a for loop to print headings for four weeks (Weeks 1 - 4).
        Then use another for loop to print the days (Days 1 -7) for each week. */

        // Header
        System.out.println("-------------------Q7-------------------");

        // 2. Nested loop through the weeks and days and print the headings
        for(int i = 1 ; i < 5 ; i++){
            System.out.println("Week" + i);
            for(int j = 1 ; j < 8 ; j++){
                System.out.println("Day" + j);
            }
        }

        //----------------------------------------------------------------------
        /* Q8. Write a program that check if the word is a palindrome or not.
        hint: A string is said to be a palindrome if it is the same if we start
        reading it from left to right or right to left. */

        // Header
        System.out.println("-------------------Q8-------------------");

        String word;

        // Loop to ask the user to enter a number until he/she enter 0 to exit
        do {
            // 2. Prompt the user to enter a word
            System.out.print("Please enter a word or x to exit: ");
            word = user_input.nextLine();

            int start = 0;
            int end = word.length() - 1;
            boolean isPalindrome = true;

            // 3. Check if the word is a palindrome
            while (start < end) {
                // If characters at start and end don't match, it's not a palindrome
                if (word.charAt(start) != word.charAt(end)) {
                    isPalindrome = false;  // If a mismatch is found, set the flag to false
                    break;  // Exit the loop early since it's not a palindrome
                }
                start++;
                end--;
            }

            // 4. Check if the user entered a palindrome word or x to exit and print the result
            if (word.equalsIgnoreCase("x")) {
                System.out.println("You exited the program..");
                break;
            } else if(isPalindrome) System.out.println(word + " is a palindrome.");
            else System.out.println(word + " is not a palindrome.");

        }while (!word.equalsIgnoreCase("x"));//Exit the program if the user entered x
        //----------------------------------------------------------------------
        // Closing the scanner
        user_input.close();
    }
}