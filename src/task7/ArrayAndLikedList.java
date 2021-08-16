package task7;

import task3.Sets;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ArrayAndLikedList {
    // I can don't use Countries.names() because I've Sets.names()
    private List<String> AList = new ArrayList<>(Sets.names(5));
    private List<String> LList = new LinkedList<>(Sets.names(3));
    private ListIterator<String> LListIterator = LList.listIterator();
    private ListIterator<String> AListIterator = AList.listIterator();


    public void printList() {
        iterator(AList.iterator());

        iterator(LList.iterator());
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


    private static void iterator(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}

