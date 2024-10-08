/**
 * Jiaying Yu
 * The BinarySearchTree class implements the BinaryTree interface using a binary search tree data structure.
 * It allows storing elements of type T, which must implement the Comparable interface for comparison.
 * The binary search tree maintains the elements in sorted order based on their natural ordering.
 */
public class BinarySearchTree<T extends Comparable<T>> implements BinaryTree<T> {
    private Node<T> root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    // Checks if the tree is empty
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    // Adds a new value to the tree
    @Override
    public void add(T value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            addRecursive(root, value);
        }
        size++;
    }

    // Helper method for adding a new value recursively
    private Node<T> addRecursive(Node<T> current, T value) {
        if (current == null) {
            return new Node<>(value);
        }

        if (value.compareTo(current.value) < 0) {
            current.left = addRecursive(current.left, value);
        } else if (value.compareTo(current.value) > 0) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    // Returns the size of the tree
    @Override
    public int size() {
        return size;
    }

    // Finds the oldest person in the tree
    @Override
    public T findOldest() {
        if (isEmpty()) {
            return null;
        }

        Node<T> current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    // Finds the youngest person in the tree
    @Override
    public T findYoungest() {
        if (isEmpty()) {
            return null;
        }

        Node<T> current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    // Calculates the gender ratio (male / female) in the tree
    @Override
    public double genderRatio() {
        int[] counts = genderCounts(root);
        return (double) counts[0] / counts[1];
    }

    // Helper method for counting genders recursively
    private int[] genderCounts(Node<T> current) {
        if (current == null) {
            return new int[]{0, 0};
        }

        int[] leftCounts = genderCounts(current.left);
        int[] rightCounts = genderCounts(current.right);

        int maleCount = leftCounts[0] + rightCounts[0];
        int femaleCount = leftCounts[1] + rightCounts[1];

        if (((Person) current.value).getGender().equalsIgnoreCase("male")) {
            maleCount++;
        } else {
            femaleCount++;
        }

        return new int[]{maleCount, femaleCount};
    }

    // Removes a person from the tree by their name
    public boolean removeByName(String name) {
        if (isEmpty()) {
            return false;
        }
        int initialSize = size;
        root = removeByNameRecursive(root, name);
        return size < initialSize;
    }

    // Helper method for removing a person by name recursively
    private Node<T> removeByNameRecursive(Node<T> current, String name) {
        if (current == null) {
            return null;
        }

        Person person = (Person) current.value;
        if (person.getName().equals(name)) {
            size--;
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.right == null) {
                return current.left;
            } else if (current.left == null) {
                return current.right;
            } else {
                T smallestValue = findSmallestValue(current.right);
                current.value = smallestValue;
                current.right = removeByNameRecursive(current.right, ((Person) smallestValue).getName());
                size++;
                return current;
            }
        }
        current.left = removeByNameRecursive(current.left, name);
        current.right = removeByNameRecursive(current.right, name);
        return current;
    }

    // Helper method for finding the smallest value in a subtree
    private T findSmallestValue(Node<T> current) {
        if (current.left == null) {
            return current.value;
        }
        return findSmallestValue(current.left);
    }

    // Prints the tree with indentation representing the tree structure
    @Override
    public void printTree() {
        printTreeRecursive(root, 0);
    }

    // Helper method for printing the tree recursively
    private void printTreeRecursive(Node<T> current, int depth) {
        if (current == null) {
            return;
        }

        // Print the right subtree
        printTreeRecursive(current.right, depth + 1);

        // Print the current node value with appropriate indentation
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println(current.value);

        // Print the left subtree
        printTreeRecursive(current.left, depth + 1);
    }

}
