// Find the sum of all the multiples of 3 and 5 from below 1000
public class Problem1 {

	public static void main(String[] args) {
		 int x = 3;
		 int y = 5;
		 int z = 0;
		 
		for(int i = 1; i < 1000; i++){
//			System.out.println(i);
			if( i % x == 0){
				z = i + z;
//				System.out.println("Three is true");
			}
			if( i % y == 0){
				z= i + z;
//				System.out.println("five is true");
			}
			if( i % y == 0 && i % x == 0){
				z = z - i;	
			}	
		}

		System.out.println(z);
	}

}
