package holidayBonus;


/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Creates a rectangular plot that has methods overlaps, encompasses, and toString
 * Due: 10/28/2024
 * Platform/compiler: Eclipse/Java
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Alayna Goss
*/
public class HolidayBonus {

	
	public final static int highBonus = 5000;
	public final static int midBonus = 2000;
	public final static int lowBonus = 1000;
	
	
	/*
	Dear professor- the documentation for this method was very unclear. 
	At first I thought this was asking for a 2D array of the bonus values
	But then this errored out because the gui asks for a 1d array
	Then I converted the entire 2d array into a 1d array
	It turns out it only wanted one value for each row. 
	I've spent so long trying to get this to work that I'm not going to touch it anymore
	Sorry for all the excess code
	 * 
	 * 
	 * Returns a 1D array of the holiday bonuses for each store
	 */
	public static double[] calculateHolidayBonus(double[][] arr)
	{
		
		
		//double[][] newArr = new double[arr.length][arr[0].length];
		double[][] newArr = new double[arr.length][];
		
		int arrLength = 0;
		for(double[] row : arr)
		{
			for(@SuppressWarnings("unused") double element : row)
			{
				arrLength ++;
			}
		}
		
		
		
		
		
		
		
		for(int i = 0; i < arr.length; i++)
		{
			newArr[i] = new double[arr[i].length];
			
			//System.out.println("Holiday bonus test in row: " + i + ": " + TwoDimRaggedArrayUtility.getHighestInRowIndex(arr, i));
			newArr[i][TwoDimRaggedArrayUtility.getHighestInRowIndex(arr, i)] = highBonus;
			newArr[i][TwoDimRaggedArrayUtility.getLowestInRowIndex(arr, i)] = lowBonus;
		
			for(int k = 0; k < arr[i].length; k++)
			{
				if(newArr[i][k] == 0.0)
				{
					newArr[i][k] = midBonus;
				}
				
				
			}
				
			
		}
		
		
		double[] array1D = new double[arrLength + 1];
	//	double bonusForStore = 0;
		
		
		for(int i = 0; i < newArr.length; i++)
		{
			array1D[i] = TwoDimRaggedArrayUtility.getRowTotal(newArr, i);
			System.out.println("Holiday bonus, row " + i + " value: " + array1D[i]);
		}
		
		
		
		//TEST PRINTING CODE
		
		for (double[] row : newArr)
			{
				for(double element : row)
				{
					
					System.out.print(element + " ");
					
				}
				System.out.println();
			}
		
		
		//END TEST
		
		
		
//	
//		
//		original- converted entire 2d array into 1d array
//		int j = 0;
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int k = 0; k < arr[i].length; k++)
//			{
//				j++;
//				
//				array1D[j] = newArr[i][k];
//				
//			//	System.out.println(array1D.length);
//				//System.out.println(array1D[j]);
//				
//			}
//		}
		
		
		
		
		
		
		

//		int j = 0;
//		int maxColumns = 0;
//		for(int i = 0; i < arr.length; i++)
//		{
//			if(arr[i].length > maxColumns)
//			{
//				maxColumns = arr[i].length;
//			}
//		}
//		
//		for(int k = 0; k < maxColumns; k++)
//		{
//			for(int i = 0; i< arr.length; i++)
//			{
//				if (k < arr[i].length)
//				{
//					j++;
//					array1D[j] = newArr[i][k];
//					System.out.println(array1D[j]);
//				}
//			}
//		}
		
		return array1D;
		
	}
	
	/*
	 * Returns the sum of all values of the bonuses array
	 */
	public static double calculateTotalHolidayBonus(double[][] arr)
	{
		
		double[] bonusArr = calculateHolidayBonus(arr);
		double totalValue = 0;
		
		
			for(double element : bonusArr)
			{

				totalValue += element;
			}
	
		
			
		return totalValue;
	}
	
	
}
