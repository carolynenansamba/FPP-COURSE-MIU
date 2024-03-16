package DATASTRUCTURES;
public class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {root = null;}

    BinarySearchTree(int val) {root = new TreeNode(val);}

    public TreeNode search(TreeNode node, int target) {
        if (node == null) {
            return null;
        } else if (node.val == target) {
            return node;
        }
        if (target < node.val) {
            return search(node.left, target);
        }
        return search(node.right, target);
    }

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            insertRec(root, val);
        }
    }

    public TreeNode insertRec(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }
        if (node.val < val) {
            node.right = insertRec(node.right, val);
        } else {
            node.left = insertRec(node.left, val);
        }
        return node;
    }

//    public void inOrder(){
//        inorderTraverse(root);
//    }

    public void inorderTraverse(TreeNode node) {
        if (node != null) {
            inorderTraverse(node.left);
            System.out.println(node.val + " ");
            inorderTraverse(node.right);
        }
    }

    public void preOrderTraverse(TreeNode node) {
        if (node != null) {
            System.out.println(node.val + " ");
            preOrderTraverse(node.left);
            preOrderTraverse(node.right);

        }
    }

    public void postOrderTraverse(TreeNode node) {
        if (node != null) {
            postOrderTraverse(node.left);
            postOrderTraverse(node.right);
            System.out.println(node.val + " ");
        }
    }

    public TreeNode deleteNode(TreeNode node, int key) {
        if (node == null) {
            return node;
        }
        //delete current node if root is the target value
        if (node.val == key) {
            //replace root with root->right if root -> left is null
            if (node.left == null) {
                return node.right;
            }
            //replace root with root->left if root->right is null
            if (node.right == null) {
                return node.left;
            }

            //replace root with its successorif root has 2 children
            TreeNode p = findSuccessor(node);
            node.val = p.val;
            node.right = deleteNode(node.right, p.val);
            return node;
        }

        if (node.val == key) {// find the target in the right subtree if root->val is key
            node.right = deleteNode(node.right, key);

        } else {
            node.left = deleteNode(node.left, key);
        }
        return node;
    }

    private TreeNode findSuccessor(TreeNode node) {
        TreeNode cur = node.right;
        while (cur != null && cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(12);
        tree.insert(7);
        tree.insert(6);
        tree.insert(3);
        tree.insert(1);
        tree.insert(4);
        tree.insert(9);
        tree.insert(6);
        tree.insert(10);
//        tree.search(root, 55);

        System.out.println(tree.toString());
    }
}

