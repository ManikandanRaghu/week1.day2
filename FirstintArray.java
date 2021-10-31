package week1.day2;

import java.util.Arrays;

public class FirstintArray {

	public static void main(String[] args) {
		int arr[]= {100,49,398,34,1,267};
		int lenArray=arr.length;
		for(int i=0;i<lenArray;i++)
		{
			System.out.println("Array Value["+i+"]: "+arr[i]);
		}
		System.out.println("-------------------");
		Arrays.sort(arr);
		for(int i=0;i<lenArray;i++)
		{
			System.out.println("Array Value["+i+"]: "+arr[i]);
		}
		System.out.println("---------------------");
		System.out.println("Second smallest number of the array is: "+arr[1]);
		System.out.println("Second largest number of the array is: "+arr[lenArray-2]);
		
	}

}
