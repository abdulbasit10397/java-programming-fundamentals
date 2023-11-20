package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
	
	public static int linearSearch(int[] array, int key)
	{
		int result=-1;
		for(int i=0; i<5; i++)
		{
			if(array[i]==key)
				result=i;
		}
		
		return result;
	}
	
	public static int binarySearch(int[] array, int key)
	{
		int first, last, mid;
		first=0;
		last=array.length-1;
		mid=(first+last)/2;
		while(first<=last)
		{	
			mid=(first+last)/2;
			if(array[mid]==key)
			{
				return mid;
			}
			else if(array[mid]<key)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
			
		}
		
		return -1;
	}


	public static void main(String[] args) {
		//Method 1 to declare and initialize an array
//		int[] numbers= new int[5];
//		numbers[0]=10;
//		numbers[1]=15;
//		numbers[2]=203;
//		numbers[3]=35;
//		numbers[4]=545;
		
		//Method 2 to declare and initialize an array
		 int[] array= {10, 15, 304, 43,23,435,323,45,65,45};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number to search: ");
		int key= sc.nextInt();
		Arrays.sort(array);
		int searchResult=binarySearch(array,key);
		if(searchResult==-1)
		{
			System.out.println("Number is not found");
		}
		else
		{
			System.out.println("Number "+array[searchResult]+" is found at Index: " + (searchResult+1));
		}
		

	}

}
