import java.util.Scanner;

public class Grocery_Main
{
    static Scanner inputKeys = new Scanner(System.in);
    public static void main(String[] args)
    {   //Creating a new instance of a class
        Grocery_Item oranges = new Grocery_Item("oranges", 1.25, 5, "2lbs");
                                                //Passing all the data into the instance variables
        oranges.printItem();
        double price = oranges.Item_cost();
        System.out.println("the price of the oranges is " + price);

        Grocery_list weekly = new Grocery_list();
        weekly.addItem(oranges);
        weekly.printList();
        System.out.println(weekly.listCost());

        groceryMenu(weekly);



    } // end of main
    public static void groceryMenu(Grocery_list l)
    {
        boolean loop = true;
        while (loop)
        {
            System.out.println("Enter 'd' for done, 'a' to add item" +
                    ", 't' for total cost, 'p' to print list");
            String inp = inputKeys.next();
            if (inp.equals("d"))
            {
                loop = false;
            }
            if (inp.equals("t"))
            {
                double total = l.listCost();
                System.out.printf("Your total list will cost %2f \n", total);
            }
            if (inp.equals("a"))
            {
                System.out.println("Enter the name of the Item: ");
                String n = inputKeys.next();
                System.out.println("Enter the price of the item: ");
                double p = inputKeys.nextDouble();
                inputKeys.next();
                System.out.println("Enter the quantity of the item");
                int q = inputKeys.nextInt();
                inputKeys.next();
                Grocery_Item tempItem = new Grocery_Item(n,p,q,"one");
                l.addItem(tempItem);
            }
            if (inp.equals("p"))
            {
                l.printList();
            }
        }
    }
}

