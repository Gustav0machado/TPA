import java.util.Scanner;
	public class primoVe {
		
    public static void main(String[] args) {
    	final int TAM=10;
        int A[] = new int[TAM];
 
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros:");
 
        for (int i = 0; i <TAM; i++) {
            System.out.print((i+1)+"° numero : ");
            A[i] =ler.nextInt();
        }
 
        ler.close();
 
        for (int i = 0; i <TAM; i++) {
            int num = A[i];
 
            boolean Primo = Primo (num);
            System.out.println(num + ": " + (Primo ? "Primo" : "Não primo"));
        }
    }
 
    static boolean Primo(int numero) {
        if (numero <= 1) {
            return false;
        }
 
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
 
        return true;
    }
}
