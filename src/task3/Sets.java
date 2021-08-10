package task3;

import java.util.*;

public class Sets {

    public static final Set<String> ORIGINAL_HASH_SET = new HashSet<>();
    public static final Set<String> ORIGINAL_LINKED_HASH_SET = new LinkedHashSet<>();
    public static final Set<String> ORIGINAL_TREE_SET = new TreeSet<>();

    static {
        for (int i = 0; i < Countries.DATA.length; i++) {
            ORIGINAL_LINKED_HASH_SET.add(Countries.DATA[i][0] + " " + Countries.DATA[i][1]);
        }
        ORIGINAL_HASH_SET.addAll(ORIGINAL_LINKED_HASH_SET);
        ORIGINAL_TREE_SET.addAll(ORIGINAL_LINKED_HASH_SET);

    }

    private Set<String> hashSet = new HashSet<>();
    private Set<String> linkedHashSet = new LinkedHashSet<>();
    private Set<String> TreeSet = new TreeSet<>();

    public static void insertCountries(Set<String> set) {
        set.addAll(ORIGINAL_LINKED_HASH_SET);
    }


    public static List<String> names(int n) {
        List<String> names = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            names.add(Countries.DATA[i][0] + " " + Countries.DATA[i][1]);
        }
        return names;
    }


    public Set<String> getHashSet() {
        return hashSet;
    }

    public Set<String> getLinkedHashSet() {
        return linkedHashSet;
    }

    public Set<String> getTreeSet() {
        return TreeSet;
    }
}
