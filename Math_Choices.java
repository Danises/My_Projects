import java.util.Scanner;
public class Math_Choices
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char x = 'y';
        double calc1, calc2;
        int user_num;
        double output;

        while (x != 'q')
        {
            System.out.println("Hello!, what would you like to calculate?");
            System.out.println("Type \"1" + " for exponentiation");
            System.out.println("Type \"2" + " for multiplication");
            System.out.println("Type \"3" + " for the SquareRoot");
            user_num = input.nextInt();

            if (user_num == 1)
            {
                System.out.println("Type base and exponent: ");
                calc1 = input.nextDouble();
                calc2 = input.nextDouble();
                output = exponentiation(calc1, calc2);
                System.out.println(calc1 + " ^ " + calc2 + " = " + output);
            }
            else if (user_num == 2)
            {
                System.out.println("Type two numbers to multiply them: ");
                calc1 = input.nextDouble();
                calc2 = input.nextDouble();
                output = multiplication(calc1,calc2);
                System.out.println(calc1 + " x " + calc2 + " = " + output);
            }
            else if (user_num == 3)
            {
                System.out.println("Type one number to calculate the Square root: ");
                calc1 = input.nextDouble();
                output = squareRoot(calc1);
                System.out.println("Square root of " + calc1 + " = " + output);
            }
            else
            {
                System.out.println("Incorrect key inputted");
            }
            System.out.println("Would you like to try again? y(yes)/q(quit): ");
            x = input.next().charAt(0);
            if (x == 'q')
            {
                System.out.println("Goodbye!!!!");
            }
        }
    }

    public static double exponentiation ( double a, double b)
    {
        System.out.println("You chose exponentiation! ");
        double calculations1 = Math.pow(a, b);
        return calculations1;
    }
    public static double multiplication ( double c, double d)
    {
        System.out.println("You chose multiplication");
        double calculations2 = c * d;
        return calculations2;
    }
    public static double squareRoot( double e)
    {
        System.out.println("You chose Radicals");
        double calculations3 = Math.sqrt(e);
        return calculations3;
    }
}
