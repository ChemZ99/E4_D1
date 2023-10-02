import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("scrivi qualcosa");
        String text1 = input.nextLine();
        System.out.println("hai scritto" + text1);
        System.out.println("ora scrivi un numero");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("hai scritto" + num1);
        System.out.println("scrivi qualcos'altro");
        String text2 = input.nextLine();
        System.out.println("hai scritto" + text2);
        System.out.println("risultato"+text1+num1+text2);
        System.out.println("risultato invertito"+text2+num1+text1);
        input.close();
    }
}
