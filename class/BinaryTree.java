/**
 * A generic BinaryTree interface that defines the basic operations for a binary tree.
 * The interface is parameterized with a type T which must implement the Comparable<T> interface.
 * This ensures that the BinaryTree interface can work with any type that implements Comparable,
 * providing type safety and code reusability.
 *
 * @param <T> The type of the values stored in the BinaryTree, which must implement Comparable<T>
 */
public interface BinaryTree<T extends Comparable<T>> {
    /**
     * Checks if the binary tree is empty.
     *
     * @return true if the tree is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Adds a value to the binary tree.
     *
     * @param value The value to be added
     */
    void add(T value);
    /**
     * Returns the number of elements in the binary tree.
     *
     * @return The size of the binary tree
     */
    int size();

    /**
     * Finds the oldest person in the binary tree.
     *
     * @return The oldest person
     */
    T findOldest();

    /**
     * Finds the youngest person in the binary tree.
     *
     * @return The youngest person
     */
    T findYoungest();

    /**
     * Calculates the gender ratio (Male/Female) in the binary tree.
     *
     * @return The gender ratio
     */
    double genderRatio();

    /**
     * Removes a person from the binary tree by their name, if they exist.
     *
     * @param name The name of the person to be removed
     * @return true if the person was removed, false otherwise
     */
    boolean removeByName(String name);

    /**
     * Prints the binary tree representation, typically in an indented format.
     */
    void printTree();
}
