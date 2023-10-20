import java.util.Scanner;
public class somaVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler=new Scanner(System.in);
		final int TAM=10;
		int a[],b[],c[],i;
		a=new int [TAM];
		b=new int [TAM];
		c=new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor a");
			a[i]=ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor b");
			b[i]=ler.nextInt();
		}
		
		System.out.print("a[]=[ ");
		
		for(i=0;i<TAM;i++) {
			
			System.out.print(a[i]+" " );
			
		}
		
		System.out.print(" ]");
		System.out.println(" ");
		
		System.out.print("b[]=[ ");
		
		for(i=0;i<TAM;i++) {
			
			
		System.out.print(b[i]+" " );
			
		}
		
		System.out.print(" ]");
		
		System.out.println(" ");
		
		System.out.print("c[]=[ ");
		
		for(i=0;i<TAM;i++) {
			c[i]=a[i]+b[i];
			
			System.out.print(c[i]+" " );
			
		}
		
		System.out.print(" ]");
		
ler.close();
	}
}