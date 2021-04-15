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

}
