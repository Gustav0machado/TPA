import java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=1, n, r;
		System.out.println("entre com o numero que voce quer a tabuada");
		n = in.nextInt();
		while(i<=10) {
			r = n*i;
			System.out.println(n+ " x "+i+" = "+r);
			i++;
		}
			in.close();
	}

}