package tree;


public class BinarySearchTree {

    public static void main(String[] args) {
        BSTNode root = insert(15, null);
        BSTNode node20 = insert(20, root);
        BSTNode node10 = insert(10, root);
        BSTNode node8 = insert(8, root);
        BSTNode node12 = insert(17, root);
        BSTNode node25 = insert(25, root);
        BSTNode node27 = insert(27, root);
        BSTNode node29 = insertIterative(root, 29);

        System.out.println(search(root, 27));
        System.out.println(searchIterative(root, 15));

    }

    private static BSTNode insertIterative(BSTNode root, int data) {
        if (root == null) {
            return new BSTNode(data);
        }
        while (root != null) {
            if (data < root.val && root.left != null) {
                root = root.left;
            }

            if (data > root.val && root.right != null) {
                root = root.right;
            }
        }

        if (data < root.val) {
            root.left = new BSTNode(data);
        }

        if (data > root.val) {
            root.right = new BSTNode(data);
        }

        return root;
    }

    private static boolean searchIterative(BSTNode root, int data) {
        while (root != null) {
            if (root.val == data) {
                return true;
            }
            if (data < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return false;
    }

    private static BSTNode insert(int data, BSTNode root) {
        if (root == null) {
            return new BSTNode(data);
        } else if (data < root.val) {
            root.left = insert(data, root.left);
        } else {
            root.right = insert(data, root.right);
        }
        return root;
    }


    private static boolean search(BSTNode root, int i) {
        if (root == null) {
            return false;
        } else if (i < root.val) {
            return search(root.left, i);
        } else if (i > root.val) {
            return search(root.right, i);
        } else {
            return true;
        }
    }
}
