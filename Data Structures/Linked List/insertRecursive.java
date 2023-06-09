import java.util.Scanner;

public class insertRecursive {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        head = recursiveInsertLL(head, 2, 10);
        recursivePrintLL(head);
    }

    // insert a ndoe inside a linked list recursively
    public static node<Integer> recursiveInsertLL(node<Integer> head, int pos, int element) {
        if (pos == 0) {
            node<Integer> newNode = new node<>(element);
            newNode.next = head;
            return newNode;
        }
        head.next = recursiveInsertLL(head.next, pos - 1, element);
        return head;
    }

    public static node<Integer> takeInput() {
        node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            node<Integer> newNode = new node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next; // also can use this for this line --> tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void recursivePrintLL(node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        recursivePrintLL(head.next);
    }
}