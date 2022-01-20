class Node{
    int data;
    Node left,right;

    void insertNode(int value){
        if (data == value)
            return;

        if (data > value){
            if (left == null)
                left = new Node(value);
            else
                left.insertNode(value);
        }
        else {
            if (right == null)
                right = new Node(value);
            else
                right.insertNode(value);
        }
    }

    void inorderTraversal(){
        if (left != null)
            left.inorderTraversal();
        System.out.print(data + " ");
        if (right!=null)
            right.inorderTraversal();
    }

    void preorderTraversal(){
        System.out.print(data + " ");
        if (left != null)
            left.inorderTraversal();
        if (right!=null)
            right.inorderTraversal();
    }

    void postorderTraversal(){
        if (left != null)
            left.inorderTraversal();
        if (right!=null)
            right.inorderTraversal();
        System.out.print(data + " ");
    }

    public Node(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
}
class Tree{
    Node root;
    void insert(int value){
        if (root == null)
            root = new Node(value);
        else{
            root.insertNode(value);
        }
    }
    void deletion(int value){
        root = delete(root, value);
    }
    Node delete(Node root,int value){
        if (root == null)
            return root;

        if (value < root.data){
            root.left = delete(root.left,value);
        }
        else if(value > root.data){
            root.right = delete(root.right,value);
        }
        else {
            if (root.left == null) {
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.data = min(root.right);
            root.right = delete(root.right,value);
        }
        return root;
    }
    int min(Node root){
        int min = root.data;
        while (root.left != null){
            min = root.data;
            root = root.left;
        }
        return min;
    }
    void inorder(){
        if(root!=null)
            root.inorderTraversal();
    }
    void preorder(){
        if (root!=null)
            root.preorderTraversal();
    }
    void postorder(){
        if (root!=null)
            root.postorderTraversal();
    }

}
public class BinSearchTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.deletion(22);
        tree.deletion(25);

        System.out.println("Inorder Traversal: ");
        tree.inorder();
        System.out.println("\nPreorder Traversal: ");
        tree.preorder();
        System.out.println("\nPostorder Traversal: ");
        tree.postorder();
    }
}

