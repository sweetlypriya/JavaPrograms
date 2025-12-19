package programs;

import java.util.Arrays;

public class SmallestLargest {

	public static void main(String[] args) {
		
		int[] num= {67,32,6,987,145};
		
		int smallest=num[0];
		int largest=num[0];
		
		for(int i=1;i<num.length-1;i++) {
			if(num[i]<smallest) {
				smallest=num[i];
			}else if(num[i]>largest) {
				largest=num[i];
			}
		}
		System.out.println("array of numbers: "+Arrays.toString(num));
		System.out.println("Smallest number is: "+smallest);
		System.out.println("Largest number is: "+largest);

	}

}
