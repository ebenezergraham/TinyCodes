#include <stdio.h>

void sum(int* a, int* b, int* total);

int main(){
    int a = 1;
    int b = 2;
    int total = 0;
    sum(&a,&b,&total);
    printf("Sum = %d\n",total);
}

void sum(int* a, int* b, int* total){
    *total = *a+*b;
}
