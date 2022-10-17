import java.util.ArrayList;
import java.util.List;

public class QuestionThree
{
    static int n1=0,n2=1,n3=0;
    static List<Integer> myList = new ArrayList<>();
    public static void Fibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            myList.add(n3);
            Fibonacci(count-1);
        }
    }

    public static void main(String[] args) {
        Fibonacci(100);
        for (Integer integer : myList) {
            System.out.print(" " + integer);
        }
    }
}
