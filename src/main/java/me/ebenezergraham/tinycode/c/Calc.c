#include <stdio.h>

int f(int x, int y);
int g(int x, int y);
double h(double x, double y);

int main(){
    int result=f(2,g(2,3));
    printf("Result %d\n", result);
    return 0;
}

int f(int x, int y){
    return x*y;
}

int g(int x, int y){
    return x+y;
}

void h(){
    int x = 0;
    if(x){
        printf("true");
    }else if(x==2){
        printf("var is 2");
    }else
}
