//This program compares two random numbers (using an independent method) and finds the highest automatically.
//The numbers are between 0 & 10
public class Random_Random
{
    public static void main(String[] args)
    {
        System.out.println("welcome to our Coding program");
       int largest = 0;

        int count =10;
        while (count>0)
        {
            int first = (int)((Math.random()*10) + 1);
            int second = (int)((Math.random()*10) + 1);
            System.out.println("first " + first + " second " + second);
            largest = finLarge(first,second);
            System.out.println("Largest num = "+ largest);
            count--;
        }
    }
    public static int finLarge(int a, int b)
    {
        int returnVal = 0;
        if (a>b)
        {
            returnVal = a;
        }
        else
        {
            returnVal = b;
        }
        return(returnVal);
    }
}
