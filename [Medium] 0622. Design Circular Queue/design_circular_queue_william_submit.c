/**
 * Problem
 * https://leetcode.com/problems/design-circular-queue/
 * 
 * Input
 *   ["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
 *   [[3], [1], [2], [3], [4], [], [], [], [4], []]
 * Output
 *   [null, true, true, true, false, 3, true, true, true, 4]
 * 
 * Explanation
 * MyCircularQueue myCircularQueue = new MyCircularQueue(3);
 * myCircularQueue.enQueue(1); // return True
 * myCircularQueue.enQueue(2); // return True
 * myCircularQueue.enQueue(3); // return True
 * myCircularQueue.enQueue(4); // return False
 * myCircularQueue.Rear();     // return 3
 * myCircularQueue.isFull();   // return True
 * myCircularQueue.deQueue();  // return True
 * myCircularQueue.enQueue(4); // return True
 * myCircularQueue.Rear();     // return 4
 * 
 * *************************************************************
 * Queues (FIFO)
 * 
 * Time complexity: O(1)
 *  enQueue: O(1)
 *  deQueue: O(1)
 *  peek: O(1)
 * Space complexity: O(n)
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

typedef struct {
  int* ary;
  int front;
  int rear;
  int size;
} MyCircularQueue;

MyCircularQueue* myCircularQueueCreate(int k) {
  MyCircularQueue* obj = (MyCircularQueue*)calloc(1, sizeof(MyCircularQueue));
  obj->ary = (int*)calloc(k, sizeof(int));
  obj->front = -1;
  obj->rear = -1;
  obj->size = k;
  printf("create\n");
  return obj;
}

int myCircularQueueFront(MyCircularQueue* obj) {
  if (obj->front < 0) {
    return -1;
  }
  return obj->ary[obj->front];
  //return obj->front; //return front position
}

int myCircularQueueRear(MyCircularQueue* obj) {
  if (obj->rear < 0) {
    return -1;
  }
  return obj->ary[obj->rear];
  //return obj->rear; // return rear position
}

bool myCircularQueueIsEmpty(MyCircularQueue* obj) {
  if ((obj->front < 0) && (obj->rear < 0)) {
    return true;
  }
  return false;
}

bool myCircularQueueIsFull(MyCircularQueue* obj) {
  if (((obj->rear + 1) == obj->front) || ((obj->front < obj->rear) && (obj->front == 0) && (obj->rear + 1 == obj->size)) || (obj->size == 1)) {
    return true;
  }
  return false;
}

bool myCircularQueueEnQueue(MyCircularQueue* obj, int value) {
  if (myCircularQueueIsEmpty(obj)) {
    obj->front = 0;
    obj->rear = 0;
    obj->ary[0] = value;
    printf("enQueue\n");
    return true;
  } else if (myCircularQueueIsFull(obj)) {
    printf("can't enQueue\n");
    return false;
  } else {
    if ((obj->rear + 1) == obj->size) {
      obj->rear = 0;
    } else {
      obj->rear++;
    }
    obj->ary[obj->rear] = value;
    printf("enQueue\n");
    return true;
  }
}

bool myCircularQueueDeQueue(MyCircularQueue* obj) {
  if (myCircularQueueIsEmpty(obj)) {
    printf("can't dnQueue\n");
    return false;
  } else if (obj->front == obj->rear) {
    obj->ary[obj->front] = 0;
    obj->front = -1;
    obj->rear = -1;
    printf("deQueue\n");
    return true;
  } else {
    obj->ary[obj->front] = 0;
    if ((obj->front + 1) == obj->size) {
      obj->front = 0;
    } else {
      obj->front++;
    }
    printf("deQueue\n");
    return true;
  }
}

void myCircularQueueFree(MyCircularQueue* obj) {
    free(obj);
}

/**
 * Your MyCircularQueue struct will be instantiated and called as such:
 * MyCircularQueue* obj = myCircularQueueCreate(k);
 * bool param_1 = myCircularQueueEnQueue(obj, value);
 
 * bool param_2 = myCircularQueueDeQueue(obj);
 
 * int param_3 = myCircularQueueFront(obj);
 
 * int param_4 = myCircularQueueRear(obj);
 
 * bool param_5 = myCircularQueueIsEmpty(obj);
 
 * bool param_6 = myCircularQueueIsFull(obj);
 
 * myCircularQueueFree(obj);
*/

void show(MyCircularQueue* obj) {
  for (int i = 0; i < obj->size; i++) {
    if (i == obj->front && i == obj->rear) {
      printf(" fr ");
    } else if (i == obj->front) {
      printf(" f  ");
    } else if (i == obj->rear) {
      printf(" r  ");
    } else {
      printf("    ");
    }
  }
  printf("\n");
  for (int i = 0; i < obj->size; i++) {
    printf("[%02d]",i);
  }
  printf("\n");
  for (int i = 0; i < obj->size; i++) {
    if (obj->ary[i] == 0) {
      printf("[  ]");
    } else {
      printf("[%02d]", obj->ary[i]);
    }
  }
  printf("\n");
}

void showAll(MyCircularQueue* obj) {
  show(obj);
  printf("front val:%d\n", myCircularQueueFront(obj));
  printf("rear val:%d\n", myCircularQueueRear(obj));
  printf("Full:%d\n", myCircularQueueIsFull(obj));
  printf("empty:%d\n", myCircularQueueIsEmpty(obj));
  printf("\n");
}

int main() {
  MyCircularQueue* obj;
  
  char* funcAry[102] = {"MyCircularQueue","enQueue","isFull","enQueue","enQueue","isFull","enQueue","enQueue","enQueue","Front","Front","Rear","enQueue","Rear","enQueue","Rear","Front","enQueue","enQueue","Front","enQueue","enQueue","Rear","enQueue","isEmpty","Rear","Front","Rear","enQueue","Front","enQueue","Rear","isEmpty","Rear","enQueue","Front","Front","deQueue","enQueue","Front","enQueue","enQueue","deQueue","enQueue","isFull","Front","enQueue","deQueue","enQueue","isEmpty","isEmpty","enQueue","Front","Front","Rear","deQueue","Front","enQueue","Rear","enQueue","Rear","Rear","Front","deQueue","enQueue","deQueue","Rear","enQueue","Front","enQueue","enQueue","deQueue","enQueue","Front","enQueue","deQueue","enQueue","Front","Front","enQueue","enQueue","enQueue","Front","enQueue","enQueue","Rear","deQueue","enQueue","Front","enQueue","enQueue","Rear","enQueue","enQueue","Rear","isFull","enQueue","Rear","enQueue","deQueue","Rear","enQueue"};

  int valAry[102] = {30,71,0,32,1,0,32,8,6,0,0,0,8,0,3,0,0,56,41,0,14,6,0,25,0,0,0,0,44,0,84,0,0,0,59,0,0,0,4,0,40,11,0,94,0,0,72,0,19,0,0,20,0,0,0,0,0,58,0,54,0,0,0,0,65,0,0,59,0,26,10,0,14,0,2,0,37,0,0,46,63,42,0,84,30,0,0,49,0,79,46,0,97,83,0,0,76,0,79,0,0,44};

  int funcArySize = sizeof(funcAry) / sizeof(funcAry[0]);

  for (int i = 0; i < funcArySize; i++) {
    if (strncmp(funcAry[i], "enQueue", 7) == 0) {
      myCircularQueueEnQueue(obj, valAry[i]);

    } else if (strncmp(funcAry[i], "deQueue", 7) == 0) {
      myCircularQueueDeQueue(obj);

    } else if (strncmp(funcAry[i], "isEmpty", 7) == 0) {
      printf("Is Empty:%s\n", myCircularQueueIsEmpty(obj) ? "true" : "false");

    } else if (strncmp(funcAry[i], "isFull", 6) == 0) {
      printf("Is Full:%s\n", myCircularQueueIsFull(obj) ? "true" : "false");

    } else if (strncmp(funcAry[i], "Front", 5) == 0) {
      printf("Front Value:%d\n", obj->ary[myCircularQueueFront(obj)]);

    } else if (strncmp(funcAry[i], "Rear", 4) == 0) {
      printf("Rear Value:%d\n", obj->ary[myCircularQueueRear(obj)]);
      
    } else if (strncmp(funcAry[i], "MyCircularQueue", 15) == 0) {
      obj = myCircularQueueCreate(valAry[i]);
      
    }
    showAll(obj);
  }

  
  return 0;
}