package switchcase;
import java.util.Scanner;
public class decisaoSwitch {

	public static void main(String[] args) {
	int placa;	
	Scanner ler =new Scanner(System.in);
	System.out.println("coloque o ultimo numero da placa do carro");
	placa = ler.nextInt();
	switch (placa) {
		case 1:
		case 2:
			System.out.println("seu carro não pode rodar segunda");
			break;
		case 3:
		case 4:
			System.out.println("seu carro não pode rodar terça");
			break;
		case 5:
		case 6:
			System.out.println("seu carro não pode rodar na quarta");
			break;
		case 7:
		case 8:
			System.out.println("seu carro não pode rodar quinta");
			break;
		case 9:
		case 0:
			System.out.println("seu carro não pode rodar sexta");
			break;
		default:
			System.out.println("final invalido");
			
		ler.close();
	}
	
	}

}
