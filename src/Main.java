import task3.Sets;
import task7.ArrayAndLikedList;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*
        Exercise 3: (1) Using Countries, fill a Set multiple times with the same data and verify
        that the Set ends up with only one of each instance. Try this with HashSet,
        LinkedHashSet, and TreeSet.
         */

        Sets sets = new Sets();

        for (int i = 0; i < 5; i++) {
            Sets.insertCountries(sets.getHashSet());
            Sets.insertCountries(sets.getTreeSet());
            Sets.insertCountries(sets.getLinkedHashSet());
        }

        System.out.println(Sets.ORIGINAL_LINKED_HASH_SET.equals(sets.getLinkedHashSet()));
        System.out.println(Sets.ORIGINAL_TREE_SET.equals(sets.getTreeSet()));
        System.out.println(Sets.ORIGINAL_HASH_SET.equals(sets.getHashSet()));


        System.out.println();

        /*
        Exercise 7: (4) Create both an ArrayList and a LinkedList, and fill each using the
        Countries.names( ) generator. Print each list using an ordinary Iterator, then insert one
        list into the other by using a ListIterator, inserting at every other location. Now perform the
        insertion starting at the end of the first list and moving backward.
         */


        ArrayAndLikedList arrayAndLikedList = new ArrayAndLikedList();


        arrayAndLikedList.printList();

        System.out.println();

        arrayAndLikedList.insertAListInLList();

        System.out.println(arrayAndLikedList.getAList());
        System.out.println(arrayAndLikedList.getLList());

        arrayAndLikedList.reverseInsert();

        System.out.println(arrayAndLikedList.getAList());
        System.out.println(arrayAndLikedList.getLList());


        System.out.println();



        /*

         */
























    }
}
