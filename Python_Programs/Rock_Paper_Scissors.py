import random

winner = False
    
while winner!=True:
    user = input("Choose rock(r) | paper(p) | scissors(s): ")
    computer = random.choice(['r','p','s'])
    print(f"Computer chose {computer}")

    if user == computer:
        print("It\'s a tie'")
    elif user == 'r' and computer == 's' or user == 's' and computer =='p' or user == 'p' and computer =='r':
        winner = True
    else:
        print("Computer won")
    
print("You have won")