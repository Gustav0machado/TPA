import java.util.Random;

public class somaMa {
    public static void main(String[] args) {
        int v[][] = new int[3][3];
        int i, j, ma=-999999,me= 999999;
        Random ale = new Random();

        for(i=0; i<3; i++){
            for(j=0; j<3;j++){
                v[i][j] = ale.nextInt()%50;
            }
        }


        
        for(i=0; i<3; i++){
            for(j=0; j<3;j++){
                if(v[i][j]> ma){
                    ma = v[i][j];
                }
            }
        }

        for(i=0; i<3; i++){
            for(j=0; j<3;j++){
                if(v[i][j] < me){
                    me = v[i][j];
                }
            }
        }

        for (i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("[ ");
            for (j = 0; j < 3; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.print("]");
        }
        System.out.println();
        System.out.println("O maior valor da matriz é: "+ma);
        System.out.println("O menor valor da matriz é: "+me);
    }
}