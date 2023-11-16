import java.util.Scanner;
public class media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler=new Scanner(System.in);
		final int TAM=10;
		int i;
		double soma = 0;
		double media;
		double a[];
		a=new double[TAM];
		
		
		for(i=0;i<TAM;i++) {
			System.out.println("digite o "+(i+1)+"º valor :");
			a[i]=ler.nextDouble();
			soma+=a[i];
		}
		media=soma/10;
		System.out.println("a media é "+media);
	ler.close();
		
	}

}
