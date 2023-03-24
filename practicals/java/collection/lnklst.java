import java.util.*;
class lnklst {
    public static void main(String[] args) {
        // create a LinkedList of integers
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // print the elements of the LinkedList using ListIterator
        ListIterator<Integer> itr = linkedList.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // add an element to the beginning of the LinkedList
        linkedList.addFirst(5);

        // remove an element from the LinkedList
        linkedList.removeLast();

        // print the updated LinkedList using for-each loop
        for (int num : linkedList) {
            System.out.println(num);
        }
    }
}
