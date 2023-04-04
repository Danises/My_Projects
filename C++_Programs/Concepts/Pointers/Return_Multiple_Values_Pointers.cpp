#include <iostream>
using namespace std;

int getMin(int numbers[], int size){ //Finding the min num
    int min = numbers[0]; 
    for (int i = 1; i<size; i++){
        if(numbers[i]<min){
            min = numbers[i];
        }
    }
    return min;
}

int getMax(int numbers[], int size){ //Finding the max num
    int max = numbers[0]; 
    for (int i = 1; i<size; i++){
        if(numbers[i]>max){
            max = numbers[i];
        }
    }
    return max;
}

//Passing two parameters by reference
//Which means passing the address of the two values
//And the function will dereference those memory addresses to the values
void getMinAndMax(int numbers[], int size, int* min, int* max){
     for (int i = 1; i<size; i++){
        if(numbers[i]>*max){
            *max = numbers[i];
        }
        if(numbers[i]<*min){
            *min = numbers[i];
        }
    }
} 
//Return statement is not necesary since the values as soon as the program is ran are updated


int main(){
    int numbers[5] ={5,4,-2,29,6};
    cout<<"Min is "<<getMin(numbers, 5)<<endl;
    cout<<"Max is "<<getMax(numbers, 5)<<endl;

    int min = numbers[0];
    int max = numbers[0];

    getMinAndMax(numbers,5,&min,&max);
    cout<<"Min is "<<min<<endl;
    cout<<"Max is "<<max<<endl;

    return 0;
}