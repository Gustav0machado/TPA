public class expoVe {
	public static void main(String[] args) {
		final int TAM = 11;
		int a[],i, b = 0,  base= 2, k;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			a[i] = b;
			b += 1;
		}
		
		
		for(i=0; i<TAM; i++) {
			
			if(a[i] == 0) {
				System.out.print("1, ");
			} else if(a[i] == 1) {
				System.out.print("2, ");
			} else {
				for(k=1; k<a[i]; k++) {
					base = base * 2;
				}
				System.out.print(base+", ");
				base=2;
			}
		}	

		
	}
}