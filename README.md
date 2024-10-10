Data Structure Practice
This repository contains Java implementations of common data structures, specifically focusing on a Binary Search Tree (BST) to store and manage Person objects. The project demonstrates how to implement a binary tree, perform operations like adding, removing, and searching for nodes, and calculate the gender ratio based on the stored data.

Project Structure
BinarySearchTree.java: Implements the Binary Search Tree (BST) data structure using generic types and the Comparable interface to store elements in sorted order.
BinaryTree.java: Defines the basic operations for a binary tree through an interface, providing methods such as add(), findOldest(), findYoungest(), and genderRatio().
Node.java: A generic class that represents the nodes of the binary tree, storing the value and references to left and right child nodes.
Person.java: A class representing a person with attributes such as name, age, gender, occupation, and address. It implements the Comparable interface to allow comparison based on age.
Main.java: Demonstrates the use of the Binary Search Tree by adding multiple Person objects and performing various tree operations, such as finding the oldest and youngest people, calculating the gender ratio, and removing a person by name.
Features
Add Elements: Insert Person objects into the tree, maintaining the binary search tree properties.
Find Oldest/Youngest: Traverse the tree to find the oldest and youngest Person objects.
Gender Ratio Calculation: Calculates the male-to-female ratio based on the Person objects stored in the tree.
Remove by Name: Remove a Person from the tree by their name, updating the tree structure accordingly.
Tree Printing: Visual representation of the tree structure with indentation for clarity.

How to run:
1. Clone the Repository: git clone https://github.com/Jiaying7/DataStructure-Practice.git

2. Navigate to the Directory: cd DataStructure-Practice/class/out/production/ds
3. Compile and Run: Compile the Java files and run the Main class to execute the project.
   javac Main.java
   java Main
