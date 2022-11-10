public class Menu_Template
{
    String choice;
    int dice = (int)(Math.random()*6) + 1;

    public void Print_Menu()
    {
        System.out.println("Roll Snake eyes Game!");
        System.out.println("The goal is to get both dice roll until they turn 1 at the same roll trial");
        System.out.println("Try as many times as you want! \n");
    }
    public void Print_choice_question()
    {
        System.out.print("type p to play or q to quit: ");
    }
    public void Print_Choice(String choice)
    {
        this.choice = choice;
        if (choice.equals("p"))
        {
            int dice = (int)(Math.random()*6) + 1;
            int dice2 = (int)(Math.random()*6) + 1;
            System.out.println("The numbers after rolling the dice are: " + dice + " and " + dice2);
            if (dice == 1 && dice2 == 1)
            {
                System.out.println("YOU WON! YOU GOT A SNAKE EYES ROLL");
            }
        }
    }
}
