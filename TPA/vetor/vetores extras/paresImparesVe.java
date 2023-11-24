import java.util.Scanner;

public class paresImparesVe{
    public static void main(String[] args) {
        final int TAM = 20;
        int a[]  = new int[TAM];
        int b[] = new int[TAM];
        int i,indiceB = 0;
     
       Scanner ler = new Scanner(System.in);

       
        for (i = 0; i < TAM; i++) {
        	System.out.print("Digite o valor " + (i + 1) + "º: ");
            a[i] = ler.nextInt();
           	}


        for (i = 0; i < TAM; i++) {
            if (a[i] % 2 == 0) {
                b[indiceB] = a[i];
                indiceB++;
            }
        }

        for (i = 0; i < TAM; i++) {
            if (a[i] % 2 != 0) {
                b[indiceB] = a[i];
                indiceB++;
            }
        }

        
        System.out.println("numeros (pares e ímpares separados):");
        for ( i = 0; i < TAM; i++) {
            System.out.print(b[i] + " ");
        }
        ler.close();
    }
}
