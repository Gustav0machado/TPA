import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        double resultado = 1;

        while (expoente > 0) {
            resultado *= base;
            expoente--;
        }

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}
