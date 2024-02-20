import java.util.Scanner;
public class fatorVe {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 15;
        int a[], b[], i, r;

        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor do vetor A: ");
            a[i] = ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {
           r=1;
            for (int j = 2; j <= a[i]; j++) {
                r*= j;
            }
            b[i] = r;
        }


        System.out.print("a= ");
        for (i = 0; i < TAM; i++) {
            if (i == (TAM - 1)) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }

        System.out.print("b= ");
        for (i = 0; i < TAM; i++) {
            if (i == (TAM - 1)) {
                System.out.print(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }
        ler.close();
    }
}
