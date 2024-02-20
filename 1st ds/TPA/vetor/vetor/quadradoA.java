import java.util.Scanner;
public class quadradoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
		final int TAM=10;
		int i;
		int a[],b[];
		a=new int [TAM];
		b=new int [TAM];
		
			for(i=0;i<TAM;i++) {
				System.out.println("Digite o "+(i+1)+" valor do vetor a");
				a[i]=ler.nextInt();
				
			}
			System.out.print("b[]=[ ");
			
			for(i=0;i<TAM;i++) {
				b[i]=a[i]*a[i];
				
				System.out.print(b[i]+" " );
				
			}
			
			System.out.print(" ]");
			
	ler.close();
	}

}
