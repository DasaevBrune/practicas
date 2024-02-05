import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese número: ");
        int num = scanner.nextInt();

        long result = calFactorial(num);
        System.out.println(" = " + result);

    }
    public static long calFactorial(int n){
        if (n < 0){
            return -1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.print(i + " * ");
        }

        return factorial;
    }
}
