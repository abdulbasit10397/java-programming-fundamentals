package arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int[][] array= {{12,23,54},{43,54,323},{76,23,55}};
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
