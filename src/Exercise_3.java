import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("primo lato del rettangolo");
        double l1 = Integer.parseInt(input.nextLine());
        System.out.println("secondo lato del rettangolo");
        double l2 = Integer.parseInt(input.nextLine());
        System.out.println("il perimetro del rettangolo e' " + rectangleArea(l1,l2));
        System.out.println("scrivi un numero qualsiasi");
        int num1 = Integer.parseInt(input.nextLine());
        oddOrEven(num1);
        System.out.println("primo lato del triangolo");
        double l3 = Integer.parseInt(input.nextLine());
        System.out.println("secondo lato del triangolo");
        double l4 = Integer.parseInt(input.nextLine());
        System.out.println("terzo lato del triangolo");
        double l5 = Integer.parseInt(input.nextLine());
       Erone(l3,l4,l5);
        input.close();
    }
    public static double rectangleArea(double l1, double l2) {
        return (l1*2)+(l2*2);
    }
    public static void oddOrEven (int num1) {
        if (num1%2 == 0) {
            System.out.println("il numero e' pari, code 0");
        }
        else {
            System.out.println("il numero e' dispari, code 1");
        }
    }
    public static void Erone (double l1,double l2, double l3) {
        double p = (l1+l2+l3)/2;
        double result = Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
        System.out.println("l' area del triangolo e' "+ result);
    }
}
