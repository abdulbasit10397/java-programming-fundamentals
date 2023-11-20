package arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] array)
	{
		int temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length-i-1; j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		showArray(array);
	}
	
	public static void optimizedBubbleSort(int[] array)
	{
		int temp;
		boolean swap;
		for(int i=0; i<array.length; i++)
		{
			swap=false;
			for(int j=0; j<array.length-i-1; j++)
			{
				//Compare adjacent elements
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					swap=true;
				}
			}
			
			// IF no elements were  
            // swapped by inner loop, then break 
			if(swap==false)
				break;
		}
		showArray(array);
	}
	
	public static void showArray(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+ " ");
		}
		
	}

	public static void main(String[] args) {
		int[] array= {10, 15, 304, 43,23,435,323,45,65,45};
		bubbleSort(array);
		//Built in method
		//Arrays.sort(array);
	}

}
