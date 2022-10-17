import java.util.ArrayList;
import java.util.List;

// I used JDK 17 for this project

public class QuestionOne
{
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        int sum = 0;
        myList.add(5);
        myList.add(3);
        myList.add(6);
        myList.add(2);
        myList.add(4);

        Integer array[] = new Integer[myList.size()];
        myList.toArray(array);

        System.out.println(calculateListForLoop(myList, sum));
        System.out.println(calculateListWhileLoop(myList, sum));
        System.out.println(calculateListRecursion(array, array.length - 1));

    }

    public static int calculateListForLoop(List list, int sum) {
        sum = 0;
        for (int i=0;i<list.size();i++) {
            sum += (int) list.get(i);
        }
        return sum;
    }

    public static int calculateListWhileLoop(List list, int sum) {
        sum = 0;
        int i = 0;
        while (i < list.size()) {
            sum += (int) list.get(i);
            i++;
        }
        return sum;
    }

    public static int calculateListRecursion(Integer[] arrayList, int count) {
        if (count == 0) {
            return arrayList[count];
        } else {
            return arrayList[count] + calculateListRecursion(arrayList, count - 1);
        }
    }
}
