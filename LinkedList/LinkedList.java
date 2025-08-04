


public class LinkedList {
    private class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }
    }
  private Node head;
    int size = 0;
    private void addHead(int val){
      Node newNode = new Node(val);
      newNode.next = head;
      head = newNode;
      size++;
    }
    private void addTail(int val){
        Node newNode = new Node(val);
         size++;
        if (head == null) {head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
       
    }
    private int get(int index){
        if (index < 0 || index >= size) throw new IllegalStateException("Not possible");
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    private int remove(int index){
        if (index < 0 || index >= size) throw new IllegalStateException("Not possible");
        size--;
        if (index == 0) {
            int val = head.val;
            head = head.next;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        return val;
    }
    private void print(){
        if (head == null) return;
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    private boolean isEmpty(){
        return size == 0;
    }
    private void sortedInsert(int val){
        Node newNode = new Node(val);
        Node temp = head;
        size++;
        if (temp == null || temp.val > val) {
            newNode.next = head;
            head = newNode;
            return;
        }
        
        while (temp.next != null && temp.next.val < val){
            temp = temp.next;
        }
       newNode.next = temp.next;
       temp.next = newNode;
    }
    private void emptyList(){
        head = null;
        size = 0;
    }
    private void reverse(){
        Node temp = head;
        Node next = null;
        Node prev = null;
        while (temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.addHead(23);
        ll.addHead(34);
        ll.addHead(376);
        ll.addTail(67);
        ll.print();
        System.out.println(ll.get(2));
        System.out.println(ll.remove(2));
        ll.print();
        ll.emptyList();
        ll.sortedInsert(45);
        ll.sortedInsert(23);
        ll.sortedInsert(67);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
