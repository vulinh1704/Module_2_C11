public class a {
}

class Node<E> {
    Object data;
    Node<E> leftNode = null;
    Node<E> rightNode = null;

    public Node(E data) {
        this.data = data;
    }
}

class BinaryTree<E> {
    Node<E> rootNode;

    public BinaryTree(E data) {
        this.rootNode = new Node<>(data);
    }

    public void addNode(E e) {
        Node<E> newNode = new Node<>(e);
        Node<E> currentNode = rootNode;
        while (currentNode != null) {
            if(newNode.data > currentNode.data){
                currentNode = currentNode.rightNode;
            }
        }
    }
}