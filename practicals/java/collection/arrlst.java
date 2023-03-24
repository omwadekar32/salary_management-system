import java.util.*;
class arrlst {
    public static void main(String[] args) {
        // create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // add some elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // print the elements of the ArrayList using for-each loop
        for (int number : numbers) {
            System.out.println(number);
        }

        // print the elements of the ArrayList using Iterator
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // remove an element from the ArrayList
        numbers.remove(2);

        // print the updated ArrayList
        System.out.println(numbers);
    }
}
