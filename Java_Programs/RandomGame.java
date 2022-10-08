//This program evaluates the inputted value and the randome value
//Finally prints out whether the user guess matches the random guess or not.
//The accepted values are from 1 - 10
import java.util.Random;
public class RandomGame
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int userGuess;
        double ourRandom;
        int theTarget;
        ourRandom = Math.random();
        theTarget = (int) (ourRandom * 10) + 1;
        System.out.println("Guess a number: ");
        userGuess = scan.nextInt();

        if (userGuess == theTarget)
        {
            System.out.println("You have guessed correctly");
        }
        else
        {
            System.out.println("Your guess is incorrect, try again");
        }

    }
}