package BinaryST;

public class Main {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new Node(5));
        bst.insert(new Node(1));
        bst.insert(new Node(9));
        bst.insert(new Node(2));
        bst.insert(new Node(4));
        bst.insert(new Node(3));
        bst.insert(new Node(7));


        bst.remove(5);
        bst.display();

    }
}
