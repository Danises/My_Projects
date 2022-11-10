import java.util.Scanner;

public class Main_Class
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        Menu_Template dice = new Menu_Template();
        boolean x = true;
        String choice;
        dice.Print_Menu();
        while (x)
        {
            dice.Print_choice_question();
            choice = input.next();
            dice.Print_Choice(choice);
            if (choice.equals("q"))
            {
                break;
            }
        }
    }
}
