"This program determines if a number is divisible by the specified value, then print out something"
"The goal of this program is to apply the for loop and conditional statements as well as the modulus operator"

public class For_Loop
{
    public static void main(String[] args)
    {
        for (int count = 0; count <= 100; count++)
        {
            //Numbers divisible by 3 = fizz
            //Numbers divisible by 5 = buzz
            if (count % 3 == 0)
            {
                System.out.println("fizz");
            }
            else if (count % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(count);
            }
        }
    }
}