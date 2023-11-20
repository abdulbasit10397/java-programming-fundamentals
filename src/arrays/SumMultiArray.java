package arrays;

public class SumMultiArray {

	public static void main(String[] args) {
		int a[][]= {{3,6,9},{1,2,3}};
		int b[][]= {{1,3,9},{3,4,5}};
		int sum[][]= new int[2][3];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				sum[i][j]=a[i][j]+ b[i][j];
				System.out.print(sum[i][j]+ " ");
			}
			
			System.out.println();
		}

	}

}
