import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
		int i,id,ps,maI,meI;
		i=1;
		maI=0;
		meI=0;
		Scanner in = new Scanner(System.in);
		System.out.println("digite o numero de pessoas");
		ps=in.nextInt();
		while(i<=ps) {
			System.out.println("digite sua idade");
			id=in.nextInt();
			if(id<18) {
				maI+=1	;
			}else {
				meI+=1;
			}
			i+=1;
		}
		System.out.println("A quantidade de maiores de idade é: "+maI);
		System.out.println("e de menores é:"+meI);
		in.close();
	}
}
