import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemos {

    public static void main(String[] args) {

        List<Integer> list = null;
        list = refreshList();
        printList(list);
        removeEverything(list);
        printList(list);
        List newList = copyList(refreshList());
        printList(newList);
        newList.remove(0);
        printList(newList);
        System.out.println(newList.contains(5));
        System.out.println(containsFive(newList));
        System.out.println(printBackwards(newList));
        System.out.println(divisibleByTwo(newList));
        System.out.println(splice(newList));



    }

    private static List splice(List list) {

        List splicedList = new ArrayList();


        // Iterate in reverse.
        for (int i = 0; i < list.size(); i++) {
            if(i> 2 && i < 8) {
                splicedList.add(i);
            }
        }
        return splicedList;
    }

    private static List divisibleByTwo(List list) {

        List divisibleByTwo = new ArrayList();


        // Iterate in reverse.
        for (int i = 0; i < list.size(); i++) {
            if(i % 2 == 0) {
                divisibleByTwo.add(i);
            }
        }
        return divisibleByTwo;
    }

    private static List printBackwards(List list) {

        List backwardsList = new ArrayList();


        ListIterator li = list.listIterator(list.size());

        // Iterate in reverse.
        while(li.hasPrevious()) {
            backwardsList.add(li.previous());
        }
        return backwardsList;
    }



    private static boolean containsFive(List list) {
        if(list.contains(5)) {
            return true;
        }

        return false;
    }

    private static List copyList(List<Integer> list) {

        List<Integer> copy = new ArrayList<Integer>();
        copy.addAll(list);
        return copy;
    }



    private static void printList(List<Integer> list) {

        System.out.println(list.toString());

    }

    private static void removeEverything(List<Integer> list) {

        list.clear();
    }

    private static List<Integer> refreshList() {

        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        return list;
    }
}
