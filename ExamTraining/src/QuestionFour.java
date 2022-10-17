import java.util.*;

public class QuestionFour {
    static void showLargest(Vector<String> arr)
    {

        Collections.sort(arr, (X, Y) -> {
            String XY = X + Y;
            String YX = Y + X;
            return XY.compareTo(YX) > 0 ? -1 : 1;
        });

        for (String s : arr) System.out.print(s);
    }
    public static void main(String[] args)
    {

        Vector<String> arr;
        arr = new Vector<>();

        arr.add("50");
        arr.add("2");
        arr.add("1");
        arr.add("9");
        showLargest(arr);
    }
}
