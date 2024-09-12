
package LinkListUpdated;

import java.util.Scanner;
public class LLdemo {

    public static void main(String[] args) {
        // Make Scanner
        Scanner input = new Scanner(System.in);

        // Other variables
        int choice; // user choice
        int value;  // value to insert, delete, or search for
        // Make a new Linked List called myList i.e. creating an
        //object ‘myList’ of class ‘LinkedList’ in order to access
        //the methods of this class
        LinkedList myList = new LinkedList();

        // Do/while loop showing menu, getting user choice, and
        //performing actions
        do {
            // Show menu and get user choice
            showMenu();
            choice = input.nextInt();

            // INSERT new node into list


            if (choice == 1) {
                System.out.print(">    What value do you want to insert: ");
                value = input.nextInt();

                // First, check to see if value already exists in list. If so, give error message.
                if (myList.search(value)) {
                    System.out.println(">    " + value + " already exists in the list. Duplicates are not allowed.");
                } else {
                    myList.insert(value);
                    System.out.println(">    " + value + " was successfully inserted into the list.");
                }
                System.out.println();
            } // DELETE node from list
            else if (choice == 2) {
                System.out.print(">    What value do you want to delete: ");
                value = input.nextInt();

                // First, check to see if value is actually in the list.
                // IF it is in the list, delete it.
                if (myList.search(value)) {
                    myList.delete(value);
                    System.out.println(">    " + value + " was successfully deleted from the list.");
                } // ELSE, print message stating that no delete is needed (since value is not in the list)
                else {
                    System.out.println(">    " + value + " is not in the list (no delete needed).");
                }
                System.out.println();
            } else if (choice == 3) {
                System.out.print(">    What value do you want to search for: ");
                value = input.nextInt();
                if (myList.search(value)) {
                    System.out.println(">    " + value + " was found in the list.");
                } else {
                    System.out.println(">    " + value + " was not found in the list.");
                }
                System.out.println();
            } else if (choice == 4) {
                if (myList.isEmpty()) {
                    System.out.println(">    Error: cannot print nodes (the list is empty)");
                    System.out.println();
                } else {
                    System.out.println(">    Printing All Nodes:");
                    System.out.print(">    ");
                    myList.PrintList();
                    System.out.println();
                    System.out.println();
                }
            } else if (choice == 5) {
                if (myList.isEmpty()) {
                    System.out.println(">    Error: cannot perform sum (the tree is empty)");
                    System.out.println();
                } else {
                    System.out.println(">    The sum of all nodes is " + myList.sumNodes() + ".");
                    System.out.println();
                }
            } else if (choice == 6) {
                if (myList.isEmpty()) {
                    System.out.println(">    Error: cannot modify nodes (the list is empty)");
                    System.out.println();
                } else {
                    myList.ModifyAllNodes();
                    System.out.println(">    All Nodes Have been modified.");
                    System.out.println();
                }
                } else if (choice == 7) {
                
                if (myList.isEmpty()) {
                    System.out.println(">    Error: cannot count nodes (the list is empty)");
                    System.out.println();
                } else {
                    System.out.println(">    Number of nodes in the linked list is " + myList.countNodes());
                    System.out.println();
                }
                
            } else if (choice == 8) {
                
                if (myList.isEmpty()) {
                    System.out.println(">    Error: cannot print even nodes (the list is empty)");
                    System.out.println();
                } else {
                    System.out.println(">    Printing Even Nodes:");
                    myList.printEvenNodes();
                    System.out.println();
                }
                
            } else if (choice == 9) {
                
                if (myList.isEmpty()) {
                    System.out.println(">    Error: cannot swap first and last nodes (the list is empty)");
                    System.out.println();
                } else {
                    System.out.println(">    First and last nodes has been swapped.");
                    myList.swapFirstLast();
                    System.out.println();
                }
                
            } else if (choice == 10) {
                
                if (myList.isEmpty()) {
                    System.out.println(">    Error: cannot print number of even and odd nodes (the list is empty)");
                    System.out.println();
                } else {
                    myList.countEvenOddNodes();
                    System.out.println();
                }
                
            } else if (choice == 11) {
                
                if (myList.isEmpty()) {
                    System.out.println(">    Error: cannot add new node after specific node (the list is empty)");
                    System.out.println();
                } else {
                    
                    System.out.print("Enter the new node data: ");
                    int data = input.nextInt();
                    
                    myList.addNodeAfter(data);
                    System.out.println();
                }
                
            } else if (choice == 12) {
                
                if (myList.isEmpty()) {
                    System.out.println(">    Error: cannot delete node after specific node (the list is empty)");
                    System.out.println();
                } else {
                    
                    System.out.print("Enter the specific node data: ");
                    int data = input.nextInt();
                    
                    myList.deleteNodeAfter(data);
                    System.out.println();
                }
                
            } else if (choice == 13) {
                System.out.println(">    Goodbye!");
                System.out.println();
            } else {
                System.out.println(">    Wrong selection. Try again.");
                System.out.println();
            }

        } while (choice != 13);
    }
    public static void showMenu() {
        System.out.println("|-------------------------------------------------|");
        System.out.println("|-------      Linked List Demo (Menu)      -------|");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|   1.  Insert an item into the list               |");
        System.out.println("|   2.  Delete an item from the list               |");
        System.out.println("|   3.  Search for an item in the list             |");
        System.out.println("|   4.  Print all nodes in the list                |");
        System.out.println("|   5.  Print the sum of all data values           |");
        System.out.println("|   6.  Modify data values of all nodes            |");
        System.out.println("|   7.  Count number of nodes                      |");
        System.out.println("|   8.  Print all even nodes                       |");
        System.out.println("|   9.  Swap first and last nodes                  |");
        System.out.println("|   10. Print number of even and odd nodes and    |");
        System.out.println("|   11. Add new node after specific node          |");
        System.out.println("|   12. Delete node after specific node           |");
        System.out.println("|   13. Quit                                      |");
        System.out.println("|-------------------------------------------------|");
        System.out.println();
        System.out.print("> Please enter your choice: ");
    }
}
