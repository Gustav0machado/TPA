package switchcase;
import java.util.Scanner;

public class dentedeleite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        System.out.print("Digite a idade do aluno: ");
        idade = in.nextInt();
        
        String categoria;
        
        switch (idade) {
            case 6:
                categoria = "dente de leite";
                break;
            case 7:
                categoria = "júnior";
                break;
            case 8:
                categoria = "júnior max";
                break;
            case 9:
                categoria = "júnior master";
                break;
            case 10:
                categoria = "master";
                break;
            default:
                categoria = "Categoria não encontrada";
        }
        
        System.out.println("O aluno está na categoria: " + categoria);
        
        in.close();
    }



	}


