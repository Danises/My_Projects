//Problem3
//Assignment1
//Author: Daniel Espin
//Date:3/13/2023
//File's purpose: The program verifies whether the credit card number is valid or not.
#include <iostream>

int main() {
    // Declare variables to store the credit card number, the original credit card number,
    // and the sums of the digits for each step of the algorithm.
    long number, original_number, sum1 = 0, sum2 = 0;

    // Count is used to keep track of whether we are adding or doubling digits.
    // It starts at 1 so that we add the rightmost digit of the number.
    int count = 1;

    // Prompt the user to enter a credit card number.
    std::cout << "Enter a credit card number: ";

    // Read in the credit card number from the user.
    std::cin >> number;

    // Save the original number so that we can print it out later.
    original_number = number;

    // Loop through each digit of the number, starting from the rightmost digit.
    while (number != 0) {
        // Get the rightmost digit of the number.
        int digit = number % 10;

        // If the current digit is in a position that requires doubling,
        // double the digit and add the digits of the resulting number to sum2.
        if (count % 2 == 0) {
            int double_digit = digit * 2;
            sum2 += double_digit % 10 + double_digit / 10;
        } else {
            // Otherwise, add the current digit to sum1.
            sum1 += digit;
        }

        // Remove the rightmost digit from the number.
        number /= 10;

        // Increment the count so that we know whether to add or double the next digit.
        count++;
    }

    // Add the sums of the digits from the two steps together to get the total sum.
    int total_sum = sum1 + sum2;

    // If the total sum is divisible by 10, the credit card number is valid.
    if (total_sum % 10 == 0) {
        std::cout << "Credit card number " << original_number << " is valid." << std::endl;
    } else {
        // Otherwise, the credit card number is not valid.
        std::cout << "Credit card number " << original_number << " is not valid." << std::endl;
    }

    // Calculate the check digit that would make the credit card number valid.
    // This is the difference between the total sum and the nearest multiple of 10.
    int check_digit = (10 - (total_sum % 10)) % 10;

    // Print out the check digit that would make the credit card number valid.
    std::cout << "The check digit that would make the number valid is: " << check_digit << std::endl;

    // Return 0 to indicate that the program executed successfully.
    return 0;
}
