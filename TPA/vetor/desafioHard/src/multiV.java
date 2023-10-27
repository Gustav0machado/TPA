import java.util.Scanner;
public class multiV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAM=5;
		int i,a[];
		a=new int[TAM];
		int n,m;
		Scanner ler= new Scanner(System.in);
		for(i=0;i<TAM;i++) {
			System.out.println("digite os valores que voce quer as tabuadas");
			a[i]=ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.print("a tabuada");
		for(n=0;n<=10;n++) {
			m=a[i]*n;
			System.out.print(m+" ");
		}
	
		System.out.print(n+" ");
		}
		
	}

}
