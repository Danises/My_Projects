public class Grocery_Item
{
    String name;
    double price;
    int count;
    String unit;

    Grocery_Item(String n, double p, int c, String u )
    {// save the passed in data into the instance variable
        name = n;
        price = p;
        count = c;
        unit = u;
    }
    public void printItem()
    {
        System.out.printf("Information = %s, %.2f, %d, %s \n", name,price,count,unit);
    }
    public double Item_cost()
    {
        return price * count;
    }
}

