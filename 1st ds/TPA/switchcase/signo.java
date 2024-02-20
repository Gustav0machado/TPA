package switchcase;
import java.util.Scanner;

public class signo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes;
        String signo;

        System.out.print("Digite o dia do nascimento (1-31): ");
        dia = scanner.nextInt();

        System.out.print("Digite o mês do nascimento (1-12): ");
        mes = scanner.nextInt();

        switch (mes) {
            case 1:
                if (dia >= 20) {
                    signo = "Aquário";
                } else {
                    signo = "Capricórnio";
                }
                break;
            case 2:
                if (dia <= 18) {
                    signo = "Aquário";
                } else {
                    signo = "Peixes";
                }
                break;
            case 3:
                if (dia >= 21) {
                    signo = "Áries";
                } else {
                    signo = "Peixes";
                }
                break;
            case 4:
                if (dia <= 19) {
                    signo = "Áries";
                } else {
                    signo = "Touro";
                }
                break;
            case 5:
                if (dia >= 21) {
                    signo = "Gêmeos";
                } else {
                    signo = "Touro";
                }
                break;
            case 6:
                if (dia <= 20) {
                    signo = "Gêmeos";
                } else {
                    signo = "Câncer";
                }
                break;
            case 7:
                if (dia >= 23) {
                    signo = "Leão";
                } else {
                    signo = "Câncer";
                }
                break;
            case 8:
                if (dia <= 22) {
                    signo = "Leão";
                } else {
                    signo = "Virgem";
                }
                break;
            case 9:
                if (dia >= 23) {
                    signo = "Virgem";
                } else {
                    signo = "Libra";
                }
                break;
            case 10:
                if (dia <= 22) {
                    signo = "Libra";
                } else {
                    signo = "Escorpião";
                }
                break;
            case 11:
                if (dia >= 22) {
                    signo = "Escorpião";
                } else {
                    signo = "Sagitário";
                }
                break;
            case 12:
                if (dia <= 21) {
                    signo = "Sagitário";
                } else {
                    signo = "Capricórnio";
                }
                break;
            default:
                signo = "Mês inválido";
                break;
        }

        System.out.println("O signo do zodíaco da pessoa é: " + signo);

        scanner.close();
    }
}
