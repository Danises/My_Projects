//The following program determines if the measurement of the sides inputted meet
//the right triangle requirements
import java.util.Scanner;
public class Triangle_Program
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int side1, side2, side3;
        boolean output;
        System.out.println("Enter one number");
        side1 = input.nextInt();
        System.out.println("Enter one number");
        side2 = input.nextInt();
        System.out.println("Enter one number");
        side3 = input.nextInt();

        output = triangleTest(side1,side2,side3);
        System.out.println(output);
    }
    public static boolean triangleTest(int a, int b, int c)
    {
        if ((a+b>c)&&(b+c>a)&&(a+c>b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
