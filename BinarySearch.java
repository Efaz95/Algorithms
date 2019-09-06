public class BinarySearch {

	// note: we will be using Invariant 4 for all implementations
	
	public static void main(String[] args) {
		
		int nums[] = new int[] { 2, 3, 3, 5, 5, 5, 6, 6 };
		BinarySearch bs = new BinarySearch();
		
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("nums[] contains [" + i + "]:" + bs.contains(nums, 0, nums.length-1, i));
		}
		
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("nums[] first occurence [" + i + "]:" + bs.firstOccurence(nums, 0, nums.length-1, i));
		}
		
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("nums[] last occurence [" + i + "]:" + bs.lastOccurence(nums, 0, nums.length-1, i));
		}
		
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("nums[] least greater [" + i + "]:" + bs.leastGreater(nums, 0, nums.length-1, i));
		}
		
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("nums[] greatest lesser [" + i + "]:" + bs.greatestLesser(nums, 0, nums.length-1, i));
		}
	}
	
	// variant 1: contains
	private boolean contains(int[] nums, int low, int high, int target) {
		
		boolean ans = false;
		while ( low <= high ) {
			
			int mid = low + (high-low)/2;
			
			if ( nums[mid] == target ) {
				ans = true;
				break;
			} else if ( nums[mid] < target ) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return ans;
		
	}
	
	// variant 2: index of first occurrence of a key
	private int firstOccurence(int[] nums, int low, int high, int target) {
		
		int ans = -1;
		while ( low <= high ) {
			
			int mid = low + (high-low)/2;
			
			if ( nums[mid] == target ) {
				ans = mid;
				high = mid-1;
			} else if ( nums[mid] < target ) {
				low = mid+1;
			} else {
				high = mid - 1;
			}
		}
		
		return ans;
		
	}
	
	// variant 3: index of last occurrence of a key
	private int lastOccurence(int[] nums, int low, int high, int target) {
		
		int ans = -1;
		while ( low <= high ) {
			
			int mid = low + (high-low)/2;
			
			if ( nums[mid] == target ) {
				ans = mid;
				low = mid+1;
			} else if ( nums[mid] < target ) {
				low = mid+1;
			} else {
				high = mid - 1;
			}
		}
		
		return ans;
		
	}
	
	// variant 4: index of least element greater than key
	private int leastGreater(int[] nums, int low, int high, int target) {
		
		int ans = -1;
		while ( low <= high ) {
			
			int mid = low + (high-low)/2;
			
			if ( nums[mid] == target ) {
				// since mid is equal to key, all elements in [low, mid] are <= key 
	            // so we now search in [mid + 1, high] 
	            low = mid + 1; 
			} else if ( nums[mid] < target ) {
				// since mid is less than key, all elements in [low, mid] are < key 
	            // so we now search in [mid + 1, high] 
				low = mid+1;
			} else {
				// since mid is greater than key, all elements in [mid + 1, high] are >= key 
	            // we note down the last found index, then we search in [low, mid - 1]
				ans = mid;
				high = mid - 1;
			}
		}
		
		return ans;
		
	}
	
	// variant 5: index of greatest element less than key
		private int greatestLesser(int[] nums, int low, int high, int target) {
			
			int ans = -1;
			while ( low <= high ) {
				int mid = low + (high-low)/2;
				if ( nums[mid] == target ) {
		            high = mid - 1;
				} else if ( nums[mid] < target ) {
					ans = mid;
					low = mid + 1;
				} else {	
					 high = mid -1;
				}
			}
			return ans;
			
		}
}
