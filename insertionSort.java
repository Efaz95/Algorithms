import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int nums[] = {7,2,4,6,8,0,9,3};
	    System.out.println("Unsorted: "+Arrays.toString(nums));
	    insertionSort(nums);
		System.out.println("Sorted: "+Arrays.toString(nums));
	}
	
	static void insertionSort(int list1[]){
	    int n = list1.length;
	    for(int i=1; i<n; i++){
	        int value = list1[i];
	        int j = i;
	        while (j>0 && value<list1[j-1]){
	            list1[j] = list1[j-1];
	            j = j-1;
	        }
	        list1[j] = value;
	    }
	}
}
