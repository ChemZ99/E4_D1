
import java.util.Arrays;

public class Exercise_1 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 7;
        String text1 = "stringa stampata con numero di seguito:";
        int num3 = 99;
        String[] Arr = {"test 0","test 1","test 2","test 3","test 4",};
        String text2 = "added array element";

        int x = product(num1,num2);
        System.out.println(x);
        printProduct(num1,num2);
        printString(text1, num3);
        String[] newArr = createNewArray(Arr,text2);
        System.out.println(Arrays.toString(newArr));
    }
    public static int product(int n1, int n2) {
        return n1 * n2;
    }
    public static void printProduct(int n1, int n2) {
        System.out.println("il risultato e':" + (n1*n2));
    }
    public static void printString(String t1, int n1) {
        System.out.println(t1 + n1);
    }
    public static String[] createNewArray(String[] a1, String t1) {
        String[] newArr;
        newArr = new String[]{a1[0], a1[1], a1[2], t1, a1[3], a1[4]};
        return newArr;
    }
}
