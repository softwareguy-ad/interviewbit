package tree;

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

        BSTNode root = null;
        root = insertNode(root, 15);
        insertNode(root, 10);
        insertNode(root, 8);
        insertNode(root, 12);
        insertNode(root, 1);
        insertNode(root, 25);
        insertNode(root, 20);
        insertNode(root, 27);
        insertNode(root, 30);

        System.out.println(searchElement(root, 1) ? "Found" : "Not found");
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
        //If a empty tree
        if(root != null)
          System.out.println("Inserting a element : "+ i + " and node at " + root.val  );
        if(root == null){
            System.out.println("Inserting a element : "+ i + "\t" + " is constructed");
            return new BSTNode(i);
        } else if (i < root.val) {
           root.left = insertNode(root.left, i);
            System.out.println("Inserting a element : "+ i + "\t" + "on left is completed");
        } else {
            root.right = insertNode(root.right, i);
            System.out.println("Inserting a element : "+ i + "\t" + "on right is completed");
        }
        System.out.println("returning root : "+ root.val);
        return root;
    }
}
