package day13_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetAndList {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("A");
        set.add("B");
        set.add("C");
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Object value = iter.next();
            System.out.println(value);
        }
        System.out.println("-----------------");
        List list = new ArrayList();
        list.add(100);
        list.add(90);
        list.add(100);
        ListIterator listIter = list.listIterator();
        while (listIter.hasNext()) {
            int idx = listIter.nextIndex();
            Object value = listIter.next();
            System.out.println(idx + ":" + value);
        }
        while (listIter.hasPrevious()) {
            int idx = listIter.previousIndex();
            Object value = listIter.previous();
            System.out.println(idx + ":" + value);
        }
        
        
    }
}
