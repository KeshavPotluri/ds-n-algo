package ds.linked_lists;

import javax.swing.event.MenuKeyEvent;

import ds.linked_lists.SingleLinkedList.Node;

public class SingleLinkedListTest {
  public static void main(String[] args) {
    SingleLinkedList<Integer> myList = new SingleLinkedList<Integer>();
    printList(myList);

    myList.insertAtHead(1);
    myList.insertAtHead(4);
    printList(myList);
  }

  private static <T> void printList(SingleLinkedList<T> myList) {
    if(myList.isEmpty()) {
      System.out.println("The list is Empty!");
      return;
    }

    Node node = myList.head;

    while(node != null) {
      System.out.print(node.data.toString() + " ");
      node = node.nextNode;
    }

    System.out.println("null");
  }
}
