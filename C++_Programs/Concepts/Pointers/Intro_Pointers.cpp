//4/1/2023
#include <iostream>
 using namespace std;

 int main(){
    int x = 5; //variable decaration and initialization.
    int * px = &x; //Creating the pointer that points to the variables above --> x &x gives the address in memory.
    cout << "x =" << x <<endl; //printing out the value from the int x variable.
    cout << "x =" << px <<endl; //printing out the memory location of the x variable.
    cout << "x = "<< *px <<endl; //printing out the value of the pointer that points to the variable x.
 }