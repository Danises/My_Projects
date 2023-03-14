//Problem2
//Assignment1
//Author: Daniel Espin
//Date: 3/13/2023
//File's purpose: The game of Nim. (Smart/Stupid)Computer VS Human.

#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>

using namespace std;

void play_game(int pile_size, string turn, string mode);
// Play the game of Nim with the given parameters

int main()
{
    cout << "Welcome to the game of Nim!" << endl;

    int pile_size;
    cout << "Enter the size of the pile (between 10 and 100): ";
    cin >> pile_size;
    while (pile_size < 10 || pile_size > 100) {
        cout << "Invalid input. Please enter a number between 10 and 100: ";
        cin >> pile_size;
    }

    string turn;
    cout << "Who goes first? Type 'human' or 'computer': ";
    cin >> turn;
    while (turn != "human" && turn != "computer") {
        cout << "Invalid input. Please type 'human' or 'computer': ";
        cin >> turn;
    }

    string mode;
    cout << "Which mode should the computer play? Type 'smart' or 'stupid': ";
    cin >> mode;
    while (mode != "smart" && mode != "stupid") {
        cout << "Invalid input. Please type 'smart' or 'stupid': ";
        cin >> mode;
    }

    play_game(pile_size, turn, mode);

    return 0;
}

void play_game(int pile_size, string turn, string mode)
{
    srand(time(0)); // Initialize random seed

    while (pile_size > 0) {
        cout << "The pile currently has " << pile_size << " marbles." << endl;

        int marbles_taken;
        if (turn == "human") {
            cout << "How many marbles do you want to take? (1-" << pile_size/2 << "): ";
            cin >> marbles_taken;
            while (marbles_taken < 1 || marbles_taken > pile_size/2) {
                cout << "Invalid input. Please enter a number between 1 and " << pile_size/2 << ": ";
                cin >> marbles_taken;
            }
        } else {
            if (mode == "stupid") {
                marbles_taken = rand() % (pile_size/2) + 1;
                cout << "The computer takes " << marbles_taken << " marbles." << endl;
            } else {
                if (pile_size == 2) {
                    marbles_taken = 1;
                } else if (pile_size == 3) {
                    marbles_taken = 2;
                } else if (pile_size == 7) {
                    marbles_taken = 3;
                } else {
                    int n = floor(log2(pile_size));
                    int k = pow(2, n) - 1;
                    marbles_taken = pile_size - k;

                    if (marbles_taken > pile_size/2) {
                        marbles_taken = rand() % (pile_size/2) + 1;
                    }

                    cout << "The computer takes " << marbles_taken << " marbles." << endl;
                }
            }
        }

        pile_size -= marbles_taken;

        if (pile_size == 0) {
            if (turn == "human") {
                cout << "You took the last marble. You lose!" << endl;
            } else {
                cout << "The computer took the last marble. You win!" << endl;
            }
        } else {
            if (turn == "human") {
                turn = "computer";
            } else {
                turn = "human";
            }
        }
    }
}
