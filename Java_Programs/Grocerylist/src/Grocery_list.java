import java.util.ArrayList;
public class Grocery_list
{
    ArrayList<Grocery_Item>myList;

    Grocery_list()
    {
        myList = new ArrayList<Grocery_Item>();
    }
    public void addItem(Grocery_Item item)
    {
        myList.add(item);
    }
    public void printList()
    {
        for (Grocery_Item item:myList)
        {
            item.printItem();
        }
    }
    public double listCost()
    {
        double total = 0;
        for (Grocery_Item item:myList)
        {
            total += item.Item_cost();
        }
        return total;
    }
}
