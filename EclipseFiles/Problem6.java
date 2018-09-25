//Find the difference between the sum of the squares of the first one 
//hundred natural numbers and the square of the sum.
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=0;
		int j=0;
		int k=0;
		
		for(int i=1; i<=100; i++){
	        z=z+(i*i);
		}
		
		for (int i=1; i<=100; i++){
			j= j+i;
		}
		k=j*j;

		System.out.println(k-z);
	}

}
