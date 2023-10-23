package switchcase;
import java.util.Scanner;
public class meses {
	 public static void main(String[] args) {
		 
		 Scanner in = new Scanner(System.in);
		 int mes;
		 System.out.print("Digite o mes que vc quer saber 1 a 12 ");
		 	mes = in.nextInt();
         switch(mes) {
         	case 1:
         	case 3:
         	case 5:
         	case 7:
         	case 8:
         	case 10:
         	case 12:
         		System.out.println("o mes tem 31 dias");
         	break;
         	case 2:
         		System.out.println("o mes tem 28 dias");
         	break;
         	case 4:
         	case 6:
         	case 9:
         	case 11:
         		System.out.println("o mes tem 30 dias");
         	break;
         	default:
         		System.out.println("mes invalido");
      
	 }
         in.close();
}
}