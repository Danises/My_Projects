//4/2/2023
#include <iostream>
using namespace std;

void printNumber(int* numberPtr){
    cout << *numberPtr << endl;
}
void printLetter(char* charPtr){
    cout << *charPtr << endl;
}
void printx(int x){
    cout << x << endl;
}
void print(void* ptr, char type){
    switch (type)
    {
    case 'i'://Int*
    cout<<*((int*)ptr)<<endl;
        break;
    case 'c'://Char*
    cout<<*((char*)ptr)<<endl;
        break;
    }
}
int main(){
    int number = 5;
    char letter = 'A';
    int x = 1;
    printNumber(&number);
    printLetter(&letter);
    printx(x);
    print(&number, 'i');
    print(&letter, 'c');

    return 0;
}