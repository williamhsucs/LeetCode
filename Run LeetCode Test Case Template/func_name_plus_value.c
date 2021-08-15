#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

/**
 * Problem
 * https://leetcode.com/problems/design-circular-queue/
 * 
 * Use LeetCode problem 667 Design Circular Queue for example
 * 
 * This template provide you that can copy the LeetCode test case to other place to debug.
 */
typedef struct {
  int* ary;
  int front;
  int rear;
  int size;
} MyCircularQueue;

MyCircularQueue* myCircularQueueCreate();
bool myCircularQueueEnQueue();
bool myCircularQueueDeQueue();
bool myCircularQueueIsEmpty();
bool myCircularQueueIsFull();
int myCircularQueueFront();
int myCircularQueueRear();

int main() {
  
  char* funcAry[102] = {"MyCircularQueue","enQueue","isFull","enQueue","enQueue","isFull","enQueue","enQueue","enQueue","Front","Front","Rear","enQueue","Rear","enQueue","Rear","Front","enQueue","enQueue","Front","enQueue","enQueue","Rear","enQueue","isEmpty","Rear","Front","Rear","enQueue","Front","enQueue","Rear","isEmpty","Rear","enQueue","Front","Front","deQueue","enQueue","Front","enQueue","enQueue","deQueue","enQueue","isFull","Front","enQueue","deQueue","enQueue","isEmpty","isEmpty","enQueue","Front","Front","Rear","deQueue","Front","enQueue","Rear","enQueue","Rear","Rear","Front","deQueue","enQueue","deQueue","Rear","enQueue","Front","enQueue","enQueue","deQueue","enQueue","Front","enQueue","deQueue","enQueue","Front","Front","enQueue","enQueue","enQueue","Front","enQueue","enQueue","Rear","deQueue","enQueue","Front","enQueue","enQueue","Rear","enQueue","enQueue","Rear","isFull","enQueue","Rear","enQueue","deQueue","Rear","enQueue"};

  int valAry[102] = {30,71,0,32,1,0,32,8,6,0,0,0,8,0,3,0,0,56,41,0,14,6,0,25,0,0,0,0,44,0,84,0,0,0,59,0,0,0,4,0,40,11,0,94,0,0,72,0,19,0,0,20,0,0,0,0,0,58,0,54,0,0,0,0,65,0,0,59,0,26,10,0,14,0,2,0,37,0,0,46,63,42,0,84,30,0,0,49,0,79,46,0,97,83,0,0,76,0,79,0,0,44};
  
  int funcArySize = sizeof(funcAry) / sizeof(funcAry[0]);

  for (int i = 0; i < funcArySize; i++) {
    if (strncmp(funcAry[i], "enQueue", 7) == 0) {
      myCircularQueueEnQueue();

    } else if (strncmp(funcAry[i], "deQueue", 7) == 0) {
      myCircularQueueDeQueue();

    } else if (strncmp(funcAry[i], "isEmpty", 7) == 0) {
      myCircularQueueIsEmpty();

    } else if (strncmp(funcAry[i], "isFull", 6) == 0) {
      myCircularQueueIsFull();

    } else if (strncmp(funcAry[i], "Front", 5) == 0) {
      myCircularQueueFront();

    } else if (strncmp(funcAry[i], "Rear", 4) == 0) {
      myCircularQueueRear();
      
    } else if (strncmp(funcAry[i], "MyCircularQueue", 15) == 0) {
      myCircularQueueCreate();
      
    }
  }

  return 0;
}