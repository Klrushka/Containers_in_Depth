package task7;

import task3.Sets;


import java.util.*;

public class ArrayAndLikedList {
    // I can don't use Countries.names() because I've Sets.names()
    private List<String> aList = new ArrayList<>(Sets.names(5));
    private List<String> lList = new LinkedList<>(Sets.names(3));
    private ListIterator<String> lListIterator = lList.listIterator();
    private ListIterator<String> aListIterator = aList.listIterator();


    public void printList() {
        iterator(aList.iterator());

        iterator(lList.iterator());
    }


    public void insertAListInlList() {

        while (aListIterator.hasNext()) {
            lListIterator.add(aListIterator.next());
        }
    }


    public void reverseInsert() {

        while (aListIterator.hasNext() || lListIterator.hasNext()){
            if (aListIterator.hasNext()) aListIterator.next();
            if (lListIterator.hasNext()) lListIterator.next();
        }

        while (aListIterator.hasPrevious()) {
            lListIterator.add(aListIterator.previous());
        }
    }

    public List<String> getAList() {
        return aList;
    }

    public List<String> getLList() {
        return lList;
    }


    private static void iterator(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}

