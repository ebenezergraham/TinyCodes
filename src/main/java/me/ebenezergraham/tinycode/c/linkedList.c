#include <stdio.h>
#include <stdlib.h>

int len = 0;
struct Node* head;

struct Node{
    int data;
    struct Node* next;
};

int size(); // Returns the number of elements in the list.
int isEmpty(); // Returns 0 if the list is empty, and 1 otherwise.
struct Node* first(); // Returns (but does not remove) the first element in the list.
void addFirst(struct Node* e); // Adds a new element to the front of the list.
struct Node* removeFirst(); // Remove first element

int size(){
    return len;
}

int main(void){
    printf("Size: %d\n",size());
    printf("IsEmpty: %d\n",isEmpty());

    return 0;
}

int isEmpty(){
    if(len == 0){
        return 0;
    }
    return 1;
}

struct Node* first(){
    head
}

void addFirst(struct Node* e){
    struct Node *link = (struct Node*) malloc(sizeof(struct Node));
    head->next = e;
}

struct Node* removeFirst(){

}
