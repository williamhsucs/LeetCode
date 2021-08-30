#include <stdio.h>
#include <stdbool.h>
#include <limits.h>

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int isBST(struct TreeNode* root, long min, long max) {
    
  if (root == NULL) {
    return 1;
  }

  if ((long)root->val < min || (long)root->val > max) {
    return 0;
  }

  return(isBST(root->left, min, (long)root->val-1) && isBST(root->right, (long)root->val+1, max));  
}


bool isValidBST(struct TreeNode* root){
  if(root == NULL) {
    return 1;
  }

  return isBST(root, INT_MIN, INT_MAX);
}