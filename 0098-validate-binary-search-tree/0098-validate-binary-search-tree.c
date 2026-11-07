/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

 bool validate(struct TreeNode* node, long long lower, long long upper) {
    // An empty tree is a valid BST
    if (node == NULL) {
        return true;
    }
    
    // The current node's value must be strictly between lower and upper
    if (node->val <= lower || node->val >= upper) {
        return false;
    }
    
    // Recursively validate left and right subtrees with updated bounds
    return validate(node->left, lower, node->val) && 
           validate(node->right, node->val, upper);
}

bool isValidBST(struct TreeNode* root) {
    return validate(root, LLONG_MIN, LLONG_MAX);
}