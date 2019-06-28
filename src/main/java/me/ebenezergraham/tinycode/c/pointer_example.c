#include <stdio.h>

int main(){
  /*
    declaring a pointer syntax
    type* var_name
  */
  
  int i = 200;
  int* ip = &i; // a pointer to an integer
  int m = 300;
  ip =&m;
  
  // if you do not an address to assign to pointer, use NULL
  double* dp = NULL; // a pointer to a double
  float* fp = NULL; // a pointer to a float
  char* cp = NULL; // a pointer to a char

  // a generic pointer - we can assign the value of any date type
  void* vp = NULL;
  
  double d = 200.0;
  float f = 200.0;
  char c = '2';

  dp = &d; // assign address of i to pointer ip
  fp = &f;
  cp = &c;

  vp = &d; // assign address of double to the generic pointer
  vp = &c; // assign address of char to the generic pointer

  // i evaluates to the value of variable i, 200
  printf("Value assigned to i is %d\n", i);

  // &i evaluates the address of variable i
  printf("Address of i is 0x%x\n", &i);

  // ip is the address assigned to this pointer variable
  printf("Address assigned to ip is 0x%x\n", ip);

  // *ip is the value stored at the address assigned to the pointer ip
  // we call this dereferencing a pointer
  printf("The value in memory address assigned to ip is %d\n", *ip);

  printf("Value assigned to c is %c\n", c);

  printf("Value assigned to f is %f\n", f);

  printf("The value in memory address assigned to ip is 0x%x\n", *vp);

  // TODO Write similar printf lines for the float and char variables

  // TODO try dereferencing the void pointer
  
  return 0;
}
