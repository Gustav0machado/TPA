
public class dobroMa {
    public static void main(String[] args) {
        int l = 4, c = 4,val = 2;
        int v[][] = new int[l][c];
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                v[i][j] = val;
                val *= 2;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.print("[ ");
            for (int j = 0; j < 4; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.print(" ]");
        }
    }
}