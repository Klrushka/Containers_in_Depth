package task7;

import task3.Sets;

import java.util.*;

public class ArrayAndLikedList {
    // I can don't use Countries.names() because I've Sets.names()
    private List<String> AList = new ArrayList<>(Sets.names(5));
    private List<String> LList = new LinkedList<>(Sets.names(3));
    private ListIterator<String> LListIterator = LList.listIterator();
    private ListIterator<String> AListIterator = AList.listIterator();
    private Iterator<String> AIterator = AList.iterator();
    private Iterator<String> LIterator = LList.iterator();

    public void printList() {
        while (AIterator.hasNext()) {
            System.out.println(AIterator.next());
        }
        while (LIterator.hasNext()) {
            System.out.println(LIterator.next());
        }
    }


    public void insertAListInLList() {

        while (AListIterator.hasNext()) {
            LListIterator.add(AListIterator.next());
        }
    }


    public void reverseInsert() {

        while (AListIterator.hasNext()) AListIterator.next();
        while (LListIterator.hasNext()) LListIterator.next();
        while (AListIterator.hasPrevious()) {
            LListIterator.add(AListIterator.previous());
        }
    }

    public List<String> getAList() {
        return AList;
    }

    public List<String> getLList() {
        return LList;
    }
}
