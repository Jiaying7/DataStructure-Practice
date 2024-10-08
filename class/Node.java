/**
 * Q3.C.
 * Jiaying Yu
 * A generic Node class for a binary tree.
 * The class is parameterized with a type T which must implement the Comparable<T> interface.
 * This ensures that the Node class can store any type that implements Comparable, providing
 * type safety and code reusability.
 *
 * @param <T> The type of the value stored in the Node, which must implement Comparable<T>
 */
public class Node<T extends Comparable<T>> {
    T value; // The value stored in the Node
    Node<T> left; // Reference to the left child Node
    Node<T> right; // Reference to the right child Node

    /**
     * Constructor for the Node class.
     * Initializes the value, and sets the left and right child Nodes to null.
     *
     * @param value The value to be stored in the Node
     */
    public Node(T value) {
        this.value = value;
        left = null;
        right = null;
    }
}
