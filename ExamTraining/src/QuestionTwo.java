import java.util.*;
import java.util.Iterator;

class QuestionTwo {

    public static void mergedLists(List<String> list1, List<String> list2) {
        int i = 0;
        int j = 0;
        Iterator iterator;
        List<String> merged_list = new ArrayList<String>();
        while (i < list1.size() && j < list2.size()) {
            merged_list.add(list1.get(i));
            merged_list.add(list2.get(j));
            i++;
            j++;
        }

        while (i < list1.size()) {
            merged_list.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            merged_list.add(list2.get(j));
            j++;
        }

        System.out.println();
        System.out.print("Merged List contents: ");

        iterator = merged_list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static void main(String[] args)
    {

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        System.out.print("List1 contents: ");
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        System.out.print("List2 contents: ");
        iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        mergedLists(list1, list2);
    }
}
