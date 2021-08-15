/**
 * Problem
 * https://leetcode.com/problems/design-linked-list/
 * 
 * Input:
 * ["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
 * [[], [1], [3], [1, 2], [1], [1], [1]]
 * 
 * Output:
 * [null, null, null, null, 2, null, 3]
 * 
 * Explanation
 * MyLinkedList myLinkedList = new MyLinkedList();
 * myLinkedList.addAtHead(1);
 * myLinkedList.addAtTail(3);
 * myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
 * myLinkedList.get(1);              // return 2
 * myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
 * myLinkedList.get(1);              // return 3
 * 
 * *************************************************************
 * Time complexity:
 * prepend -> O(1)
 * append -> O(1)
 * search -> O(n)
 * insert -> O(n)
 * delete -> O(n)
 * Worst case:
 * prepend and append only need to use head or tail to add the nodes. O(1)
 * insert and delete need to use search to find the index. O(n)
 * *************************************************************
 */

#include <stdio.h>
#include <stdlib.h>

typedef struct node_s {
  int val;
  struct node_s* next; 
} node_t;

typedef struct {
  int size;
  node_t* head;
  node_t* tail;
} MyLinkedList;

node_t* createNode(int val, node_t* next) {
  node_t* node = calloc(1, sizeof(node_t));
  node->val = val;
  node->next = next;
  return node;
}

/** Initialize your data structure here. */

MyLinkedList* myLinkedListCreate() {
  return calloc(1, sizeof(MyLinkedList));
}

/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
int myLinkedListGet(MyLinkedList* obj, int index) {
  if (index >= obj->size) {
    return -1;
  }

  node_t* node = obj->head;

  for (int i = 0; i < index; ++i) {
    node = node->next;
  }
  return node->val;
}

/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
void myLinkedListAddAtHead(MyLinkedList* obj, int val) {
  node_t* node = createNode(val, obj->head);
  obj->head = node;
  obj->size++;
  if (obj->size == 1) {
    obj->tail = obj->head;
  }
}

/** Append a node of value val to the last element of the linked list. */
void myLinkedListAddAtTail(MyLinkedList* obj, int val) {
  node_t* node = createNode(val, NULL);
  if (obj->tail) {
    /**  head           tail           node
     * --------       --------       --------
     * |  val |   --> |  val |   --> |  val |
     * |------|  /    |------|  /    |------|
     * | next | /     | next | /     | NULL |
     * --------       --------       --------
     */
    obj->tail->next = node;
    /**  head                          tail
     * --------       --------       --------
     * |  val |   --> |  val |   --> |  val |
     * |------|  /    |------|  /    |------|
     * | next | /     | next | /     | NULL |
     * --------       --------       --------
     */
    obj->tail = node;
    obj->size++;
  } else {
    myLinkedListAddAtHead(obj, val);
  }
}

/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
void myLinkedListAddAtIndex(MyLinkedList* obj, int index, int val) {
  if (index > obj->size) {
    return;
  } else if (index == obj->size) {
    myLinkedListAddAtTail(obj, val);
  } else if (index == 0) {
    myLinkedListAddAtHead(obj, val);
  } else {
    node_t* node = obj->head;
    // Start from 1, because we already give the head for first node. First node is index 0.
    for (int i = 1; i < index; ++i) {
      node = node->next;
    }
    node->next = createNode(val, node->next);
    obj->size++;
  }
}

/** Delete the index-th node in the linked list, if the index is valid. */
void myLinkedListDeleteAtIndex(MyLinkedList* obj, int index) {
  if (index >= obj->size) {
    return;
  } else {
    node_t* rm = obj->head;
    node_t* prev = obj->head;

    if (index == 0) {
      obj->head = rm->next;
      free(rm);
    } else if (index == (obj->size - 1)) {
      while(rm->next != obj->tail) {
        rm = rm->next;
      }
      obj->tail = rm;
      free(rm->next);
    } else {
      for (int i = 1; i < index; ++i) {
        prev = prev->next;
      }
      rm = prev->next;
      prev->next = rm->next;
      free(rm);
    }
    obj->size--;
  }
}

void myLinkedListFree(MyLinkedList* obj) {
    free(obj);
}

/**
 * Your MyLinkedList struct will be instantiated and called as such:
 * MyLinkedList* obj = myLinkedListCreate();
 * int param_1 = myLinkedListGet(obj, index);
 
 * myLinkedListAddAtHead(obj, val);
 
 * myLinkedListAddAtTail(obj, val);
 
 * myLinkedListAddAtIndex(obj, index, val);
 
 * myLinkedListDeleteAtIndex(obj, index);
 
 * myLinkedListFree(obj);
*/

int main() {
  MyLinkedList* obj = myLinkedListCreate();
  return 0;
}