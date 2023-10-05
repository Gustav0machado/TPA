
public class altura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        double altJ = 1.34;
		        double altP = 1.45;
		        int anos = 0;

		        while (altJ <= altP) {
		            altJ += 0.025;
		            altP += 0.02;
		            anos++;
		        }

		        System.out.println("Demorará " + anos + " anos para João ficar mais alto que Pedro.");


	}

}
