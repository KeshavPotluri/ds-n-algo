package ds.linked_lists;

public class SingleLinkedList<T> {

  public class Node {
    public T data;
    public Node nextNode;
  }

  public Node head;
  public int size;

  public SingleLinkedList() {
    head = null;
    size = 0;
  }

  public boolean isEmpty() {
    return (head == null);
  }

  public void insertAtHead(T data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.nextNode = this.head;
    this.head = newNode;
    size++;
  }

}
