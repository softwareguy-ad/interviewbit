package tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTreePractice {

    public static void main(String[] args) {

    /*
                           15
                       /        \
                      10        25
                     /  \      /  \
                    8   12   20  27
                   /                \
                  1                 30

     */


        /*
         | right left root
        root
        root.left =
         */


        BSTNode root = null;
        root = insertNode(root, 15);
        insertNode(root, 10 );
        insertNode(root, 8);
        insertNode(root, 12);
        insertNode(root, 1);
        insertNode(root, 25);
        insertNode(root, 20);
        insertNode(root, 27);
        insertNode(root, 30);
        insertNode(root, 29);

        System.out.println(searchElement(root, 1) ? "Found" : "Not found");
        BSTNode node = search(root, 40);
        if(node !=null){
            System.out.println("found Element: " + node.val);
        } else {
            System.out.println("Element not found!");
        }
        System.out.println("------------------------");
        System.out.println("Height of a binary tree :: "+ findHeight(root));
        System.out.println("Height of a binary tree :: "+ height(root));
        preOrder(root);

        List<Integer> newList = new ArrayList<>();
        System.out.println(inOrder(root, newList));
        //System.out.println(levelOrder(root));;
    }

    private static boolean searchElement(BSTNode root, int i) {
        if(root == null){
            return false;
        } else if(i < root.val) {
           return searchElement(root.left, i);
        } else if (i > root.val) {
           return searchElement(root.right, i);
        } else {
            return true;
        }
    }

    private static BSTNode insertNode(BSTNode root, int i) {
        // If an empty tree
        if (root != null)
            System.out.println("Inserting a element : " + i + " and node at " + root.val);
        if (root == null) {
            System.out.println("Inserting a element : " + i + "\t" + " is constructed");
            return new BSTNode(i);
        } else if (i < root.val) {
            root.left = insertNode(root.left, i);
            System.out.println("Inserting a element : " + i + "\t" + "on left is completed");
        } else {
            root.right = insertNode(root.right, i);
            System.out.println("Inserting a element : " + i + "\t" + "on right is completed");
        }
        System.out.println("returning root : " + root.val);
        return root;
    }

    /*
                           15
                       /        \
                      10        25 |
                     /  \      /  \
                    8   12   20   27 |
                   /                \
                  1                 30 |
                                   /
                                  29

     */


    // 15 10 8 1 12 25 20 27 30 29
    public static void preOrder(BSTNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val + "\t");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 1 8 10 12 15 20 25 27 29 30
    private static List<Integer> inOrder(BSTNode root, List<Integer> ls) {
        if (root == null) {
            return List.of();
        }
        inOrder(root.left, ls);
        ls.add(root.val);
        inOrder(root.right, ls);
        return ls;
    }

    private static int height(BSTNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    private static int findHeight(BSTNode root) {
        if (root == null) {
            return 0;
        } else {
            return heightRec(root, 0);
        }
    }

    private static int heightRec(BSTNode root, int i) {
        if (root == null) {
            return i - 1;
        } else if (root.left == null && root.right == null) {
            return i;
        } else {
            int left = 0, right = 0;
            if (root.left != null) {
                left = Math.max(i, heightRec(root.left, i + 1));
            }
            if (root.right != null) {
                right = Math.max(i, heightRec(root.right, i + 1));
            }
            return Math.max(left, right);
        }
    }

    private static BSTNode search(BSTNode root, int d){
        if(root == null) {
            return null;
        } else if (d < root.val) {
           return search(root.left, d);
        } else if (d > root.val){
           return search(root.right, d);
        } else {
            return root;
        }
    }

    private static List<List<Integer>> levelOrder(BSTNode root) {
        if (root == null) {
            System.out.print("Tree is empty");
            return List.of();
        } else {
            Queue<BSTNode> q = new LinkedList<>();
            q.add(root);
            q.add(new BSTNode(1000));
            List<List<Integer>> ls =  new ArrayList<>();
            List<Integer> innerLs = new ArrayList<>();
            while (!q.isEmpty()) {
                BSTNode head = q.poll();
                System.out.println(head.val + "\t");
                if(head.val == 1000 && !q.isEmpty() ){
                    //q.poll();
                    ls.add(innerLs);
                    innerLs = new ArrayList<>();
                    q.add(new BSTNode(1000));
                } else {
                    innerLs.add(head.val);
                    if (head.left != null) {
                        q.add(head.left);
                    }
                    if (head.right != null) {
                        q.add(head.right);
                    }
                }
            }
            innerLs.remove(innerLs.size() -1);
            ls.add(innerLs);
            return ls;
        }
    }

}
