import java.util.Scanner;
public class fatorial {
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
			double x,f; 
			System.out.println("digite o numero que vc quer saber o fatorial dele");
			f= in.nextDouble();
			x=f;
			
			while (x > 1){ 

				f = f *(x-1); 
				x--; 
				System.out.println(x+","+f);
     }
			in.close();
 }
}