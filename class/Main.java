/**
 * Jiaying Yu
 * The Main class demonstrates the functionality of the binary search tree for storing Person objects.
 * It creates a binary search tree, adds ten persons to it, and performs various operations.
 */
public class Main {
    public static void main(String[] args) {
        // Create a new binary search tree to store Person objects
        BinaryTree<Person> familyTree = new BinarySearchTree<>();

        // Check if the tree is empty
        System.out.println("Tree is empty: " + familyTree.isEmpty());
        System.out.println("Add 10 person");

        // Add Person objects to the family tree
        familyTree.add(new Person("Alice", 35, "Software Engineer", "Software Engineer", "Married", "Female", "123 Elm St"));
        familyTree.add(new Person("Bob", 45, "Doctor", "Doctor", "Single", "Male", "456 Maple St"));
        familyTree.add(new Person("Charlie", 50, "Teacher", "Teacher", "Married", "Male", "789 Oak St"));
        familyTree.add(new Person("David", 28, "Designer", "Designer", "Single", "Male", "321 Birch St"));
        familyTree.add(new Person("Eva", 60, "Nurse", "Nurse", "Married", "Female", "654 Willow St"));
        familyTree.add(new Person("Fiona", 18, "Student", "Student", "Single", "Female", "987 Pine St"));
        familyTree.add(new Person("George", 42, "Lawyer", "Lawyer", "Married", "Male", "147 Cherry St"));
        familyTree.add(new Person("Helen", 26, "Accountant", "Accountant", "Single", "Female", "369 Cedar St"));
        familyTree.add(new Person("Igor", 55, "Architect", "Architect", "Divorced", "Male", "951 Apple St"));
        familyTree.add(new Person("Jasmine", 31, "Chef", "Chef", "Married", "Female", "753 Peach St"));

        // Check if the tree is empty and print the tree size
        System.out.println("Tree is empty: " + familyTree.isEmpty());
        System.out.println("Tree size: " + familyTree.size());

        // Find and print the oldest and youngest persons' name
        System.out.println("Oldest person: " + familyTree.findOldest().getName());
        System.out.println("Youngest person: " + familyTree.findYoungest().getName());

        // Calculate and print the gender ratio (Male/Female)
        System.out.printf("Gender ratio (Male/Female): %.2f\n", familyTree.genderRatio());
        System.out.println("Tree representation:");

        // Print the tree representation
        familyTree.printTree();
        /*
         * The leftmost side of the console represents the root of the tree.
         * The rightmost side of the console represents the leaf nodes of the tree.
         * The person with the highest age is located at the top-right of the console (the rightmost leaf node).
         * The person with the lowest age is located at the bottom-left of the console (the leftmost leaf node).
         */

        // Remove a person by name and print the new tree size
        System.out.println("Removing Alice: " + familyTree.removeByName("Alice"));
        System.out.println("New tree size: " + familyTree.size());

        // Print the updated tree representation
        System.out.println("Tree representation:");
        familyTree.printTree();
    }
}
