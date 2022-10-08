//This program compares a random number and the user inputted number.
//Finds the highest number, the possible numbers can be between 0 - 100.
//The program is looped which lets try the user countless times.

import java.util.Scanner;
public class Random_User
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomInt = (int) ((Math.random() * 100)+ 1);
        char play = 'y';
        while (play != 'n') {
            System.out.println("Enter a number: ");
            int userNumber = input.nextInt();

            if (randomInt > userNumber) {
                System.out.println("The computer number is higher than yours \n" + "Yours = " + userNumber + " Computer number = " + randomInt);
            } else {

                System.out.println("Your number is higher than the computer number \n" + "Yours = " + userNumber + " Computer number = " + randomInt);
            }
            System.out.println("Would you like to play again? y/n");
            play = input.next().charAt(0);
        }
    }
}
