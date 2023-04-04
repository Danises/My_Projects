#include <iostream>
using namespace std;

int main() {
   int size;
   cout << "Enter the size of the array: ";
   cin >> size;

   //There are two keywords when using Dynamic Memoty Allocation
   //new type [ArrayName]
   //delete[] ArrayName

   //These keywords allow us to declare and initialize at run time instead of compile time like Static Memory Allocation

   int* myArray = new int[size]; // allocate memory for the array

   for (int i = 0; i < size; i++) {
       cout<<"Array["<<i<<"] = ";
       cin>>myArray[i];
   }

   for (int i = 0; i < size; i++) {
       cout << myArray[i] << " "; //*(myArray+i) Another way to dereference the Array
   }

   // free the memory allocated for the array
   delete[] myArray;
   myArray = NULL;
   //Array is not pointing anywhere anymore at this line of code in the program

   return 0;
}
