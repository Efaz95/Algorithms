public class PerfectSquare {
	
	public static void main(String[] args) {
		
		//Testing the result
		for(int i=0; i<=50; i++) {
			if(isPerfectSquare(i)) {
				System.out.println(i + " is a perfect square");
			}else {
				System.out.println(i + " is Not a perfect square");
			}		
		}
	}
	
	//Time complexity for this algorithm is O(log n)
	public static boolean isPerfectSquare(int num) {
		 
		int low = 0;
		int high = num;
		while( low<=high ) {
			 int mid = low + (high-low)/2;
			 
			 if (mid*mid == num) {
				 return true;
			 } else if (mid*mid > num) {
				 high = mid - 1;
			 } else {
				 low = mid + 1;
			 }
		 }
		return false;
	}
	
}
