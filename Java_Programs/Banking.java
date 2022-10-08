//This basic program takes user input as the starting value of a bank account
//After some modifications, it prints out the final bank balance.

import java.util.Scanner;
public class Banking
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double currentBalance;
        double depositAmt;
        double withDrawAmt;

        System.out.print("Enter your current balance: $");
        currentBalance = scan.nextDouble();

        System.out.printf("Your current balance is = $%.2f ", currentBalance );
        System.out.print("\nEnter the deposit amount: $");
        depositAmt = scan.nextDouble();
        currentBalance+=depositAmt;

        System.out.printf("\nYour balance after the deposit is = $%.2f ", (currentBalance));
        System.out.print("\nEnter the withdrawal amount: $");
        withDrawAmt = scan.nextDouble();
        currentBalance -=withDrawAmt;

        System.out.printf("\nYour balance after the withdrawal is = $%.2f ",  currentBalance);


    }
}
