#include <iostream>

using namespace std;

int main(){
    int rows, columns;
    cout<<"Enter rows, columns:";
    cin>>rows>>columns;

    //Creating the table -Pointer to a pointer
    int ** table = new int*[rows];

    for (int i =0; i<rows;i++){
        table[i] = new int [columns];
    }

    table[1][2] = 88;

    //Deallocation has to be in order as follows

    for (int i = 0; i<rows;i++){
        delete[] table[i];

    }
    delete[] table;
    table = NULL;

    return 0;
}