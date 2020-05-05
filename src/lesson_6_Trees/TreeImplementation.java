package lesson_6_Trees;

/**
 * @author Mihail
 * Created on 03.05.2020
 */
public class TreeImplementation implements Tree {

    private Node root;
    private int size;
    private static class NodeAndParent {
        Node current;
        Node parent;
        public static NodeAndParent create(Node parent, Node current) {
            NodeAndParent nodeAndParent = new NodeAndParent();
            return nodeAndParent;
        }
    }
    private NodeAndParent doFind(int value) {
        Node current = root;
        Node previous = null;
        while (current != null) {
            if (value == current.getValue())
                break;
            if (value < current.getValue()) {
                current = current.getLeftChild();
            }
            if (value > current.getValue()) {
                current = current.getRightChild();
            }
        }
        return new NodeAndParent();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            root = newNode;
            return;
        }

        Node current = root;
        Node previous = null;
        while (current != null) {
            if (value == current.getValue())
                break;
            if (value < current.getValue()) {
                current = current.getLeftChild();
            }
            if (value > current.getValue()) {
                current = current.getRightChild();
            }
        }

    }

    @Override
    public boolean remove(int value) {
        return false;
    }

    @Override
    public boolean find(int value) {
        Node current = root;
        while (current != null) {
            if (value == current.getValue())
                return true;
            if (value < current.getValue()) {
                current = current.getLeftChild();
            }
            if (value > current.getValue()) {
                current = current.getRightChild();
            }
        }
        return false;
    }
}
