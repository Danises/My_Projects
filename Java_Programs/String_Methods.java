//The objective of this program is to ask the user which type of
//String Modification is desired, after being chosen, perform it.
import java.util.Scanner;
public class String_Methods
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String string_input, output, selection, play_word = "yes";

        while (!play_word.equalsIgnoreCase("quit"))
        {
            System.out.print("Please enter any String: ");
            string_input = input.next();

            System.out.println("Type 1 to reverse the String");
            System.out.println("Type 2 to find the vowels and their indexes of the String");
            System.out.println("Type 3 to show the character and its index of the String");
            System.out.print("\nPlease choose the modification you want to apply to the String: ");
            selection = input.next();

            if (selection.equals("1"))
            {
                output = reverse(string_input);
                System.out.println(output);
            }
            else if (selection.equals("2"))
            {
                output = vowels(string_input);
                System.out.println(output);
            }
            else if(selection.equals("3"))
            {
                output = letter_index(string_input);
                System.out.println(output);
            }
            else
            {
                System.out.println("Invalid character inputted");
                break;
            }

            System.out.print("\nWanna try again? type yes or quit to exit: ");
            play_word = input.next();
            if (play_word.equalsIgnoreCase("yes"))
            {
                play_word = "yes";
            }
            else if (play_word.equals("quit"))
            {
            System.out.println("Goodbye");
            }
            else
            {
                System.out.println("Invalid characters inputted");
                break;
            }
        }
    }

    public static String reverse(String word)
    {
        for (int i = word.length() -1 ; i >= 0 ; i--)
        {
            System.out.print(word.charAt(i));
        }
        return word;
    }

    public static String vowels(String only_vowels)
    {
        int num_vowels = 0;
        String str = only_vowels;

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'||
               str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
               str.charAt(i) == 'u')

               System.out.println("The given string contains the vowel " + str.charAt(i)+" at the index " + i);
        }
        return only_vowels;
    }

    public static String letter_index(String let_inx)
    {
        for (int i = 0 ; i < let_inx.length() ; i ++)
        {
            System.out.println("The letter " + let_inx.charAt(i) + " is at index " + i );
        }
        return let_inx;
    }
}