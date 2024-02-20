package switchcase;

import java.util.Scanner;

public class cantina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o código do produto (ou 0 para sair): ");
            int codigo = scanner.nextInt();

            switch (codigo) {
                case 1:
                    System.out.println("Descrição: Cachorro quente");
                    System.out.println("Valor: R$ 8,00");
                    break;
                case 2:
                    System.out.println("Descrição: Cheeseburger");
                    System.out.println("Valor: R$ 12,00");
                    break;
                case 3:
                    System.out.println("Descrição: X-Salada");
                    System.out.println("Valor: R$ 15,00");
                    break;
                case 4:
                    System.out.println("Descrição: Misto Quente");
                    System.out.println("Valor: R$ 11,00");
                    break;
                case 5:
                    System.out.println("Descrição: Pão na chapa");
                    System.out.println("Valor: R$ 6,00");
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o programa!");
                    return;
                default:
                    System.out.println("Código de produto inválido.");
            }
        }
    }
}

