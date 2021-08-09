import task3.Sets;

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


        /*
        
         */


    }
}
