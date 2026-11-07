/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

 struct TreeNode* helper(int* nums, int left, int right) {
    // Base case: if left pointer crosses right, return NULL
    if (left > right) {
        return NULL;
    }
    
    // Find the middle index
    int mid = left + (right - left) / 2;
    
    struct TreeNode* node = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    node->val = nums[mid];
    
    node->left = helper(nums, left, mid - 1);
    node->right = helper(nums, mid + 1, right);
    
    return node;
}

struct TreeNode* sortedArrayToBST(int* nums, int numsSize) {
    return helper(nums, 0, numsSize - 1);
}
